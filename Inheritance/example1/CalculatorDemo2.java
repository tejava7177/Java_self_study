package org.opentutorials.javatutorials.Inheritance.example1;

class multiCalculator extends Calculator{
	public void multi() {
		System.out.println(this.left * this.right);
	}
}

class divCalculator extends multiCalculator{
	public void div() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiCalculator c2 = new multiCalculator();
		c2.setOprands(20, 3);
		c2.multi();

		
		divCalculator c3 = new divCalculator();
		c3.setOprands(6, 2);
		c3.multi();
		c3.div();
	}

}
