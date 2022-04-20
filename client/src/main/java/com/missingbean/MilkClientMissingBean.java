package com.missingbean;

import com.model.Milk;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(Milk.class)
public class MilkClientMissingBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("MilkBean is missing");
  }
}
