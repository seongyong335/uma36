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
        System.out.println("게임을 시작해주세요!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
