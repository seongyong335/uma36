package uma.sahmyook.menu;

import static java.lang.Thread.sleep;
import static uma.sahmyook.menu.MainMenu.us;

public class HorseSelect {
    public void method() {
        System.out.println("================= 응원마 선택 =================");
        do {
            for(int i = 0; i < 9; i++){
                System.out.println((i+1)+". "+us.getHorses().get(i).getUmaName() + "의 승률 : " + us.getHorses().get(i).getWinRate() + /* 승률 메소드 */ "%  | 배당률 : " +us.getHorses().get(i).getDividendRate() + "  | 경기수 : " + us.getHorses().get(i).getCountRace() + " | 탑3 : " + us.getHorses().get(i).getCountTop3() + "|");
            }
            System.out.print("몇 번 말을 선택 하실껀가요?(1~9번) 돌아가기(0번) : ");
            MainMenu.horseStr = MainMenu.sc.nextLine();
            switch(MainMenu.horseStr){
                case "0": return; // 바로 리턴
                case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8":
                case "9": horsePickSelect(); return;                                                    // case 1~9번 까지는 horsePickSelect() 메소트 실행 후 리ㅓㄴ
                default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
            }
        } while(true);
    }
    public void horsePickSelect() {
        MainMenu.horseNum = Integer.parseInt(MainMenu.horseStr);
        System.out.println("'" + MainMenu.horseNum + "'" + " 번마 " + us.getHorses().get(MainMenu.horseNum-1).getUmaName() +"를 선택하셨습니다!");
        System.out.println("게임을 시작해주세요!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
