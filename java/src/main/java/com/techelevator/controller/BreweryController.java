package com.techelevator.controller;

import com.techelevator.dao.BreweryDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Brewery;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class BreweryController {

    private BreweryDao breweryDao;

    public BreweryController(BreweryDao breweryDao) {
        this.breweryDao = breweryDao;
    }

    @RequestMapping(path = "/breweries", method = RequestMethod.GET)
    public List<Brewery> breweries() {
        return breweryDao.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/brewery", method = RequestMethod.POST)
    public Brewery addBrewery(@Valid @RequestBody Brewery brewery) {
        return breweryDao.createBrewery(brewery);
    }

    @RequestMapping(path = "/brewery/{id}", method = RequestMethod.PUT)
    public Brewery updateBrewery(@PathVariable int id, @Valid @RequestBody Brewery brewery) {
        return breweryDao.updateBrewery(brewery);
    }

}
