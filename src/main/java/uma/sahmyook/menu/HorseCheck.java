package uma.sahmyook.menu;


import static uma.sahmyook.menu.MainMenu.us;

public class HorseCheck {

    public void method(){
        System.out.println("================= 경기마 승률 및 배당률 =================");
        for(int i = 0; i < 9; i++){
            System.out.println(us.getHorses().get(i).getUmaName() + "의 승률 : " + us.getHorses().get(i).getWinRate() + /* 승률 메소드 */ "%  | 배당률 : " +us.getHorses().get(i).getDividendRate() + "경기수 : " + us.getHorses().get(i).getCountRace() + " | 탑3 : " + us.getHorses().get(i).getCountTop3() + "|");
            System.out.println("| 1등 : " + us.getHorses().get(i).getCountVictory() + " |" + " | 2등 : " + us.getHorses().get(i).getCountSecond() + " |" + " | 3등 : " + us.getHorses().get(i).getCountThird() + " |");
            System.out.println("| 4등 : " + us.getHorses().get(i).getCountFourth() + " |" + " | 5등 : " + us.getHorses().get(i).getCountFifth() + " |" + " | 6등 : " + us.getHorses().get(i).getCountSixth() + " |");
            System.out.println("| 7등 : " + us.getHorses().get(i).getCountSeventh() + " |" + " | 8등 : " + us.getHorses().get(i).getCountEighth() + " |" + " | 9등 : " + us.getHorses().get(i).getCountNinth() + " |");
        }
        System.out.print("   Enter키를 누르면 되돌아 갑니다...");
        MainMenu.sc.nextLine();
    }
}
