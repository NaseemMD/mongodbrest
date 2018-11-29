package io.codementor.gtommee.rest_tutorial.controller;


import io.codementor.gtommee.rest_tutorial.models.Pets;
import io.codementor.gtommee.rest_tutorial.repositories.PetsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;



@RestController
@RequestMapping("/Users")
public class PetsController {
    @Autowired
    public PetsRepository repository;

    @RequestMapping(value = "/bb", method = RequestMethod.GET)
    public String hello()
    {
        return "Hello";
    }

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public List<Pets> getAllPets() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pets getPetById(@PathVariable("id") Integer id) {
        return repository.findBy_id(id);
    }

   // @PutMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifyPetById(@RequestBody Pets pets) {
        //pets.set_id(id);
        repository.save(pets);
    }
    @PostMapping
    public String createPet(@RequestBody Pets pets) {
        //pets.set_id( id);
        repository.save(pets);
        return "User Created Successfully";
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deletePet(@PathVariable Integer id)
    {
        repository.delete(repository.findBy_id(id));
        return "User Deleted Successfully";
    }
}