package uma.sahmyook.menu;


import static uma.sahmyook.menu.MainMenu.us;

public class HorseCheck {

    public void method(){
        System.out.println("================= 경기마 승률 및 배당률 =================");
        for(int i = 0; i < 9; i++){
           System.out.println((i+1) + "번 마의 승률 : " + us.getHorses().get(i).getWinRate() + /* 승률 메소드 */ "%  | 배당률 : " +us.getHorses().get(i).getDividend() );
        }
        System.out.print("Enter키를 누르면 되돌아 갑니다...");
        MainMenu.sc.nextLine();
        MainMenu.sc.nextLine();
    }
}
