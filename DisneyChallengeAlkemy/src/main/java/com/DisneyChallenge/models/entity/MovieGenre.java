package com.DisneyChallenge.models.entity;
import javax.persistence.*;

@Entity
@Table(name="MovieGenre")
public class MovieGenre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Picture", nullable=false)
	private String Picture; 
	

	@Column(name="Name", nullable=false)
	private String Name; 
	
	@Column(name="associated movies", nullable=false)
	private String AssociatedMovies; 
	
	
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

	@OneToMany (mappedBy="MoviesAndTVSeries", fetch=FetchType.LAZY , cascade = CascadeType.PERSIST)
	private MovieGenre MovieGenre;	

}
