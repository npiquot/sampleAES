package com.grassavoye.doi.security;



public class sampleCrypt {

	public static void main(String[] args) {
		final String IV = "F27D5C9927726BCEFE7510B1BDD3D137";
	    final   String SALT = "3FF2EC019C627B945225DEBAD71A01B6985FE84C95A70EB132882F88C0A59A55";
	    final   String PLAIN_TEXT = "la phrase a crypter" ; 
	    final   int KEY_SIZE = 128;
	    final   int ITERATION_COUNT = 10000;
	    final   String PASSPHRASE = "diqsjdkljqskldsdjfldskfjsdlkfjsflksdfjklsdfsldkjfsl" ; 
		
		
	    CryptUtils util = new CryptUtils(KEY_SIZE, ITERATION_COUNT);
        String encrypt = util.encrypt(SALT, IV, PASSPHRASE, PLAIN_TEXT);
        System.out.println("'" + encrypt + "'") ; 
        

	}
	public static String encrypt(String in_IV, String in_salt, String in_passPhrase, int in_keySize, int in_iterationCount, String in_plainText) {
		// TODO Auto-generated method stub
		String l_return = null ; 
		
		CryptUtils util = new CryptUtils(in_keySize, in_iterationCount);
        String encrypt = util.encrypt(in_salt, in_IV, in_passPhrase, in_plainText);
        System.out.println("'" + encrypt + "'") ; 
		l_return = encrypt ; 
		
		return l_return ;
		
	}

}
