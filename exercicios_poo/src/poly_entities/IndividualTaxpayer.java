package poly_entities;

public abstract class IndividualTaxpayer extends Taxpayer{
	
	private Double healthExpenditures;

	public IndividualTaxpayer() {
	}
	
	
	public IndividualTaxpayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		double basicTax;
		if (anualIncome < 20000.00) {
			basicTax =  anualIncome * 0.15;
		}
		else {
			basicTax =  anualIncome * 0.25;	
		}	
		return basicTax - healthExpenditures * 0.5;

	}
}
