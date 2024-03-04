package java_start.ch7;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String foodName;
        int foodPrice, foodQuantity;

        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요: ");
        foodName = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        foodPrice = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.printf("%s %d개를 주문하셨습니다.", foodName, foodQuantity);
        System.out.printf("총 가격은 %d원입니다.\n", totalPrice);
    }
}
