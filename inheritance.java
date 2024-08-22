package javaprogram;

public class inheritance {
		int Salary = 60000;
	}
	class Engineer extends employee {
		int bonuns = 20000;
	}
	class text {
		public static void main(String[] args) {
			Engineer E1 = new Engineer();
			System.out.println("Salary:" + E1.salary);
			System.out.println("Bonus:" + E1.bonuns);

	}

}
