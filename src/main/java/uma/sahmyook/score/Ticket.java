package uma.sahmyook.score;
import uma.sahmyook.menu.MainMenu;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Ticket {
    int no = -1;
    int tmp;

    public void buyTicket(){

        do {
            System.out.println("================= 티켓 구입 =================");
            System.out.println("보유 스코어 :" + MainMenu.score);
            System.out.println("스코어 1000점당 1개의 티켓으로 구매할 수 있습니다.");
            System.out.print("1~10개의 티켓을 구매할 수 있습니다. 돌아가기(0번): ");

            String num = MainMenu.sc.nextLine();
            if( "0".equals(num) ||"1".equals(num) || "2".equals(num) || "3".equals(num) || "4".equals(num) || "5".equals(num) || "6".equals(num) ||
                    "7".equals(num) || "8".equals(num) || "9".equals(num) || "10".equals(num)) {
                no = Integer.parseInt(num);
                if (MainMenu.ticket + no >= 10) {
                    System.out.print("티켓을 10개 이상 초과해서 보유할 수 없습니다.");
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                } else if (MainMenu.score <= no * 1000) {
                    System.out.println("보유 스코어가 부족합니다..");
                    System.out.println("다시 구입해 주세요!");
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                } else if (MainMenu.ticket + no >= 0 && MainMenu.ticket + no <= 10) {
                    MainMenu.score -= (no * 1000);
                    MainMenu.ticket += no;
                    System.out.println("남은 스코어 :" + MainMenu.score + "  \\ " + "보유 티켓 수 : " + MainMenu.ticket);
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
            } else {
                System.out.print("잘못 입력하셨습니다. 다시 입력해 주세요. \n\n\n\n");
            }
        } while(true);
    }
}
