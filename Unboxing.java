/*
Automatic conversion of an object of a wrapper class
to its corresponding primitive type is known as
unboxing
*/

import java.util.ArrayList;

class Unboxing {
    public static void main(String[] args) {
        Character ch = 'a';

        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(24);

        int num = arrayList.get(0);

        System.out.println(num);
    }
}