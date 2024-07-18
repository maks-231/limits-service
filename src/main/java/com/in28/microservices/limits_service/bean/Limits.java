package com.in28.microservices.limits_service.bean;

public class Limits {
  private int max;
  private int min;

  public Limits(int max, int min) {
    this.max = max;
    this.min = min;
  }

  public Limits() {
  }

  public int getMax() {
    return max;
  }

  public int getMin() {
    return min;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public void setMin(int min) {
    this.min = min;
  }
}
