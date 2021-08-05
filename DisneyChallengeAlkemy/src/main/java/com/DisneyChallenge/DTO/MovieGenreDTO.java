package com.DisneyChallenge.DTO;

public class MovieGenreDTO {

	private String Picture;
	private String Name; 
	private String AssociatedMovies; 
	
	public MovieGenreDTO( String Name, String AssociatedMovies, String Picture) {
		
		this.Name = Name;
		this.Picture = Picture;
		this.AssociatedMovies =  AssociatedMovies;
		
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAssociatedMovies() {
		return AssociatedMovies;
	}

	public void setAssociatedMovies(String associatedMovies) {
		AssociatedMovies = associatedMovies;
	}
	
	
	
	
	
	
	
}
