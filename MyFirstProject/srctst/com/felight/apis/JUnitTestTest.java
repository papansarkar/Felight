package com.felight.apis;

import com.papansarkar.api.junit.JUnitTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PAPAN on 3/2/2017.
 */
public class JUnitTestTest {
    @org.junit.Test
    public void getName() throws Exception {
        JUnitTest obj1=new JUnitTest();
        assertEquals("Felight", obj1.getName());
    }

    @Test(timeout = 1000)
    public void setName() throws Exception {

    }

}