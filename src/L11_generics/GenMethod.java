package L11_generics;

import java.util.ArrayList;

public class GenMethod {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("GFG");
        genericDisplay(1.00);

        // Let's check some property of ArrayList

        ArrayList al = new ArrayList();

        al.add("smk");
        // here type casting is must because here we are not using Generics
        String s1 = (String)al.get(0);
        System.out.println(s1);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(15);
        al2.add(123);

        int val1 = al2.get(0);
        System.out.println(val1);
    }
}
