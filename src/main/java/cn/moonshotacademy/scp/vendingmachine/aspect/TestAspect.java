package cn.moonshotacademy.scp.vendingmachine.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component("testAspect")
public class TestAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Start log: " + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("End log: " + joinPoint.getSignature().getName());
        return object;
    }
}