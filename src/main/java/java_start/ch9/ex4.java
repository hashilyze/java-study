package java_start.ch9;

import java.util.Scanner;

public class ex4 {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 0;

    public static void main(String[] args) {
        Option[] options = {
                // 입금
                new Option(){
                    @Override
                    public void executeOption(){
                        System.out.print("입금액을 입력하세요: ");
                        int amount = Integer.parseInt(scanner.nextLine());

                        balance += amount;
                        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
                    }
                    @Override
                    public String getName(){ return "입금";}
                },
                // 출금
                new Option() {
                    @Override
                    public void executeOption() {
                        System.out.print("출금액을 입력하세요: ");
                        int amount = Integer.parseInt(scanner.nextLine());

                        if(balance >= amount){
                            balance -= amount;
                            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance +"원");
                        } else{
                            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
                        }
                    }
                    @Override
                    public String getName() { return "출금"; }
                },
                // 잔액 확인
                new Option() {
                    @Override
                    public void executeOption() {
                        System.out.println("현재 잔액: " + balance +"원");
                    }
                    @Override
                    public String getName() { return "잔액 확인"; }
                },
                // 종료
                new Option() {
                    @Override
                    public void executeOption() {
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    }
                    @Override
                    public String getName() { return "종료"; }
                }
        };

        while(true){
            for (int i = 0; i < options.length; ++i) {
                System.out.print((i + 1) + ". " + options[i].getName() + " | ");
            }
            System.out.println();

            System.out.print("선택: ");
            int option = Integer.parseInt(scanner.nextLine());
            if(0 < option && option <= options.length){
                options[option - 1].executeOption();
            } else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }


}

interface Option{
    void executeOption();
    String getName();
}
