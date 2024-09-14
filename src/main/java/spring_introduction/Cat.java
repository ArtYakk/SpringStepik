package spring_introduction;

public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat constructor called");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
