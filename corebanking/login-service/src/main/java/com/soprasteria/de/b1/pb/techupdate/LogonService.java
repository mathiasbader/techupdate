package com.soprasteria.de.b1.pb.techupdate;

import java.util.logging.Logger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * This is the entry point for the logon service.
 */
@SpringBootApplication
public class LogonService
extends SpringBootServletInitializer
{
    private static final Logger log = Logger.getLogger("corebanking-login-sevice");

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder)
    {
        log.info("Initializing service");
        return builder;
    }
    
    @Bean
    public JwkDao newJwkDao()
    {
        return new JwkDao();
    }
}