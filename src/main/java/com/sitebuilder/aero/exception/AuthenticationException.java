package com.sitebuilder.aero.exception;


/**
 * @author pbonansea
 *
 */
public class AuthenticationException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public AuthenticationException(final String message) {
        super(message);
    }
    
}
