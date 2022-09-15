package com.UNIWheels.service;

import com.UNIWheels.dto.UserDriverDTO;
import com.UNIWheels.dto.UserDriverDTO;
import com.UNIWheels.dto.UserTravelerDTO;
import com.UNIWheels.entities.UserDriver;
import com.UNIWheels.entities.UserTraveler;

import java.util.List;

public interface UserService {

    UserDriver createUserDriver( UserDriver userDriver);
    UserDriver updateDriver(UserDriver user,String userId);
    boolean deleteDriver(String id);
    UserDriver findByIdDriver(String id);
    List<UserDriver> getAllDriver();
    UserTraveler createUserTraveler(UserTraveler userTraveler);
    UserTraveler updateTraveler(UserTraveler userTraveler,String id);
    boolean deleteTraveler(String id);
    UserTraveler findByIdTraveler(String id);
    List<UserTraveler>getAllTraveler();

}
