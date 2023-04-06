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
@DiscriminatorValue("PAY")
public class PaypalPayement  extends Payement {
	private String acountNumber;
}
