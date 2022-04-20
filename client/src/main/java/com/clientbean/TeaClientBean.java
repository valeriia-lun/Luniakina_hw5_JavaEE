package com.clientbean;

import com.model.Tea;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Tea.class)
public class TeaClientBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("TeaBean is created");
  }
}
