package br.gov.sp.fatec.springbootapp.security;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().httpBasic().and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    /*
     * @Autowired private UserDetailsService userDetailsService;/*
     * 
     * 
     * @Override public void configure(AuthenticationManagerBuilder auth) throws
     * Exception { http.csrf().disable().http
     * auth.userDetailsService(userDetailsService); }
     * 
     * @Bean
     * 
     * @Override public AuthenticationManager authenticationManagerBean() throws
     * Exception { return super.authenticationManagerBean(); }
     */
}