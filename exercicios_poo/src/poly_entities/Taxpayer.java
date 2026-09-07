package poly_entities;

public abstract class Taxpayer {
		private String name;
		protected Double anualIncome;
		
		public Taxpayer() {
			
		}

		public Taxpayer(String name, Double anualIncome) {
			super();
			this.name = name;
			this.anualIncome = anualIncome;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getAnualIncome() {
			return anualIncome;
		}

		public void setAnualIncome(Double anualIncome) {
			this.anualIncome = anualIncome;
		}
		public abstract double tax();
		public abstract double taxAmount();
		public abstract double totalTax();
		
		
		
		
}
