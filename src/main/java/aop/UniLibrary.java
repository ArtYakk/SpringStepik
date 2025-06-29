package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-------------------------------------");

    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и Мир";
    }

    public void getMagazine(){
        System.out.println("Мы берем ЖУРНАЛ из UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем ЖУРНАЛ в UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем ЖУРНАЛ в UniLibrary");
        System.out.println("-------------------------------------");
    }





}
