package java_start.ch7;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int price, quantity;

            System.out.print("상품의 가격을 입력하세요: ");
            price = scanner.nextInt();
            if(price == -1){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            quantity = scanner.nextInt();

            int totalPrice = price * quantity;
            System.out.println("총 비용: " + totalPrice);
        }
    }
}
