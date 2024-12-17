package com.example.Cinemas.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
@Column
private String movieName;
@Column
	private String actorName;
@Column
	private String contactNumber;
@Column
	private String productionHouse;

public Movie() {
	{}
}

public Movie(int id, String movieName, String actorName, String contactNumber, String productionHouse) {
	super();
	this.id = id;
	this.movieName = movieName;
	this.actorName = actorName;
	this.contactNumber = contactNumber;
	this.productionHouse = productionHouse;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getActorName() {
	return actorName;
}

public void setActorName(String actorName) {
	this.actorName = actorName;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getProductionHouse() {
	return productionHouse;
}

public void setProductionHouse(String productionHouse) {
	this.productionHouse = productionHouse;
}

}
