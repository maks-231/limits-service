package com.in28.microservices.limits_service.controller;

import com.in28.microservices.limits_service.bean.Limits;
import com.in28.microservices.limits_service.configuration.LimitsServiceConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
public class LimitsController {
  @Resource
  private LimitsServiceConfiguration config;

  @GetMapping("/limits")
  public Limits getLimits() {
    return new Limits(config.getMaximum(), config.getMinimum());
  }
}
