package com.lexicon.emil.Assignment_12_Spring_Framework;

import com.lexicon.emil.Assignment_12_Spring_Framework.service.StudentManagement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentManagement management = context.getBean(StudentManagement.class);
    }
}
