package com.in28.microservices.limits_service;

import com.in28.microservices.limits_service.bean.LimitsConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
public class LimitsConfigurationController {

  @Resource
  private Configuration conf;

  @GetMapping("/limits")
  public LimitsConfiguration retrieveLimitsFromConfigurations() {
    return new LimitsConfiguration(conf.getMaximum(), conf.getMinimum());
  }
}
