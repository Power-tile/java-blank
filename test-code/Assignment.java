package cn.moonshotacademy.scp.vendingmachine;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component("ass")
public class Assignment {
    @Resource(name = "p")
    private Student s;

    @Value("Vending Machine")
    private String assignmentName;

    public void printInfo() {
        System.out.print("Student: ");
        this.s.printInfo();
        System.out.println("Assignment: " + this.assignmentName);
    }
}