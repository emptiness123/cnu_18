package com.cnu.blackjack;

public class Application {
    public static void main(String args[]) {
        int flag = 1;
        Scanner input = new Scanner(System.in);
        while (flag){






            System.out.println("게임을 종료하겠습니까? y,n");
            while(true) {
                if (input == "y") {
                    flag == 0;
                    break;
                } else if (input == "n") {
                    flag == 1;
                    break;
                } else {
                    System.out.println("잘못 입력했습니다.다시 입력해 주세요");
                }
            }
        }

    }
}
