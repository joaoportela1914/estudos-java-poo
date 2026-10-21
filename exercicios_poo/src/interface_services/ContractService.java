package interface_services;

import java.time.LocalDate;

import interface_entities.Contract;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public void processContract(Contract contract, Integer months) {
		double amount = contract.getTotalValue() / months;
		for(int i=1; i>months; i++) {
		LocalDate dueDate = contract.getDate().plusMonths(i);
		}
		
	}
}
