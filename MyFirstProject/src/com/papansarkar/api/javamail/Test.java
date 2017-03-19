package com.papansarkar.api.javamail;

import com.papansarkar.api.javamail.SendingMail;

import java.io.IOException;

/**
 * Created by PAPAN on 3/1/2017.
 */
public class Test {
    public static void main(String[] args){
        try {
            SendingMail.sendMail("papansarkar2312@gmail.com",
                    "Registration Successful !!! ","Click Here to activate.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
