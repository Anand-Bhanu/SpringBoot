package com.example.auto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private double score;
    private String unique_identifier;

    public City() {
    }

    public City(String name, double latitude, double longitude, double score, String unique_identifier) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
        this.unique_identifier = unique_identifier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getUnique_identifier() {
		return unique_identifier;
	}

	public void setUnique_identifier(String unique_identifier) {
		this.unique_identifier = unique_identifier;
	}
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", score=" + score +
                ", unique_identifier=" + unique_identifier +
                '}';
    }

}
