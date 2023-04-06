package tn.iset.entities;




import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Role {
	/** 

	 *  

	 */ 

	private static final long serialVersionUID = 1L; 
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idRole; 
	private String roleName; 
	@ManyToMany 
	private Collection<Userr> user; 
}
