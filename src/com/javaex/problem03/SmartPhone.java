package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        if(str.equals("앱")) {
        	System.out.println("앱실행");
        }else if(str.equals("음악")) {
        	playMusic();
        }else{
        	super.execute(str);
        }       
    }
    
    //메소드작성
    
    //메소드작성
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
