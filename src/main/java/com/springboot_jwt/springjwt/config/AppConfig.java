package com.springboot_jwt.springjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService usersDetailService(){

        UserDetails user = User.builder().username("suraj").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
        UserDetails user1= User.builder().username("rishi").password(passwordEncoder().encode("abc")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user,user1);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
