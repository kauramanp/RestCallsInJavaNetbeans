/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restcalls;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class HttpSinglton {

    private String baseUrl = "https://gorest.co.in/public/v2/";

    //private constructor to avoid client applications to use constructor
    public HttpSinglton() {
        Unirest.setTimeouts(6000, 6000);
    }

    public ApiResponse getRequest(String url) {
        HttpResponse httpResponse = null;
        ApiResponse apiResponse = new ApiResponse();
        try {
            httpResponse = Unirest.get(baseUrl + url).asString();
            apiResponse.setSuccess(true);
            apiResponse.setResponse(httpResponse);
        } catch (UnirestException exception) {
            apiResponse.setSuccess(false);
            apiResponse.setResponse(httpResponse);
        }
        return apiResponse;

    }

    public ApiResponse postRequest(String url, Map<String, String> headers, Map<String, Object> fields) {
        HttpResponse httpResponse = null;
        ApiResponse apiResponse = new ApiResponse();
        try {
            HttpResponse<JsonNode> jsonResponse
                    = Unirest.post(baseUrl+url)
                            .headers(headers).fields(fields).asJson();
            System.out.println(" jsonResponse "+jsonResponse.getBody());
            apiResponse.setSuccess(true);
            apiResponse.setResponse(httpResponse);
        } catch (UnirestException exception) {
            apiResponse.setSuccess(false);
            apiResponse.setResponse(httpResponse);
        }
        return apiResponse;

    }

}
