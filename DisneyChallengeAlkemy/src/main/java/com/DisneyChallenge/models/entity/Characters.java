package com.DisneyChallenge.models.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Characters")
public class Characters {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name="Name", nullable=false)
	private String Name; 
	
	@Column(name="History", nullable=false)
	private String History; 
	
	@Column(name="Movies/Series associates", nullable=false)
	private String MOSassociates; 
	
	@Column(name="Picture", nullable=false)
	private String Picture; 
	
	@Column(name="Age", nullable=false)
	private int Age; 
	
	@Column(name="Weight", nullable=false)
	private int Weight;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getHistory() {
		return History;
	}


	public void setHistory(String history) {
		History = history;
	}


	public String getMOSassociates() {
		return MOSassociates;
	}


	public void setMOSassociates(String mOSassociates) {
		MOSassociates = mOSassociates;
	}


	public String getPicture() {
		return Picture;
	}


	public void setPicture(String picture) {
		Picture = picture;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public int getWeight() {
		return Weight;
	}


	public void setWeight(int weight) {
		Weight = weight;
	}
	
	@ManyToMany (mappedBy="Characters", fetch=FetchType.LAZY , cascade = CascadeType.PERSIST)
	private List<Character>MoviesAndTVSeries; 
}
