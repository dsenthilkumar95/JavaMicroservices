package com.improve.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.improve.*")
public class Microservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate() {
//
//		final RestTemplate restTemplate = new RestTemplate();
//
//		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//
//		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//
//		messageConverters.add(mappingJackson2HttpMessageConverter);
//
//		restTemplate.setMessageConverters(messageConverters);
//
//		return restTemplate;
//	}

}
