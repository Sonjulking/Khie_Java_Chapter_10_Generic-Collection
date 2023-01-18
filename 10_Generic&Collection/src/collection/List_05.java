package collection;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

/*
 *[문제] List_04 클래스 처럼 Student 객체를 만들어서 키보드로 학생 수를 입력 받고, 입력받은 학생 수만큼의 학생 정보를 키보드로 입력을 받아 
 *ArrayList에 저장 후 화면에 출력해 보세요.(조건 - 학생의 정보는 학번, 이름, 학과, 연락처, 주소)
 */

public class List_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stdList = new ArrayList<Student>();
		System.out.print("학생수를 입력해주세요. : ");

		int numberOfStudents = sc.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {

			System.out.println(
					"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			System.out.println((i + 1) + "번째 학생의 학번, 이름, 학과, 연락처, 주소를 입력해 주세요.");

			Student student = new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());

			stdList.add(student);

		}

//		for (int i = 0; i < stdList.size(); i++) {
//			System.out.println("list[" + i + "] >>> " + stdList.get(i));
//		}
		System.out.println(
				"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i = 0; i < stdList.size(); i++) {

			Student sdto = stdList.get(i);

			System.out.println(sdto.getHakbun() + "\t" + sdto.getName() + "\t" + sdto.getMajor()
					+ "\t" + sdto.getPhone() + "\t" + sdto.getAddress());

			System.out.println(
					"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		}

	}

}
