package com.albionmetrics.Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class healthcontroller {

  @GetMapping("/health")
  public Map<String, String> healthCheck() {
    Map<String, String> response = new HashMap<>();
    response.put("status", "OK");
    response.put("message", "Backend funcionando");
    return response;
  }
}