package ma.intelligentdeed.tutorials.security.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**").antMatchers("/websocket-kafka/**").antMatchers("/api/**");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.addFilter(corsFilter()).authorizeRequests().antMatchers("/**", "/app/**", "/static/**").permitAll();
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.addAllowedOrigin("*");
		if (config.getAllowedOrigins() != null && !config.getAllowedOrigins().isEmpty()) {
			source.registerCorsConfiguration("/**", config);
			source.registerCorsConfiguration("/app/**", config);
			source.registerCorsConfiguration("http://localhost:4200", config);
			source.registerCorsConfiguration("/websocket-kafka/**", config);
		}
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return new CorsFilter(source);
	}
}