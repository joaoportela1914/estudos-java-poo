package interface_services;

import java.time.Duration;

import interface_entities.CarRental;
import interface_entities.Invoice;

public class RentalService {
	private Double perDay;
	private Double perHour;
	
	private BrazilTaxService taxService;

	public RentalService(Double perDay, Double perHour, BrazilTaxService taxService) {
		this.perDay = perDay;
		this.perHour = perHour;
		this.taxService = taxService;
	}
	
	public void processInvoice( CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutesPart();
		carRental.setInvoice(new Invoice(50.0,10.0));
	}
}
	
