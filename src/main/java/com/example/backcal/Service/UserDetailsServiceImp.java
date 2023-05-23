package com.example.backcal.Service;

import com.example.backcal.Conf.User;
import com.example.backcal.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    UserRepo userRepo;


    public List<User> findAll() {
        return userRepo.findAll();
    }



    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username)
                .orElseThrow(
                        ()-> new UsernameNotFoundException("Cet utilisateur n'existe pas avec ce username"+ username)
                );
        return UserDetailsImpl.build(user);
    }
}
