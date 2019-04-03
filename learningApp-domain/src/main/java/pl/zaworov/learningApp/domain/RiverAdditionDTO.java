package pl.zaworov.learningApp.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RiverAdditionDTO {
	@NotEmpty 
	@Size(min=3) 
	private String name; 
	
	@NotEmpty 
	@Size(min=3)
	private String location; 
	
	@Size(min=100) 
	private Integer length; 
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public Integer getLength() {
		return length;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(String location) {
		this.name = location;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
}
