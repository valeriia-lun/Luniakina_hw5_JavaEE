package com.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
@ConditionalOnProperty(value = "drink", havingValue = "tea")
public class Tea implements Drink, InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println(format("Tea is served in %s and best with %s", servedIn(), bestWith()));
  }

  @Override
  public String bestWith() {
    return "cake";
  }

  @Override
  public String servedIn() {
    return "cup";
  }
}
