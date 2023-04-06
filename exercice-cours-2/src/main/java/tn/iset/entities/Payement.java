package tn.iset.entities;

import java.io.Serializable;
import java.text.DateFormat;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_FORM", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("MERE")
public class Payement implements Serializable {
	/** 

	 *  

	 */ 
	private static final long serialVersionUID = 1L; 
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idPayement; 
	private double amount; 
	private DateFormat payementDate; 
}
