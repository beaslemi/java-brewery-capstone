package com.techelevator.dao;

import com.techelevator.model.Brewery;

import java.util.List;

public interface BreweryDao {

    List<Brewery> findAll();

    Brewery getBreweryById(int id);


    Brewery createBrewery(Brewery brewery);

    Brewery updateBrewery(Brewery brewery);
}
