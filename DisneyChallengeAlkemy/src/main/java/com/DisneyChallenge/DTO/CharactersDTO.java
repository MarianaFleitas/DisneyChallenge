package com.DisneyChallenge.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CharactersDTO{
	
	@NotBlank
	@Size(max=15)
	private Long id; 
	private String Name; 
	private String History; 
	private String MOSassociates; 
	private String Picture; 
	private int Age; 
	private int Weight;
	
	public CharactersDTO(Long id, String Name, String History, String MOSassociates, String Picture, int Age, int Weight) {
		this.id = id;
		this.Name = Name;
		this.History = History;
		this.MOSassociates = MOSassociates;
		this.Picture = Picture;
		this.Age = Age;
		this.Weight = Weight;	
	}

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
}		