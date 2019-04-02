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
	
//	//gettery i settery
}
