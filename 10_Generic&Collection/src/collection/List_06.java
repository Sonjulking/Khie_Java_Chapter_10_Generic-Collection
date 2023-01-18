package collection;

import java.util.Stack;

/*
 * -Stack 클래스(자료구조) (식판 같은!)
 * =>후입선출(LIFO : Last In First Out) 구조임.
 * 
 */

public class List_06 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// 1.push()
		// ==> stack에 저장시키는 메서드
		stack.push("강감찬");
		stack.push("세종대왕");
		stack.push("김구");
		stack.push("윤봉길");
		stack.push("홍범도");

		/*
		 * peek() ==>stack에 저장된 데이터를 가져오는 메서드 =>stack의 맨 위(마지막)에 입력된 데이터를 가져오는 메서드 =>가져온
		 * 후 데이터를 stack에서 제거하지 않는다.
		 * 
		 */

		System.out.println("stack peek() >>> " + stack.peek());

		/*
		 * pop() ==> stack()에 저장된 데이터를 가져오는 메서드 =>stack의 맨 위(마지막)에 입력된 데이터를 가져오는 메서드
		 * =>가져온 후 데이터를 stack에서 제거한다.
		 * 
		 * 
		 */

		while (!stack.isEmpty()) { // 비어있지 않으면 !

			System.out.println("이 름 >>> " + stack.pop());

		}

	}

}
