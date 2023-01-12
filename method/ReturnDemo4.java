package org.opentutorials.javatutorials.method;
 
public class ReturnDemo4 {
	
	//배열을 반환함.
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members[2]);
    }
 
}