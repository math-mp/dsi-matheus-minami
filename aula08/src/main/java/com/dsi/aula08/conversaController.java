package com.dsi.aula08;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversaController {

  private static final String template = "oi tudo bem?, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/conversa")
  public Conversa conversa(@RequestParam(defaultValue = "user") String name) {
    return new Conversa(counter.incrementAndGet(), template.formatted(name));
  }
}