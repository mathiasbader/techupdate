package com.soprasteria.de.b1.pb.techupdate.resources;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.de.b1.pb.techupdate.AuthToken;
import com.soprasteria.de.b1.pb.techupdate.PersistenceSupport;

/**
 */
@RestController
public class LogonResource
{
    private static final Logger log = Logger.getLogger("corebanking-login-service");
    
    private PersistenceSupport persistence;
    
    public LogonResource(PersistenceSupport persistence)
    {
        log.info("Instantiating logon resource");
    }

    @RequestMapping(path="/logon/{username}")
    public AuthToken getToken(
    		@PathVariable("username") String username,
    		@RequestParam("password") String password)
    {
    	AuthToken token = new AuthToken();
    	/* Check password here XXX
    	 * Replace this with RFC 7519 tokens!!! XXX */
    	
    	token.setUsername(username.toUpperCase()/*just to check whether we're called */);
    	return token;
    }
    
}
