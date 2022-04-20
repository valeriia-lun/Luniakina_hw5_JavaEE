package com.missingbean;

import com.model.Wine;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(Wine.class)
public class WineClientMissingBean implements InitializingBean {
  @Override
  public void afterPropertiesSet() {
    System.out.println("WineBean is missing");
  }
}
