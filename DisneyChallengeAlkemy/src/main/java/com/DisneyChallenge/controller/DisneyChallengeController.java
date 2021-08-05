package com.DisneyChallenge.controller;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisneyChallengeController {
	
	/*
	 * @GetMapping("/") public String index() {
	 * 
	 * return"DisneyChallenge"; }
	 */
	

	@PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd ) {
		
		String token = getJWTToken(username);
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user;
		
	}
	
	/*
	 * public User signin(@RequestBody UserCredentials userCredentials) {
	 * 
	 * //crea usuario
	 * 
	 * //manda mail
	 * 
	 * }
	 */

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}

	
}
