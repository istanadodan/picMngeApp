package img.camera.tools.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests((requests) -> requests
            .requestMatchers("/login", "/login.html").permitAll()
            .anyRequest().authenticated())
        .formLogin((form) -> form
            .loginPage("/login")
            .usernameParameter("name")
            .passwordParameter("pw")
            .permitAll())
        .logout((logout) -> logout.permitAll());
    // .exceptionHandling(null);

    return http.build();
  }

}
