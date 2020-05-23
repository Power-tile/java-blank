package cn.moonshotacademy.scp.vendingmachine;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student extends Person {
    private Integer classIndex;

    @Override
    public void printInfo() {
        System.out.println(this.name + ", aged " + this.age.toString() + " in class " + this.classIndex.toString());
    }
}