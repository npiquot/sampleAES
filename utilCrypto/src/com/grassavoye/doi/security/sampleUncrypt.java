package com.grassavoye.doi.security;



public class sampleUncrypt {

	public static void main(String[] args) {
		final String IV = "F27D5C9927726BCEFE7510B1BDD3D137";
	    final   String SALT = "3FF2EC019C627B945225DEBAD71A01B6985FE84C95A70EB132882F88C0A59A55";
	    final   String CRYPT_TEXT = "u4/C/AAosLkKQbe6VhCToI3WX/I/6RD4ndDmpg76tWE=" ; 
	    final   int KEY_SIZE = 128;
	    final   int ITERATION_COUNT = 10000;
	    final   String PASSPHRASE = "diqsjdkljqskldsdjfldskfjsdlkfjsflksdfjklsdfsldkjfsl" ; 
		
		
	    CryptUtils util = new CryptUtils(KEY_SIZE, ITERATION_COUNT);
        String uncrypt = util.decrypt(SALT, IV, PASSPHRASE,CRYPT_TEXT );
        System.out.println("'" + uncrypt + "'") ; 
        
		 
	}
	public static String decrypt(String in_IV, String in_salt, String in_passPhrase, int in_keySize, int in_iterationCount, String in_cryptedText) {
		// TODO Auto-generated method stub
		String l_return = null ; 
		
		CryptUtils util = new CryptUtils(in_keySize, in_iterationCount);
        String uncrypt = util.decrypt(in_salt, in_IV, in_passPhrase, in_cryptedText);
        System.out.println("'" + uncrypt + "'") ; 
		l_return = uncrypt ; 
		
		return l_return ;
		
	}

}
