package com.example.helloworld.dfe;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class JBankApiTest {


    @Test
    public void test1() throws Exception {
        String ip = "182.119.148.170";
        String port = "7777";

        InputStream inputStream = JBankApiTest.class.getResourceAsStream("/jbank-api-body1.xml");

        StringBuffer buffer = new StringBuffer();
        byte[] bytes = new byte[1024];

        while (inputStream.read(bytes) > 0) {
            buffer.append(new String(bytes));
        }


        System.out.println("buffer.toString() = " + buffer.toString());

        String body2 = "";

        System.out.println("true = " + true);
    }


}
