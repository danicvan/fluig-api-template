package br.suaempresa.fluigapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/ping")
    public String ping() {
        return "API Fluig ativa! ✅";
    }
}
