package com.projetosb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosb.entities.Fornecedor;
import com.projetosb.repository.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    @Autowired
    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor getFornecedorById(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> getAllFornecedors() {
        return fornecedorRepository.findAll();
    }

    public void deleteFornecedor(Long id) {
    	fornecedorRepository.deleteById(id);
    }
}


