package com.interview2.sboot.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class MainApplicationClass 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MainApplicationClass.class, args);
        System.out.println( "Hello World!" );
    }
}
