

import java.util.Scanner;
import java.util.Stack;

public class stackimplimentation {
    public static void main(String[] args) {
        Stack<Integer>si=new Stack<>();
        si.push(1);
        si.add(0);
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number of pushes");
//        int n=sc.nextInt();
//        int element;
//        for (int i = 0; i <n; i++) {
//            System.out.println("enter the element to push "+i);
//            element=sc.nextInt();
//            si.push(element);

//        }
        si.add(12);
        System.out.println("seacrhing results"+si.search(0));
        System.out.print("{");
        for (int i = 0; i < si.toArray().length; i++) {
            System.out.print(si.pop()+",");

        }
        System.out.print(si.pop());
        System.out.print("}");
        try{
            si.peek();
        } catch (Exception e) {
            System.out.println("si is empty "+e.getMessage());
        }
        System.out.println("------------------------------------------------------------");

        String a="Atharv";
        Stack<Character>Sc=new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            Sc.push(a.charAt(i));
        }
        for (int i = 0; i < Sc.toArray().length; i++) {
            System.out.println(Sc.pop());
        }

    }

}
