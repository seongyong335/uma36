package uma.sahmyook.menu;

import static java.lang.System.exit;

public class MenuExit {
    public void Method(int menuNum) { // menuNum이 1이면 종료 , 0이면 퇴장 -> 다른 메뉴(서브메뉴 2,3번)
        MainMenu.sc.nextLine();
        do {                        // 에서 번호 다른 거 붙여서 되돌아 가기로 재사용 가능
            if(menuNum == 1)System.out.print("정말로 종료하실 껀가요? ( Y | N ): ");   // 메인메뉴에서 종료
            if(menuNum == 0) System.out.print("정말로 퇴장하실 껀가요 ? ( Y | N ): "); // 서브메뉴에서 퇴장
            String str = MainMenu.sc.nextLine();
            if ("y".equals(str) || "Y".equals(str)) {
                if(menuNum == 1 ) exit(0);  // 메인메뉴에서 종료
                else if(menuNum == 0) return;                     // 서브메뉴에서 퇴장
            } else if("N".equals(str) || "n".equals(str)) {
                MainMenu.no = 0; break;
            } else System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요!");
        } while(true);
    }
}
