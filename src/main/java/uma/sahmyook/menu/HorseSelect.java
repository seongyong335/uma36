package uma.sahmyook.menu;

import static java.lang.Thread.sleep;
import static uma.sahmyook.menu.MainMenu.us;

public class HorseSelect {
    public void method() {
        System.out.println("================= 응원마 선택 =================");
        do {
            System.out.print("몇 번 말을 선택 하실껀가요?(1~9번) 돌아가기(0번) : ");
            MainMenu.horseStr = MainMenu.sc.nextLine();
            switch(MainMenu.horseStr){
                case "0": return;
                case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8":
                case "9": horsePickSelect(); return;
                default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
            }
        } while(true);
    }
    public void horsePickSelect() {
        MainMenu.horseNum = Integer.parseInt(MainMenu.horseStr);
        System.out.println("'" + MainMenu.horseNum + "'" + " 번마 " + us.getHorses().get(MainMenu.horseNum).getUmaName() +"를 선택하셨습니다!");
        System.out.print("게임을 시작해주세요!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
