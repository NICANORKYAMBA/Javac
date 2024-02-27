/* 
Automatic conversion of primitive data types to the
object of their corresponding wrapper classes is known
 as autoboxing
*/

import java.util.ArrayList;

class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';

        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(25);

        System.out.println(arrayList.get(0));
    }
}