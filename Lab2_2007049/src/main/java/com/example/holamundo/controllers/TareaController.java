package com.example.holamundo.controllers;

import com.example.holamundo.entity.Juego;
import com.example.holamundo.entity.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class TareaController {

    @GetMapping(value = { "/",""})
    public String home(Model model) {
        model.addAttribute("msg", "¡Este es otro mensaje!");
        model.addAttribute("nombre", "Capibara");
        model.addAttribute("cantidad", 20);
        return "home";
    }

    @PostMapping(value = { "/",""})
    public String guardarPersona( Persona persona, Juego juego){
        System.out.println("Tamaño: " + juego.getTamano() + "\n" +
                "Tarjetas: " + juego.getTarjetas() + "\n" +
                "Dni: " + persona.getDni() + "\n" +
                "CodigoPUCP: " + persona.getDni() + "\n" +
                "Direccion: " + persona.getDni());
        return "formulario";
    }

    @GetMapping("/registrar")
    public String listaPersonas(Model model){
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Alejandro", "Gomez", "12345678", 20170101, "San Borja"));
        listaPersonas.add(new Persona("Mauricio", "Gomez", "85695489", 20213435,"San Miguel"));
        listaPersonas.add(new Persona("Barbara", "Bellido", "75856985", 20090234,"San Isidro"));
        model.addAttribute("listaPersonas", listaPersonas);
        return "formulario";
    }

    @PostMapping(value = { "/registrar","/registrar/"})
    public String agregarNumero( Persona persona, Juego juego){
        System.out.println("Tamaño: " + juego.getTamano() + "\n" +
                "Tarjetas: " + juego.getTarjetas() + "\n" +
                "Dni: " + persona.getDni() + "\n" +
                "CodigoPUCP: " + persona.getDni() + "\n" +
                "Direccion: " + persona.getDni());
        return "formulario";
    }




}
