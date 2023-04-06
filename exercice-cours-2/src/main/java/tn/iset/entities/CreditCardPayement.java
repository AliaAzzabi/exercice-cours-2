package tn.iset.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
@DiscriminatorValue("CARD")
public class CreditCardPayement  extends Payement  {
	private String cardNumber;
	private String experetionDate;
}
