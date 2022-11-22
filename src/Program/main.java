package Program;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o tamanho do vetor para ser ordernado: ");
        
        int tamanho = sc.nextInt();
        
        int[] v = new int[tamanho];
        
        for(int i =0; i < tamanho; i++){
            System.out.print("Digite um valor para ser armazenado na posicao " + i + " do vetor: ");
        
            v[i] = sc.nextInt();
            
        }

        quicksort(v, 0, v.length - 1);
        
        System.out.print("Vetor ordenado de forma crescente: " + Arrays.toString(v));
        
        System.out.println("");
        
        sc.close();

    }

    private static void quicksort(int[] v, int esq, int dir) {

        if (esq < dir) {
            int j = separar(v, esq, dir);
            quicksort(v, esq, j - 1);
            quicksort(v, j + 1, dir);
        }

    }

    private static int separar(int[] v, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = v[esq];

        while (i <= j) {
            if (v[i] <= pivo) {
                i++;
            } else if (v[j] > pivo) {
                j--;
            } else if (i <= j) {
                trocar(v, i, j);
                i++;
                j--;
            }
        }
        trocar(v, esq, j);
        return j;
    }

    private static void trocar(int[] v, int i, int j) {
        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

}
