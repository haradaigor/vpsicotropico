package vpsicotropico.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import jakarta.xml.bind.DatatypeConverter;

public class HashString {

	public static String toSHA(String content){
		
		MessageDigest algorithm;
		String hashedContent= "";
		try {
			algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(content.getBytes("UTF-8"));
			StringBuilder hexString = new StringBuilder(); 
			for (byte b : messageDigest) { 
				hexString.append(String.format("%02X", 0xFF & b)); 
				} 
			
			hashedContent = hexString.toString(); 
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
		return hashedContent;
	}

	public static String toMD5(String content) {
		MessageDigest md;
		
		String myHash = "";
		try {
			md = MessageDigest.getInstance("MD5");
		    md.update(content.getBytes());
		    byte[] digest = md.digest();
		    myHash = DatatypeConverter
		  	      .printHexBinary(digest).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return myHash;
	}
}
