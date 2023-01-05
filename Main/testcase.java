package Main;

import ex2.multiplyAllElements;

import java.util.ArrayList;

public class testcase {
    public static void main(String[] args) {

        ArrayList<Integer> result = new ArrayList<>();
        multiplyAllElements multiplyAllElements = new multiplyAllElements();

        for (int i = 1; i < 6; i++) {
            result.add(i);
        }

        System.out.println(multiplyAllElements.multiply(result));
    }
}
