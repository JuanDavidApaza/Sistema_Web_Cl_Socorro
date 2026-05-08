package com.clinicasocorro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class probando {

	@GetMapping("/")
    public String inicio() {
        return "index";
    }
}
