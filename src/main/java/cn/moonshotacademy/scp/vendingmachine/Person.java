package cn.moonshotacademy.scp.vendingmachine;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    protected String name;
    protected Integer age;

    public void printInfo() {
        System.out.println(this.name + ", aged " + this.age.toString());
    }
}