package list_entities;

public class Employee {
		private String name;
		private int id;
		private double salary;
		
		public Employee(int id,String name, double salary) {
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
		
		public void salaryIncrease(double percentage ) {
			double increase = salary * (percentage /(100.0 + 1));
			
		}

		@Override
		public String toString() {
			return id + name + salary;
		}
}
