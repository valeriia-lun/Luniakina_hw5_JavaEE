package com.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
@ConditionalOnProperty(value = "drink", havingValue = "wine")
public class Wine implements Drink, InitializingBean {

  public void afterPropertiesSet() {
    System.out.println(format("Wine is served in %s and best with %s", servedIn(), bestWith()));
  }

  @Override
  public String bestWith() {
    return "cheese";
  }

  @Override
  public String servedIn() {
    return "wineglass";
  }
}
