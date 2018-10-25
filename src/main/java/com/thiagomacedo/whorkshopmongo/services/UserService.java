package com.thiagomacedo.whorkshopmongo.services;

import com.thiagomacedo.whorkshopmongo.domain.User;
import com.thiagomacedo.whorkshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
