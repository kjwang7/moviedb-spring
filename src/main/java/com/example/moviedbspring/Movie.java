package com.example.moviedbspring;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  private int rating;

  private String name;
  private String description;

  
  public long getId() {
	  return id;
  }
  public void setId(long id) {
	  this.id = id;
  }
  public int getRating() {
	  return rating;
  }
  public void setRating(int rating) {
	  this.rating = rating;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public String getDescription() {
	  return description;
  }
  public void setDescription(String description) {
	  this.description = description;
  }


}