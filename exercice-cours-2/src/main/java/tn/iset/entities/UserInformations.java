package tn.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class UserInformations {
	/** 

	 *  

	 */ 

	 

  
	private static final long serialVersionUID = 1L; 
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 

	private Long idinformation; 

	private String adresse; 

	private String city; 

	private String email; 

	private String phoneNumber; 

	 

}
