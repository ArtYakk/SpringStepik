package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("Before getBookAdvice: попытка получить книгу");
    }

    @Before("execution(* return*())")
    public void beforeReturnBookAdvice(){
        System.out.println("Before returnBookAdvice: попытка вернуть книгу");
    }
}
