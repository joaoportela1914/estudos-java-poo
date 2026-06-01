package list_entities;

public class Employee {
		private int id;
		private String name;
		private double salary;
		private double increase;
		
		public Employee(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		
		public void salaryIncrease(double increase,double percentage ) {
			this.increase= increase;
			this.increase = salary * (percentage /(100.0 + 1));
			
		}
}
