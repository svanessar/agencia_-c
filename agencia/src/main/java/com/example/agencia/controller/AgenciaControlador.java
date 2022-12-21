package com.example.agencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.agencia.model.Agencia;
import com.example.agencia.service.IAgenciaServices;

@SessionAttributes("agencia")
@RequestMapping("/agencia")


public class AgenciaControlador {
 

    @Autowired
    private IAgenciaServices agenciad;


    @GetMapping("/listar")
    public String listar(Model m){
        m.addAttribute("agencias", agenciad.findAll());
        Agencia agencia=new Agencia();
        m.addAttribute("abono", agencia);
       

        return "views/prestamoabono/prestamoabono";
    }

   
       
}

