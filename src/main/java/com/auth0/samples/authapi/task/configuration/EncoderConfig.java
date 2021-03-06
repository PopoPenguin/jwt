package com.auth0.samples.authapi.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Thomas Leruth on 11/9/17
 */

/**
 * Class to create a bean for the "imported" password encoder
 */
@Configuration
public class EncoderConfig {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
