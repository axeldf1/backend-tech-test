package com.littlebill.webapp.controller;

import com.wirefreethought.geodb.client.GeoDbApi;
import com.wirefreethought.geodb.client.model.GeoDbInstanceType;
import com.wirefreethought.geodb.client.net.GeoDbApiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String GetHelloWorld(){
        GeoDbApiClient apiClient = new GeoDbApiClient(GeoDbInstanceType.FREE);
        GeoDbApi geoDbApi = new GeoDbApi(apiClient);
        geoDbApi.f

        return "Hello world !";
    }
}
