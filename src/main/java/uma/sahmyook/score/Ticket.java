package uma.sahmyook.score;

import uma.sahmyook.menu.MainMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ticket {
    int no = -1;

    public void buyTicket(){
        System.out.println("================= 마권 구입 =================");
        do {
            System.out.println("보유 스코어 :" + MainMenu.score);
            System.out.println("스코어 1000점당 1개의 마권으로 구매할 수 있습니다.");
            Scanner sc = new Scanner(System.in);
            try {
                no = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
            }
            System.out.print("1~10개의 마권을 구매할 수 있습니다. 뒤로돌아가기(0번): ");
                if (MainMenu.ticket + no > 10) {
                    System.out.println("마권은 최대 10개까지 보유 할 수 있습니다.");
                    break;
                }else if (MainMenu.score < no * 1000) {
                    System.out.println("보유 스코어가 부족합니다..");
                    break;
                }else if (MainMenu.ticket + no >= 0 && MainMenu.ticket + no <= 10) {
                    MainMenu.score -= (no * 1000);
                    MainMenu.ticket += no;
                    System.out.println("남은 스코어 :" + MainMenu.score + "  \\ " + "보유 마권 수 : " + MainMenu.ticket);
                    break;
                }
            }
            while(true);

    }
}