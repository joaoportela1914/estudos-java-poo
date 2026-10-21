package interface_services;

public class PaypalService implements OnlinePaymentService{
	public Double paymentFee(Double amount) {
		return amount * 1.02;
	}
	public Double interest(Double amount , Integer months) {
		return amount * (1.01 * months);
	}
}
