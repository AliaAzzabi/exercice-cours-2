package tn.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class CommandLine {

	/** 

	 *  

	 */ 
	private static final long serialVersionUID = 1L; 
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idCommandeLine; 
	private Long quantity; 
	@ManyToOne
	private Command command;
	@ManyToOne 
	private Article article;
}
