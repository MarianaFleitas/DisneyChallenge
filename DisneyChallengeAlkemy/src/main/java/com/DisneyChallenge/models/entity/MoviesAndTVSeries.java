package com.DisneyChallenge.models.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MoviesAndTVSeries")
public class MoviesAndTVSeries {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Picture", nullable=false)
	private String Picture; 
	

	@Column(name="Title", nullable=false)
	private String Title; 
	
	@Column(name="Creation Date", nullable=false)
	private int CreationDate;
	
	@Column(name="Rating", nullable=false)
	private double Rating; 
	
	@Column(name="associated characters", nullable=false)
	private String AssociatedCharacters; 
	
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

	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name="MoviesAndTVSeries_MovieGenre", joinColumns= @JoinColumn (name="MoviesAndTVSeries_id"),inverseJoinColumns= @JoinColumn(name="MovieGenre_id"))
	private List<MovieGenre> MovieGenre; 
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinColumn(name="characters_id", nullable=false)
	private Characters characters;	
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinTable(name="MovieGenre_id")
	private List<MoviesAndTVSeries>MoviesAndTVSeries;

}
