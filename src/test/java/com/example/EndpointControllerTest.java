package com.example;

import com.example.api.model.EndpointBody;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest
class EndpointControllerTest {
    @Inject
    EndpointController controller;

    @Test
    void postEndpoint_requiresFlag() {
        final ConstraintViolationException exception =
                assertThrows(ConstraintViolationException.class, () ->
                        controller.postEndpoint(new EndpointBody()));

        assertEquals("postEndpoint.body.flag: must not be null", exception.getMessage());
    }
}
