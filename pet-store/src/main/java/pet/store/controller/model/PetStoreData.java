package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;


@NoArgsConstructor
@Data
public class PetStoreData {
	private Long petStoreId;
	private String petStoreName;
	private String petStoreAddress;
	private String petStoreCity;
	private String petStoreState;
	private String petStoreZip;
	private String petStorePhone;
	
	Set<PetStoreCustomer> customers = new HashSet<>();
	
	Set<PetStoreEmployee> employees = new HashSet<>();
	
	public PetStoreData(PetStore petStore) {
		petStoreId = petStore.getPetStoreId();
		petStoreName = petStore.getPetStoreName();
		petStoreAddress = petStore.getPetStoreAddress();
		petStoreCity = petStore.getPetStoreCity();
		petStoreState = petStore.getPetStoreState();
		petStoreZip = petStore.getPetStoreZip();
		petStorePhone = petStore.getPetStorePhone();
		
		for(Customer customer : petStore.getCustomers()) {
			customers.add(new PetStoreCustomer(customer));
			
		}
	}
	
	@NoArgsConstructor
	@Data
	public static class PetStoreCustomer{
		private Long customerId;
		private String customerFirstName;
		private String customerLastName;
		private String customerEmail;
		
		public PetStoreCustomer(Customer customer) {
			customerId = customer.getCustomerId();
			customerFirstName = customer.getCustomerFirstName();
			customerLastName = customer.getCustomerLastName();
			customerEmail = customer.getCustomerEmail();
		}
	}
	
	@NoArgsConstructor
	@Data
	public static class PetStoreEmployee{
		private Long employeeId;
		private String employeeFirstName;
		private String employeeLastName;
		private String employeePhone;
		private String employeeJobTitle;
		
		public PetStoreEmployee(Employee employee){
			employeeId = employee.getEmployeeId();
			employeeFirstName = employee.getEmployeeFirstName();
			employeeLastName = employee.getEmployeelastName();
			employeePhone = employee.getEmployeePhone();
			employeeJobTitle = employee.getEmployeeJobTitle();
		}
	}
}
