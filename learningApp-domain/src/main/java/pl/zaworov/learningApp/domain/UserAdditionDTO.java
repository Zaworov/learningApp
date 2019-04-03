package pl.zaworov.learningApp.domain;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class UserAdditionDTO {
		@NotEmpty 
		@Size(min=3) 
		private String name; 
		
		@NotEmpty 
		@Email private String email; 
		
		@NotNull
		private LocalDate dateOfBirth;
		
		@Range(min=1, max=100) 
		private Integer age; 
			
		
		@Pattern(regexp = "\\d{3}-\\d{3}-\\d{3}")
		private String phoneNumber;


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public Integer getAge() {
			return age;
		}


		public void setAge(Integer age) {
			this.age = age;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}		
}
