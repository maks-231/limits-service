package com.in28.microservices.limits_service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
  private int maximum;

  private int minimum;

  public int getMinimum() {
    return minimum;
  }

  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }
}

