package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book){
        System.out.println("Мы берем книгу \"" + book.getName() + "\" из UniLibrary");
    }

    public void getMagazine(){
        System.out.println("Мы берем ЖУРНАЛ  из UniLibrary");
    }

    protected String returnBook(){
        //System.out.println("Мы возвращаем книгу в UniLibrary");
        return "вернул книгу";
    }
}
