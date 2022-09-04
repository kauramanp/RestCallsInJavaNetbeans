/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restcalls;

import com.mashape.unirest.http.HttpResponse;
import org.json.JSONObject;

/**
 *
 * @author HP
 */
public class ApiResponse {
     boolean success;
    HttpResponse <String> response;
    JSONObject jsonObject;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public void ApiResponse(boolean success, HttpResponse<String> response,JSONObject jsonObject){
        this.success = success;        
        this.response = response;
        this.jsonObject = jsonObject;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
   
    
   
    
    
    
}
