package uma.sahmyook.menu;

import com.sun.tools.javac.Main;

import static java.lang.Thread.sleep;

public class HorseSelect {
    public void method() {
        System.out.println("================= 응원마 선택 =================");
        do {
            System.out.print("몇 번 말을 선택 하실껀가요?(1~9번) 돌아가기(0번) : ");
            MainMenu.sc.nextLine();
            MainMenu.horseNum = MainMenu.sc.nextInt();
             switch(MainMenu.horseNum){
                 case 0: return;
                 case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                 case 9: pickselect(); return;
                 default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
             }
        } while(true);
    }
    public void pickselect(){
        System.out.println("'" + MainMenu.horseNum + "'" + " 번 마를 선택하셨습니다!");
        ticketselect();

    }
    public void ticketselect(){
        System.out.println("================= 티켓 수 선택 =================");  // 스코어에 따라 조건문 작성
        System.out.print("티켓 수를 선택해주세요! ( 1 ~ 10장) : ");
        MainMenu.ticket = MainMenu.sc.nextInt();
        System.out.println(MainMenu.ticket +"장을 선택하셨습니다!"); // 여기서 마권 장수 선택 따로 메소드를 만드는 게 좋을 것 같습니다.
        System.out.println("게임을 시작해주세요!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
