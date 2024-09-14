package spring_introduction;

public class Dog implements Pet {
    public Dog(){
        System.out.println("Dog constructor called");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");

    }
}
