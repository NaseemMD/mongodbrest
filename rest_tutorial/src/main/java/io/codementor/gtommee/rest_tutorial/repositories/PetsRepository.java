package io.codementor.gtommee.rest_tutorial.repositories;

import io.codementor.gtommee.rest_tutorial.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets,Integer> {
    Pets findBy_id(Integer _id);
    //Pets findBy(ObjectId id);
}
