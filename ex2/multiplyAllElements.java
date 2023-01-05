package ex2;

import java.util.*;
// 숫자가 들어있는 arrayList를 매개변수로 받아서 값을 다 곱하라
public class multiplyAllElements {

     public int multiply(ArrayList<Integer> arrayList) {          //매개변수를 받는 메소드 생성

        Iterator<Integer> mIterator = arrayList.iterator();       //Iterator타입의 변수 선언
        int result = 1;                                           //값을 담을 result를 선언하고 곱할 것이기 때문에 안에 1을 넣어 준다

        while (mIterator.hasNext()) {                             //hasNext를 사용하여 순환한다
            int value = mIterator.next();                         //순환하며 next로 값을 가지고 온다
            result *= value;                                      //가지고 온 값을 result에다 곱해준다
        }
        return result;                                            //result 값을 반환해준다.
    }
}
