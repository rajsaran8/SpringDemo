package com.archimedis.SpringDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7= context.getBean(Samsung.class);
        //s7.config();
        List<Integer>list = new ArrayList<Integer>();
        list.add(null);
        list.add(1);
        Collections.max(list);
    }
}
