package br.gov.br.franciscomorato.editais.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class GlobalSecurity
{
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception
    {

        http.authorizeHttpRequests((requests) ->
                        requests
                                .requestMatchers("/home").permitAll()
                                .requestMatchers("/auth").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin((formLogin) ->
                        formLogin
                                .loginPage("/auth")
                                .defaultSuccessUrl("/home", true)
                )
                .logout((logout) ->
                        logout.logoutUrl("/logout")
                                .logoutSuccessUrl("/")
                );


        http.csrf((csrf) -> csrf.disable());

        return http.build();
    }
}
