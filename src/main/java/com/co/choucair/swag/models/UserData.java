package com.co.choucair.swag.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class UserData {

    String user;
    String pass;

    public static List<UserData> setData(DataTable table){
        List<UserData> data = new ArrayList<>();
        List<Map<String, String>> info = table.asMaps();
        for (Map<String, String> pointer : info){
            data.add(new ObjectMapper().convertValue(pointer, UserData.class));
        }
        return data;
    }

}
