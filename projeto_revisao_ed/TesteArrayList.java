package projeto_revisao_ed;

import java.util.ArrayList;

public class TesteArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Elemento A");
        arrayList.add("Elemento C");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento B ");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("Elemento C");
        if (existe) {
            System.out.println("Elemento encontrado no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        int posicao = arrayList.indexOf("Elemento C");
        if (posicao > -1) {
            System.out.println("Elemento encontrado no index n° " + posicao);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        arrayList.remove(0);
        arrayList.remove("Elemento C");

        System.out.println(arrayList);
    }
}
