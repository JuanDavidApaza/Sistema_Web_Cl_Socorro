package com.clinicasocorro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador para la vista principal (Landing Page) de la Clínica María del Socorro.
 */
@Controller
public class GeneralInfoController {

    @GetMapping("/")
    public String showGeneralInfo(Model model) {
        // Inyectando las estadísticas de la clínica en el modelo
        // para ser procesadas por Thymeleaf en la vista.
        model.addAttribute("pacientes", "+500k");
        model.addAttribute("experiencia", "+25");
        model.addAttribute("medicos", "+50");
        model.addAttribute("urgencias", "24/7");

        // Retorna la vista 'index.html' ubicada en src/main/resources/templates/
        return "index";
    }

    @GetMapping("/nosotros")
    public String showNosotros() {
        // Esto buscará automáticamente el archivo nosotros.html en tu carpeta templates
        return "nosotros";
    }
}