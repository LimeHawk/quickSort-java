package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("tamanho da lista de numeros ? ");

        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Elemento " + i  + ": ");
            int elemento = scanner.nextInt();
            list.add(elemento);

        }
        
        list = sort(list);
        
        for(int num: list){
            System.out.println(num + " ");
        }
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> a) {
        if (a.size() <= 0) {
            return a;
        }
        ArrayList<Integer> smaller = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        Integer pivot = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            Integer n = a.get(i);
            if (n.compareTo(pivot) < 0) {
                smaller.add(n);
            } else {
                greater.add(n);
            }
        }
        smaller = sort(smaller);
        greater = sort(greater);
        smaller.add(pivot);
        smaller.addAll(greater);
        return smaller;
    }

}
