/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.restcalls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class Restcalls {

    public static void main(String[] args) {
        HttpSinglton httpSinglton = new HttpSinglton();
        ApiResponse apiResponse = httpSinglton.getRequest("users");
        System.out.println("in users " + apiResponse.getResponse() + " success " + apiResponse.isSuccess());
        try {
            List<UsersList> dataResponses = new ArrayList<>();
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            dataResponses = Arrays.asList(gson.fromJson(apiResponse.getResponse().getBody().toString(), UsersList[].class));
            System.out.println("usersList " + dataResponses.get(0).getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
