/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.postgresdemo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class ApplicationConfiguration implements WebMvcConfigurer {

//    @Bean
//    public ViewResolver jspViewResolver() {
//        InternalResourceViewResolver bean = new InternalResourceViewResolver();
//        bean.setPrefix("/src/main/resources/views/");
//        bean.setSuffix(".jsp");
//        return bean;
//    }
  @Bean
  public MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource
        = new ReloadableResourceBundleMessageSource();

    messageSource.setBasename("classpath:messages");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }

//  @Bean
//  public SpringTemplateEngine templateEngine() {
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    templateEngine.setTemplateResolver(thymeleafTemplateResolver());
//    return templateEngine;
//  }
//
//  @Bean
//  public SpringResourceTemplateResolver thymeleafTemplateResolver() {
//    SpringResourceTemplateResolver templateResolver
//        = new SpringResourceTemplateResolver();
//    templateResolver.setPrefix("classpath:views");
//    templateResolver.setSuffix(".html");
//    templateResolver.setTemplateMode("HTML5");
//    return templateResolver;
//  }
//
//  @Bean
//  public ThymeleafViewResolver thymeleafViewResolver() {
//    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//    viewResolver.setTemplateEngine(templateEngine());
//    return viewResolver;
//  }
}
