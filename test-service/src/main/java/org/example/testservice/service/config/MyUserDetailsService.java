//package com.example.testservice.service.config;
//
//
//import com.example.springsecurityjwt.repository.UserRepository;
//import com.example.springsecurityjwt.repository.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
////@Service
////public class MyUserDetailsService implements UserDetailsService {
////
////    @Autowired
////    UserRepository userRepository;
////
////    @Override
////    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
////        // return new MyUserDetails(username);
////        Optional<User> user = userRepository.findByUserName(userName);
////
////        user.orElseThrow(() -> new UsernameNotFoundException("Not found " + userName));
////
////        return new MyUserDetails(user);
////        //return user.map(MyUserDetails::new).get();
////    }
////}
