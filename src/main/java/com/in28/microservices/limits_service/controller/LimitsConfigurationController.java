package com.in28.microservices.limits_service.controller;

import com.in28.microservices.limits_service.bean.LimitsConfiguration;
import com.in28.microservices.limits_service.configuration.LimitsServiceConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
public class LimitsConfigurationController {

  @Resource
  private LimitsServiceConfiguration conf;

  @GetMapping("/limits-config")
  public LimitsConfiguration retrieveLimitsFromConfigurations() {
    return new LimitsConfiguration(conf.getMaximum(), conf.getMinimum());
  }
}
