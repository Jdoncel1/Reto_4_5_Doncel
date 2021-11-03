/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solucion_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioCabin {
    
    @Autowired
    private InterfaceCabin crud;

    public List<Cabañas> getAll(){
        return (List<Cabañas>) crud.findAll();
    }

    public Optional<Cabañas> getCabin(int id){
        return crud.findById(id);
    }

    public Cabañas save(Cabañas cabin){
        return crud.save(cabin);
    }
    public void delete(Cabañas cabin){
        crud.delete(cabin);
    }
    
}
