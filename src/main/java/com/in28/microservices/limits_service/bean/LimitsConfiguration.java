package com.in28.microservices.limits_service.bean;

public class LimitsConfiguration {
  private int maximum;
  private int minimum;

  protected LimitsConfiguration() {
  }

  public LimitsConfiguration(int maximum, int minimum) {
    this.maximum = maximum;
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }

  public int getMinimum() {
    return minimum;
  }
}
