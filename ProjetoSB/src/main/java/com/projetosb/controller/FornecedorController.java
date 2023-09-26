package com.projetosb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosb.entities.Fornecedor;
import com.projetosb.services.FornecedorService;

@RestController
@RequestMapping("/fornecedor")

public class FornecedorController {
    
	private final FornecedorService fornecedorService;

    @Autowired
    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @PostMapping
    public Fornecedor createProduct(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.saveFornecedor(fornecedor);
    }

    @GetMapping("/{id}")
    public Fornecedor getFornecedor(@PathVariable Long id) {
        return fornecedorService.getFornecedorById(id);
    }

    @GetMapping
    public List<Fornecedor> getAllFornecedors() {
        return fornecedorService.getAllFornecedors();
    }

    @DeleteMapping("/{id}")
    public void deleteFornecedor(@PathVariable Long id) {
    	fornecedorService.deleteFornecedor(id);
    }
}

