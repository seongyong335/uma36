package uma.sahmyook.score;
import uma.sahmyook.*;
import uma.sahmyook.menu.MainMenu;

import java.util.Scanner;

public class Ticket {
    int no = -1;

    public void buyTicket(){
        System.out.println("================= 마권 구입 =================");
        do {
            System.out.println("보유 스코어 :" + MainMenu.score);
            System.out.println("스코어 1000점당 1개의 마권으로 구매할 수 있습니다.");
            System.out.print("1~10개의 마권을 구매할 수 있습니다. 마권없이 게임하기(0번): ");
            Scanner sc = new Scanner(System.in);
            no = sc.nextInt();
            if(MainMenu.ticket + no >= 10){
                System.out.println("마권을 10개 이상 초과해서 보유할 수 없습니다.");
                break;
            } else if (MainMenu.score <= no*1000){
                System.out.println("보유 스코어가 부족합니다..");
                break;
            }
            else if (MainMenu.ticket + no >= 0 && MainMenu.ticket + no <= 10) {
                MainMenu.score -= (no * 1000);
                MainMenu.ticket+= no;
                System.out.println("남은 스코어 :" + MainMenu.score + "  \\ " + "보유 마권 수 : " + MainMenu.ticket);
                break;
            }
        } while(true);
    }


    public static void useTicket(){
        MainMenu.ticket = 0;



    }

}




//            switch(no){
//                case 0: return;
//                case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
//                case 9: case 10:
//                    MainMenu.score -= (no * 1000);
//                    MainMenu.ticket+= no; // 리턴하면 티켓이 저장이 안됨. 5개샀다가 메뉴로가서 다시 사면 차감 포인트 다시 0제로됨
//                    System.out.println(MainMenu.ticket);
//                    if(MainMenu.ticket >= 10){
//                        System.out.println("마권을 10개 이상 초과해서 보유할 수 없습니다.");
//                        MainMenu.score += (no * 1000);
//                        MainMenu.ticket -= no;
//                    } else
//                    System.out.println(no + "개의 마권을 구입하셨습니다.");
//                    System.out.println("남은 스코어 : "+  MainMenu.score);
//                    break;
//
//                default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
//            } break;
