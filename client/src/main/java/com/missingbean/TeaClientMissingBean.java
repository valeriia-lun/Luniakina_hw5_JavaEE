package com.missingbean;

import com.model.Tea;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(Tea.class)
public class TeaClientMissingBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("TeaBean is missing");
  }
}
