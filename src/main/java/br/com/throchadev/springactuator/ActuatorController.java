package br.com.throchadev.springactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ActuatorController {

  @GetMapping
  public String getHello(){
    return "Hello Word";
  }
}
