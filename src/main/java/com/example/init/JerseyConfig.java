package com.example.init;

import com.example.controller.*;
import org.glassfish.jersey.server.*;
import org.springframework.stereotype.*;

@Component
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
        register(ProductController.class);
    }

}
