package com.config;

import com.model.Drink;
import com.model.Milk;
import com.model.Tea;
import com.model.Wine;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DrinkConfig.class)
public class DrinkConfig {
  @Bean
  @ConditionalOnProperty(value = "drink", havingValue = "milk")
  Drink milkBean() {
    return new Milk();
  }

  @Bean
  @ConditionalOnProperty(value = "drink", havingValue = "tea")
  Drink teaBean() {
    return new Tea();
  }

  @Bean
  @ConditionalOnProperty(value = "drink", havingValue = "wine")
  Drink wineBean() {
    return new Wine();
  }
}
