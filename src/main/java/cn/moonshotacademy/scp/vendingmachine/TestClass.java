package cn.moonshotacademy.scp.vendingmachine;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestClass {
    private String msg;

    public void printMessage() {
        System.out.println(this.msg);
    }
}