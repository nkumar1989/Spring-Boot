package com.coursecube.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;
import com.google.common.base.Predicates;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class JLCWebConfig implements WebMvcConfigurer {

	private ApiInfo getApiDetails() {
		
	return new ApiInfo(
	"JLC BookStore API", "BookPrice API - part of JLCBookStore Application", "1.1",
	"Free to use for 10 times",
	
	new Contact("Srinivas Dande","https://www.coursecube.com","sd@coursecube.com"),
	"API Under Free Licence",
	"https://www.coursecube.com"
	);
	
	}
	
		@Bean
		public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.paths(PathSelectors.any())
		.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
		.build( )
		.apiInfo(getApiDetails() );
		}
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//enabling swagger-ui
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
		}
}
