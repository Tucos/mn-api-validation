package com.example;

import com.example.api.api.Api;
import com.example.api.model.EndpointBody;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;

import javax.validation.Valid;

@Controller
public class EndpointController implements Api {
    @Override
    public void postEndpoint(@Valid @Body EndpointBody body) {
    }
}
