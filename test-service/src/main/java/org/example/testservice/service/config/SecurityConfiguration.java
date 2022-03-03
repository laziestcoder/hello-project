package org.example.testservice.service.config;


//import com.example.testservice.service.security.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private UserDetailsService userDetailsService;

//    @Autowired
//    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(userDetailsService);
        auth.inMemoryAuthentication()
                .withUser("aumit")
                .password("aumit")
                .roles("USER");
    }


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
        //return new BCryptPasswordEncoder();
    }


    // for authorization
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/", "/authenticate").permitAll()
//                .anyRequest().authenticated()
//                .and().sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////                .and().authorizeRequests()
////                .antMatchers("/admin").hasRole("ADMIN")
////                .antMatchers("/user").hasAnyRole("USER", "ADMIN");
//                //.and().formLogin();
//        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
