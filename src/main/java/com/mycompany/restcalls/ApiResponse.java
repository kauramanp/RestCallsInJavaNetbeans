/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restcalls;

import com.mashape.unirest.http.HttpResponse;

/**
 *
 * @author HP
 */
public class ApiResponse {

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public void ApiResponse(boolean success, HttpResponse<String> response){
        this.success = success;        
        this.response = response;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }
    boolean success;
    HttpResponse <String> response;

   
    
    
    
}
