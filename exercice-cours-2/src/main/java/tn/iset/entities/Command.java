package tn.iset.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Command {
	/** 

	 *  

	 */ 
	private static final long serialVersionUID = 1L; 
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id_Commande; 
	private String commandeDate; 
	@ManyToOne 
	private Userr utilisateur; 
	@OneToMany 
	private Collection<CommandLine> commandline; 
	@OneToOne
	private Payement payement;
	
}
