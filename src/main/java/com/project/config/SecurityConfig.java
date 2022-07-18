package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Use BCrypt as the implementation of PasswordEncoder
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //disable csrf (cross-site request forgery)
                .csrf().disable()
                //authenticate login information
                .formLogin()
                    //if login failed, forward to the signin page
                    .failureForwardUrl("/signin");

        http.authorizeRequests()
                .antMatchers("/order/*", "/cart", "/checkout").hasAuthority("ROLE_USER")
                .anyRequest().permitAll();

    }
}
