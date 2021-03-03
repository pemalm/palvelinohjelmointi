package fi.malm.Pelikanta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/listaa", "/css/*").permitAll()
                .antMatchers("/lisaa", "/loginlista", "/muokkaa").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/loginlista", true)
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }


    
	@SuppressWarnings("rawtypes")
	@Bean
    @Override
    public UserDetailsService userDetailsService() {
       
		@SuppressWarnings("unchecked")
		List<UserDetails> users = new ArrayList();
    	@SuppressWarnings("deprecation")
		UserDetails
    	user = User.withDefaultPasswordEncoder()
                   .username("admin")
                   .password("admin")
                   .roles("ADMIN")
                   .build();
        
    	users.add(user);
    	
        return new InMemoryUserDetailsManager(users);
    }
}