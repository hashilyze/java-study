package java_start.ch7;

import java.util.Scanner;

public class ex10 {
    private static int totalPrice = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> inputProduct(scanner);
                case 2 -> pay();
                case 3 -> exitProgram();
                default -> System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }

    private static void inputProduct(Scanner scanner){
        String name;
        int price, quantity;

        System.out.print("상품명을 입력하세요: ");
        name = scanner.nextLine();
        System.out.print("상품의 가격을 입력하세요: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("구매 수량을 입력하세요: ");
        quantity = Integer.parseInt(scanner.nextLine());

        int sum = price * quantity;
        System.out.printf("상품명: %s, 가격: %d, 수량: %d, 합계: %d\n",
                name, price, quantity, sum);
        totalPrice += sum;
    }

    private static void pay(){
        System.out.println("총 비용: " + totalPrice);
        totalPrice = 0;
    }

    private static void exitProgram(){
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
}
