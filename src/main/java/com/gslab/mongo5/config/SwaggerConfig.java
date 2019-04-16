package com.gslab.mongo5.config;
  
  
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.PathSelectors; 
import springfox.documentation.builders.RequestHandlerSelectors; 
import springfox.documentation.spi.DocumentationType; 
import springfox.documentation.spring.web.plugins.Docket; 
import springfox.documentation.swagger2.annotations.EnableSwagger2;
  
  
  @Configuration
  @EnableSwagger2
  public class SwaggerConfig{
  
  @Bean 
  	public Docket productApi() { 
	  
	  return new Docket(DocumentationType.SWAGGER_2)
  			.select()
  			.apis(RequestHandlerSelectors.basePackage("com.gslab.mongo5.controller"))
  			.paths(PathSelectors.regex("/mongo-api.*"))
  			.build();
	  
  }

	  public void addResourceHandlers(ResourceHandlerRegistry registry) {

	      registry
	              .addResourceHandler("**/**")
	              .addResourceLocations("classpath:/META-INF/resources/");
	      registry
	              .addResourceHandler("**/webjars/**")
	              .addResourceLocations("classpath:/META-INF/resources/webjars/");

	  }
     } 
 
 