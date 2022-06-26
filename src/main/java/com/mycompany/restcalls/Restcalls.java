 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.restcalls;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.google.gson.Gson;    
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Restcalls {
    public static void main(String[] args) {
            HttpSinglton httpSinglton =new HttpSinglton();
            ApiResponse apiResponse= httpSinglton.getRequest("users");
            
           System.out.println("in users "+ apiResponse.getResponse()+ " success "+apiResponse.isSuccess());
 try{
//            HttpResponse <String> httpResponse = Unirest.get("https://apistagging.astroriver.com/api/country").asString();
//            System.out.println( httpResponse.getHeaders().get("Content-Type"));
//            System.out.println(httpResponse.getBody());
            Gson gson = new Gson();
                Users users;
                users = gson.fromJson(apiResponse.getResponse().getBody().toString(),Users.class);
            System.out.println("usersList "+users);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}
