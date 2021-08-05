package com.DisneyChallenge.DTO;


public class MoviesAndTVSeriesDTO {

	
	private String Picture; 
	private String Title; 
	private int CreationDate;
	private double Rating; 
	private String AssociatedCharacters; 
	
	public MoviesAndTVSeriesDTO (String Picture,String Title,int CreationDate,double Rating, String AssociatedCharacters) {
		this.Title = Title;
		this.CreationDate = CreationDate;
		this.Rating= Rating;
		this.AssociatedCharacters = AssociatedCharacters;
		this.Picture = Picture;	
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(int creationDate) {
		CreationDate = creationDate;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}

	public String getAssociatedCharacters() {
		return AssociatedCharacters;
	}

	public void setAssociatedCharacters(String associatedCharacters) {
		AssociatedCharacters = associatedCharacters;
	}
	
	
	
	
	
	
	
	
}
