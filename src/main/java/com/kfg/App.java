package com.kfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 20;
        int b = 30;
        int c = a+b;
        int d = c*c;
        System.out.println( a +"+"+ b +"=" + c );
        System.out.println("result:" + d);
    }
}
