package com.papansarkar.api.freetts;
import com.sun.speech.freetts.*;

public class TextToSpeech
{
    private String speaktext;
    public void doSpeak(String speak, String voice)
    {
        speaktext = speak;
        try
        {
            VoiceManager voiceManager = VoiceManager.getInstance();
            Voice voices = voiceManager.getVoice(voice);
            Voice sp = null;
            if(voices!= null)
                sp = voices;
            else
                System.out.println("No voices Available");
            sp.allocate();
            sp.speak(speaktext);
            sp.deallocate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

