package org.opentutorials.javatutorials.array;
 
public class ForeachDemo {
 
    public static void main(String[] args) {
        String[] members = { "최진혁", "최유빈", "한이람" };
        
        //반복문이 동작할 떄마다 members 자료를 하나씩 꺼내서 e라는 변수에 넣는 것을 의미함
        //장점 : 자연스럽게 배열이 끝날 때까지 반복하기 때문에 몇번 반복해야하는지 고민하지 않아도 됨.
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
    }
 
}