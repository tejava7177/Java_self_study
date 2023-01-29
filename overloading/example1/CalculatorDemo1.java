package org.opentutorials.javatutorials.overloading.example1;
 
class Calculator{
    int left, right;
    int third = 0;
    int avg;
    
    //이름이 같지만 매개변수에 의해서 발생되는 overloading
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
        avg = 2;
    }
    
    //이름이 같지만 매개변수에 의해서 발생되는 overloading
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.setOprands(left, right);
        this.third = third;
        avg = 3;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
    	if(avg == 3) {
        System.out.println((this.left+this.right+this.third)/3);
    	}
    	
    	else if(avg ==2) {
    		System.out.println((this.left+this.right)/2);
    	}
    	
    }
}
  
public class CalculatorDemo1 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}