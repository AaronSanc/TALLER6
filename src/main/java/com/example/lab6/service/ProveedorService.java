/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lab6.service;

import com.example.lab6.model.Proveedor;
import com.example.lab6.repository.ProveedorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aaron
 */

@Service
public class ProveedorService {
     @Autowired
     private ProveedorRepository repository;
     public List<Proveedor> listarTodos(){
         return repository.findAll();
     }
     
     public void guardar (Proveedor proveedor) {
         repository.save(proveedor);
     }
     
     public Optional<Proveedor> buscarPorId (Long id) {
         return repository.findById(id);
         
     }
     
     public void eliminar (Long id){
         repository.deleteById(id);
     }
}
