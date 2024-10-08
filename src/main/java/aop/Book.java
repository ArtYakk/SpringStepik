package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Хамата но гава")
    private String name;

    public String getName() {
        return name;
    }
}
