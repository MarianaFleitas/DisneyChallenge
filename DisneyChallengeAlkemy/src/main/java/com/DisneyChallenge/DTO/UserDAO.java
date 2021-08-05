package com.DisneyChallenge.DTO;

public class UserDAO {
	
	public static boolean validaUsuario(String username, String password) {
		return(username.equals("admin")&& password.equals("admin"));
	}
}
