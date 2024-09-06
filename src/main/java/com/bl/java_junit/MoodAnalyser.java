package com.bl.java_junit;

public class MoodAnalyser {
    String message;

    MoodAnalyser(){
        this.message="";
    }
    MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
