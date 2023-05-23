package com.example.backcal.JsonWebToken;

import com.example.backcal.Service.UserDetailsImpl;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtils {

    private static final Logger LOGGER= LoggerFactory
            .getLogger(JwtUtils.class);
    @Value("${jwt.Secret}")
    private String jwtSecret;
    @Value("${jwt.ExpirationMs}")
    private int jwtExpirationMs;



    public String generateJwtToken(Authentication authentication) {

        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }



    public String getUserNameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateJwtToken(String authenToken){
        try {
            Jwts.parser()
                    .setSigningKey(jwtSecret)
                    .parseClaimsJws(authenToken);
            return true;
        }   catch (SignatureException s) {
            LOGGER.error("invalid JWT signature: {}",s.getMessage());
        }   catch (MalformedJwtException m) {
            LOGGER.error("invalid JWT TOKEN: {}",m.getMessage());
        }   catch (ExpiredJwtException e) {
            LOGGER.error("Expired TOKEN:",e.getMessage());
        }   catch (UnsupportedJwtException u) {
            LOGGER.error("unsupported TOKEN",u.getMessage());
        }   catch (IllegalArgumentException i) {
            LOGGER.error("empty claims:",i.getMessage());
        }

        return false;
    }

}
