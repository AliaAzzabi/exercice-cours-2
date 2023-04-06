package tn.iset.entities;



import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Userr {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L; 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Utilisateur ;
	private String login;
	private String password;
	private int connectionNumber;
	@OneToOne 
	private UserInformations userrinformation; 
	@ManyToMany 
	private  Collection<Role> role;
	@OneToMany 
	private Collection<Command> commande; 

}
