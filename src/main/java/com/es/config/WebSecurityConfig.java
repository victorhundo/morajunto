package com.es.config;



import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
/**
 * Classe que realiza a conexão com o Spring Security
 * @author Hector Medeiros
 *
 */
@Configurable
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
    	web.ignoring().antMatchers("/css/**", "/js/**","/img/**","/vendor/**");
    	
    	web.ignoring()
                .antMatchers("/","/h2-console/**", "/api/*");

//        web.ignoring()
//        .antMatchers("/","/h2-console/**", Constants.URL_REGISTER);
//        
//        web.ignoring().antMatchers("vendor/bootstrap/css/bootstrap.min.css");
//        
//        web.ignoring()
//        .antMatchers("/","/h2-console/**", Constants.URL_LOGIN);
//        
//        web.ignoring()
//        .antMatchers("/","/h2-console/**", Constants.URL_GET_USER);
        
        web.ignoring().antMatchers(HttpMethod.POST,"/**");
        
        web.ignoring().antMatchers(HttpMethod.GET,"/**");
        
        web.ignoring().antMatchers(HttpMethod.DELETE);
        
        web.ignoring().antMatchers(HttpMethod.PUT);
        
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//        web.ignoring().antMatchers(HttpMethod.PUT, "/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
//    	http.formLogin()
//        .loginPage("/")
//        .loginProcessingUrl("/login")
//        .defaultSuccessUrl("/home")
//        .and()
//        .csrf().disable()
//        .logout()
//            .logoutSuccessUrl("/")
//            .logoutUrl("/logout"); // POST only

    	
        http
            .authorizeRequests()
                .anyRequest().fullyAuthenticated()
            .and()
                .addFilterBefore(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
                .httpBasic()
            .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
                .csrf().disable();
    }
    
    @Bean
	public BCryptPasswordEncoder passwordEncoder(){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}

