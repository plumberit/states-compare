package com.shapovalov.project.utils;

import com.shapovalov.project.entities.model.Country;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JSONReader {

    //временная копия
    ArrayList<Country> countries = new ArrayList<>();

    private static String databaseReader() {
        StringBuilder str = new StringBuilder();
        try {
            FileReader fr = new FileReader("resources/data.json" );
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                str.append(scan.nextLine());
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    private static JSONObject JSONCreator(String str) {
        JSONParser parser = new JSONParser();
        JSONObject obj = null;
        try {
            obj = (JSONObject) parser.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
