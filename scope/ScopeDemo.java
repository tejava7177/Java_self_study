package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			a();
			System.out.println(i);
		}
	}

}
