package com.clientbean;

import com.model.Wine;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Wine.class)
public class WineClientBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("WineBean is created");
  }
}
