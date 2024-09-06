package com.bl.java_junit;

import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in Sad Mood");
        assertEquals("SAD",mood);
    }
    @Test
    public void givemMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in Any Mood");
        assertEquals("HAPPY",mood);
    }

}