package uma.sahmyook.menu;
import uma.sahmyook.score.*;

public class SubMenu{

    public void subMenu(){
        HorseSelect horseSelect = new HorseSelect();
        do{
            System.out.println("================= 경기장에 입장하셨습니다! 원하시는 것을 선택해주세요. =================");
            System.out.println("1. 경기 시작!");
            System.out.println("2. 응원하는 말 선택");
            System.out.println("3. 응원마 승률 및 정보 확인");
            System.out.println("4. 마권 구입");
            System.out.println("5. 경기장 퇴장");
            System.out.print("메뉴 선택 : ");
            MainMenu.no = MainMenu.sc.nextInt();
            switch(MainMenu.no){
                case 1: break; // 경기 시작 메소드;
                case 2: horseSelect.method(); break; // 응원하는 말 선택하는 메소드;
                case 3: break; // 경마 승률 및 배당률 확인 하는 메소드;
                case 4:
                    Ticket ticket = new Ticket();
                    ticket.buyTicket(); break; // 마권 구입하는 메소드;
                case 5: MainMenu.menuExit.Method(0); break;
                default:  System.out.println("잘못 입력하셨습니다 다시 입력해주세요!");
            }
        } while(MainMenu.no != 5); // 이렇게 하지 않으면 case5에서 return받으면 바로 주 메뉴로 나가짐
    }
}
