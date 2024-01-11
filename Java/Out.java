package database;

import java.util.Scanner;

public class Out {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static int out() {
		//menu 출력
        int choice;
        System.out.println();
        System.out.println("=== 주문 애플리케이션 ===");
        System.out.println("1. 상품 추가");
        System.out.println("2. 주문하기");
        System.out.println("3. 주문 내역 조회");
        System.out.println("4. 주문 취소");
        System.out.println("5. 상품 목록 조회");
        System.out.println("6. 카테고리별 총 상품 수 조회");
        System.out.println("7. 주문수량 변경");
        System.out.println("0. 종료");
        System.out.println();
        System.out.print("메뉴를 선택하세요: ");
        choice = scanner.nextInt();
        //scanner.nextLine();
        return choice;

	}
}
