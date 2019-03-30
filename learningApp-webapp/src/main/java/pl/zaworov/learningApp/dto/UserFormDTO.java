package pl.zaworov.learningApp.dto;

import javax.validation.constraints.*;

public class UserFormDTO{
	@NotEmpty
	@Size(min=3)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@Min(18)
	private Integer wiek; 
	
	@Pattern(regexp="\\d{2}-\\d{2}-\\d{4}")
	private String birthDate;
	
	
	
	//gettery i settery
}