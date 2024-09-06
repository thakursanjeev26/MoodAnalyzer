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
        try{
            if(message.contains("Sad")) {
                return "SAD";
            }
        }
        catch (NullPointerException e){
            System.out.println("Please enter Valid mood");
        }
        return "HAPPY";
    }


}
