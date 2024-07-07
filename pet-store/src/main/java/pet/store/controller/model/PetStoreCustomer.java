package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.PetStore;

@NoArgsConstructor
@Data
public class PetStoreCustomer {
	private Long customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	
	Set<PetStore> petStores = new HashSet<>();
}
