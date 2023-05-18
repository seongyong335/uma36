package uma.sahmyook.menu;


import uma.sahmyook.function.UmaStadium;

import java.util.Scanner;

public class MainMenu {
    public static Scanner sc = new Scanner(System.in); // 다른 클래스에서 사용할 수 있게 스태틱으로 선언

    static String no;                              // 메뉴에서 선택하는 번호를 저장하는 변수
    public static int horseNum;             //  응원하는 말 번호를 저장하는 변수
    public static String horseStr;             //  응원하는 말 번호를 문자열로 저장하는 변수
    public static int ticket = 0;               //  티켓을 저장하는 변수

   
    public static int score = 10000;        // 스코어를 저장하는 변수
    static MenuExit menuExit = new MenuExit(); // 메뉴 나가기 클래스 객체 생성
    static SubMenu subMenu = new SubMenu(); // 서브 메뉴 클래스 객체 생성
    public static UmaStadium us = new UmaStadium();           //경기장 생성
    // 메인 메뉴
    public void mainMenu(){
        do{

            System.out.println("================= UMA 경기장에 오신걸 환영합니다!! =================\n\n");
            System.out.println("메뉴를 선택해주세요!\n");
            System.out.println("1. 경기장 입장하기\n");
            System.out.println("2. 프로그램 종료\n");
            System.out.print("메뉴 선택 : ");
            no = sc.nextLine();

            switch(no){
                case "1": subMenu.subMenu(); break;                             // 서브메뉴로 가는 메소드
                case "2": menuExit.Method(1); break;           // 메뉴나가기로 가는 메소드
                default:
                    System.out.println("잘못 입력하셨습니다 다시 입력해주세요!");
            }
        } while(true);
    }
}
