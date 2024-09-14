package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = (Dog) context.getBean("myDog", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = (Dog) context.getBean("myDog", Dog.class);
        yourDog.setName("Strelka");


        System.out.println("Переменные ссылаются на один и тот же объект? "
        + (myDog==yourDog));
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());



        context.close();
    }
}
