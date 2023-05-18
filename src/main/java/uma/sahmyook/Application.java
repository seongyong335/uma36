package uma.sahmyook;


import uma.sahmyook.menu.MainMenu;

public class Application {

    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();     // 메인 메뉴 객체 클래스 선언
        mainMenu.mainMenu();                                // 메인 메뉴 메소드 실행
    }
}
