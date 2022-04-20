package com.clientbean;

import com.model.Milk;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Milk.class)
public class MilkClientBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("MilkBean is created");
  }
}
