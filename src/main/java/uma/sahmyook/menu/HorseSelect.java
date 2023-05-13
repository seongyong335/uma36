package uma.sahmyook.menu;

import static java.lang.Thread.sleep;

public class HorseSelect {
    public static void method() {
        System.out.println("================= 응원마 선택 =================");
        do {
            System.out.print("몇 번 말을 선택 하실껀가요?(1~9번) : ");
            MainMenu.sc.nextLine();
            MainMenu.horsNum = MainMenu.sc.nextInt();
            if(MainMenu.horsNum < 10 && MainMenu.horsNum > 0) {
                System.out.println("'" + MainMenu.horsNum + "'" + " 번 마를 선택하셨습니다!");
                System.out.println("================= 티켓 수 선택 =================");
                System.out.print("티켓 수를 선택해주세요! ( 1 ~ 10장) : ");
                MainMenu.ticket = MainMenu.sc.nextInt();
                System.out.println(MainMenu.ticket +"장을 선택하셨습니다!"); // 여기서 마권 장수 선택 따로 메소드를 만드는 게 좋을 것 같습니다.
                System.out.print("게임을 시작해주세요!");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        } while(true);
    }
}
