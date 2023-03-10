package com.shapovalov.app.backend.function.functions.utils;

import com.shapovalov.app.model.Country;

import java.util.ArrayList;

public class CountryDemonstrate {
    public ArrayList<String> format(Country country) {
        ArrayList<String> list = new ArrayList<>();
        list.add(country.getName());

        ReadableNum obj = new ReadableNum();

        list.add(
                "Population: " + obj.toReadableNum(String.valueOf(country.getPopulation()))
        );
        list.add(
                "Square: " + obj.toReadableNum(String.valueOf(country.getSquare())) + " km^2"
        );
        list.add(
                "GDP: " + obj.toReadableNum(String.valueOf(country.getGDP())) + "$"
        );
        list.add(
                "GDP per person: " + obj.toReadableNum(String.valueOf(country.getGDPPerPerson())) + "$"
        );
        list.add(
                "Population density: " + obj.toReadableNum(String.valueOf(country.getPopulationDensity())) + " people per km^2"
        );
        return list;
    }
}
