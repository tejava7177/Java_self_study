//package org.opentutorials.javatutorials.overriding.example1;
// 
//class Calculator {
//    int left, right;
// 
//    public void setOprands(int left, int right) {
//        this.left = left;
//        this.right = right;
//    }
// 
//    public void sum() {
//        System.out.println(this.left + this.right);
//    }
// 
//    public void avg() {
//        System.out.println((this.left + this.right) / 2);
//    }
//}
// 
//class SubstractionableCalculator extends Calculator {
//     
//    public void sum() {
//    	//overriding
//    	// 메소드의 이름. 매개변수의 숫자와 데이터 타입, 순서,리턴타입이 같아야 함.
//        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
//    }
//     
//    public void substract() {
//        System.out.println(this.left - this.right);
//    }
//}
// 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        SubstractionableCalculator c1 = new SubstractionableCalculator();
//        c1.setOprands(10, 20);
//        c1.sum();
//        c1.avg();
//        c1.substract();
//    }
//}