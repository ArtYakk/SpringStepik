package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
//@Scope("singleton")
public class Dog implements Pet {
//    private String name;

    public Dog(){
        System.out.println("Dog bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @PostConstruct
    public void init(){
        System.out.println("Class dog: init method called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class dog: destroy method called");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");

    }
}
