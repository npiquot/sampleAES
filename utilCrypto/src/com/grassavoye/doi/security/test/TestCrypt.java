package com.grassavoye.doi.security.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.grassavoye.doi.security.sampleCrypt;
import com.grassavoye.doi.security.sampleUncrypt;

public class TestCrypt {


	final String IV = "F27D5C9927726BCEFE7510B1BDD3D137";
    final   String SALT = "3FF2EC019C627B945225DEBAD71A01B6985FE84C95A70EB132882F88C0A59A55";
    final   int KEY_SIZE = 128;
    final   int ITERATION_COUNT = 10000;
    final   String PASSPHRASE_1 = "lesoiseauxchantentlematin" ; 
    final   String PASSPHRASE_2 = "lesoiseauxchantentlematiN" ;
    final   String MESSAGE = "la chaine a crypter" ; 

    @Test
    public void testCryptUncryptDone() {
    	 
    	String l_crypt = sampleCrypt.encrypt(IV, SALT, PASSPHRASE_1, KEY_SIZE, ITERATION_COUNT, MESSAGE) ; 
    	System.out.println("crypt : '" + l_crypt  + "'") ; 
    	String l_uncrypt = sampleUncrypt.decrypt(IV, SALT, PASSPHRASE_1, KEY_SIZE, ITERATION_COUNT, l_crypt); 
    	System.out.println("uncrypt : '" + l_uncrypt  + "'") ; 
    	
    	assertEquals(MESSAGE, l_uncrypt);
    	
    }
    @Test
    public void testCryptUncryptFail() {
    	 
    	try {
    	String l_crypt = sampleCrypt.encrypt(IV, SALT, PASSPHRASE_1, KEY_SIZE, ITERATION_COUNT, MESSAGE) ; 
    	System.out.println("crypt : '" + l_crypt  + "'") ; 
    	// return an Exception if the key is not similar in the 2 ways operations
    	String l_uncrypt = sampleUncrypt.decrypt(IV, SALT, PASSPHRASE_2, KEY_SIZE, ITERATION_COUNT, l_crypt);
    	
    	} catch (IllegalStateException e1) {
    		assertTrue(true);
    	}
    	assertFalse(true);
    }
    
    
    
}
