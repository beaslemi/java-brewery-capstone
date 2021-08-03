package com.techelevator.dao;

import com.techelevator.model.Brewery;
import com.techelevator.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JdbcBreweryDao implements BreweryDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcBreweryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Brewery> findAll() {
        List<Brewery> breweries = new ArrayList<>();
        String sql = "SELECT * FROM brewery";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Brewery brewery = mapRowToBrewery(results);
            breweries.add(brewery);
        }
        return breweries;
    }

    @Override
    public Brewery getBreweryById(int id) {
        return null;
    }

    private Brewery mapRowToBrewery(SqlRowSet rs) {
        Brewery brewery = new Brewery();
        brewery.setId(rs.getInt("brewery_id"));
        brewery.setName(rs.getString("brewery_name"));
        brewery.setWebsite(rs.getString("website"));
        brewery.setPhone(rs.getString("phone"));
        brewery.setHistory(rs.getString("history"));
        brewery.setAddress(rs.getString("address"));
        brewery.setHoursOfOperation(rs.getString("days_and_hours_of_operation"));
        return brewery;
    }

}
