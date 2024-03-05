package java_start.ch8;

import java.util.Scanner;

public class ex8 {
    private static final int MAX_ITEM = 2;

    private static Scanner scanner;
    private static Item[] items = new Item[MAX_ITEM];
    private static int count = 0;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> registerItems();
                case 2 -> listItems();
                case 3 -> quit();
                default -> System.out.println("입력이 잘못되었습니다.");
            }
        }
    }

    public static void registerItems(){
        if(count >= MAX_ITEM){
            System.out.println("더 이상 상품을 등록할 수 없습니다.");
            return;
        }

        System.out.print("상품 이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("상품 가격을 입력하세요: ");
        int price = Integer.parseInt(scanner.nextLine());

        items[count++] = new Item(name, price);
    }
    public static void listItems(){
        if(count == 0){
            System.out.println("등록된 상품이 없습니다.");
            return;
        }

        for (int i = 0; i < count; ++i) {
            System.out.println(items[i].name() + ": " + items[i].price() + "원");
        }
    }
    public static void  quit(){
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
}

record Item(String name, int price) {
}