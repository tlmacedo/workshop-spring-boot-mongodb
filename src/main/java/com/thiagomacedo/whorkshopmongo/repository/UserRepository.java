package com.thiagomacedo.whorkshopmongo.repository;


import com.thiagomacedo.whorkshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
