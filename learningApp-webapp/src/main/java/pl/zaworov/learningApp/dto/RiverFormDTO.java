package pl.zaworov.learningApp.dto;

import javax.validation.constraints.*;

public class RiverFormDTO{
	@NotEmpty
	@Size(min=3)
	private String name;
	
	@NotEmpty
	@Email
	private int length;
	
	@Min(18) 
	private String locationProvince; 
	
	//gettery i settery }
}