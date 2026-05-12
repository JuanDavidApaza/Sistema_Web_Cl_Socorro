/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clinicasocorro; // Asegúrate de que este nombre sea igual al de tus otros archivos .java

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String verContacto() {
        return "contacto"; // Esto le dice a Java que busque "contacto.html" en templates
    }
}