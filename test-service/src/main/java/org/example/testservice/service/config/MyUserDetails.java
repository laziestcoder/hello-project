//package com.example.testservice.service.config;
//
//import com.example.springsecurityjwt.repository.entity.User;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//
//@NoArgsConstructor
//public class MyUserDetails implements UserDetails {
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    private String userName;
//    private String password;
//    private boolean active;
//    private List<GrantedAuthority> authorities;
//
//    public MyUserDetails(Optional<User> user) {
//        this.userName = user.get().getUserName();
//        this.password = user.get().getPassword();
//        this.active = user.get().isActive();
//        this.authorities = Arrays.stream(user.get().getRoles().split(","))
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        //return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//        //return  bCryptPasswordEncoder.encode(password);
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return active;
//    }
//}
