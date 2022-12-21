package com.example.agencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.agencia.model.Agencia;
import com.example.agencia.model.IAgencia;

public class AgenciaService  implements IAgenciaServices{
    
    @Autowired
        private IAgencia agenciad;

    @Override
    public List<Agencia> findAll() {
        return (List<Agencia>) agenciad.findAll();
    }
    
    
}
