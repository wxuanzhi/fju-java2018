package com.wxuan;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name");
        String name = Scanner.nextline();
        System.out.println(name);
		
		
		
		
		
        System.out.println("Hello World");
        /*int age = 18;
        float weight = 47f;
        float height = 153.4f;
        String name = "Wxuanzhi";
        int schoolYear = 107;
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(name);
        System.out.println(schoolYear);*/
        
        Person p = new Person(47f,1.534f);
        p.weight = 47f;
        p.height = 1.534f;
        System.out.println(p.bmi());
        p.hello();
//        Person jack = null;
//        jack.hello();
        
        System.out.println(wxuan" 70 80 90");
        String name = "wxuan";
        int english = 70;
        int math = 90;
        System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2)

        Student stu = new Student();
        stu.name = "wxuan";
        stu.english = 70;
        stu.math = 90;
        stu.print();
        System.out.println (3 <= 5);

        		
	}

}
