import java.util.*;

public class makeArrayList {
    public static void main(String[] args) {
        //ArrayList를 선언하고 ABCDE를 담기

        //spelling 이라는 ArrayList를 Character 형으로 선언한다. 철자 하나씩만 넣을 것이기 때문에 char형으로 선언함
        ArrayList<Character> spelling = new ArrayList<>();

        // ArrayList에 담아주기 위해 for문을 사용
        for (char word = 'A'; word < 'F'; word++) {
            spelling.add(word);
        }

        // spelling 출력
        System.out.println(spelling);

    }
}
