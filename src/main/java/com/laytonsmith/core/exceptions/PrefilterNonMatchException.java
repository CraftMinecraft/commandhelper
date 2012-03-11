/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.core.exceptions;

/**
 * Thrown if a prefilter is set, and doesn't match. A missing prefilter
 * is a match, and a matching prefilter is a match.
 * @author layton
 */
public class PrefilterNonMatchException extends Exception {

    /**
     * Creates a new instance of <code>PrefilterNonMatchException</code> without detail message.
     */
    public PrefilterNonMatchException() {
    }
    
}
