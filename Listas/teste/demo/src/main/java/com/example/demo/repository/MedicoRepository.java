package com.example.demo.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Medico;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MedicoRepository {
    private static File arquivo = new File("src/main/resources/database/tb_medicos.json");
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Medico> getAll() throws Exception {
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }

        if(arquivo.length() > 0){
            return objectMapper.readValue(arquivo, new TypeReference<ArrayList<Pet>>() {});
        }
            return new ArrayList<>();
    }

    public boolean save(Pet pet) throws Exception {
        List<Pet> pets = this.getAll();

        for(Pet medicoNoBanco : medicos){
            if(medicoNoBanco.getId() == pet.getId()){
                return false;
            }
        }

        medico.add(pet);
        objectMapper.writeValue(arquivo, pets);
        return true;
    }
}
