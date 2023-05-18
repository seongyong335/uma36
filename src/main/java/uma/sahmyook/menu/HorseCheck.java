package uma.sahmyook.menu;


import static uma.sahmyook.menu.MainMenu.us;

public class HorseCheck {

    public void method(){
        System.out.println("================= 경기마 승률 및 배당률 =================");
        for(int i = 0; i < 9; i++){
            System.out.println((i+1) + "번 마의 승률 : " + us.getHorses().get(i).getWinRate() + /* 승률 메소드 */ "%  | 배당률 : " +us.getHorses().get(i).getDividendRate());
            System.out.println("경기수 : " + us.getHorses().get(i).getCountRace() + " | 탑3 : " + us.getHorses().get(i).getCountTop3() + " | 1등 : " + us.getHorses().get(i).getCountVictory() + " |"
                    + " | 2등 : " + us.getHorses().get(i).getCountSecond() + " |" + " | 3등 : " + us.getHorses().get(i).getCountThird() + " |"
            );
        }
        System.out.print("9 번쨰 말 " + us.getHorses().get(8).getUmaName() + "의 승률 : " + us.getHorses().get(8).getWinRate() + /* 승률 메소드 */ "%  | 배당률 : " +us.getHorses().get(8).getDividendRate() );
        System.out.print("   Enter키를 누르면 되돌아 갑니다...");
        MainMenu.sc.nextLine();
    }
}
