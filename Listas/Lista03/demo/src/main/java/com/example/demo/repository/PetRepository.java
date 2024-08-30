package com.example.demo.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {
    private static final int ZERO_BYTES = 0;
    private static File arquivo = new File("src/main/resources/database/tb_pets.json");
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Pet> getAll() throws Exception {
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }

        if(arquivo.length() > ZERO_BYTES){
            return objectMapper.readValue(arquivo, new TypeReference<ArrayList<Pet>>() {});
        }
        return new ArrayList<>();
    }

    public boolean save(Pet pet) throws Exception {
        List<Pet> pets = this.getAll();

        for(Pet petNoBanco : pets){
            if(pet.getId() == petNoBanco.getId()){
                return false;
            }
        }

        pets.add(pet);
        objectMapper.writeValue(arquivo, pets);
        return true;
    }
}
