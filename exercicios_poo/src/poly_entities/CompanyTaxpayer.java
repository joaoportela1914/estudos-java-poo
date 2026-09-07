package poly_entities;

public abstract class CompanyTaxpayer extends Taxpayer{
		private int totalEmployees;
		
		public CompanyTaxpayer() {
		}
	
		public CompanyTaxpayer(String name, Double anualIncome, int totalEmployees) {
			super(name, anualIncome);
			this.totalEmployees = totalEmployees;
		}
		
		public int getTotalEmployees() {
			return totalEmployees;
		}

		public void setTotalEmployees(int totalEmployees) {
			this.totalEmployees = totalEmployees;
		}

		@Override
		public double tax() {
			double basicTax;
			if ( totalEmployees > 10) {
				basicTax = anualIncome * 0.16;
			}
			else {
				basicTax = anualIncome * 0.14;
			}
			return basicTax;
		}

		
}
