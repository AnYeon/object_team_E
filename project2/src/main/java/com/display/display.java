package com.display;

import javax.swing.JFrame;

public class display{
    static login loginView;
    static mainpage mainView;
   
    public static void main(String[] args) {
       
        // 메인클래스 실행
    	display main = new display();
        main.loginView = new login(); 
        main.mainView = new mainpage(); 
    }
   
    // 테스트프레임창
    public static void gomain(){
    	mainView.setVisible(true);
        loginView.setVisible(false); // 로그인창닫기
    }
 
}
