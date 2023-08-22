package projeto_revisao_ed;
public class Teste {
    public static void main(String[] args)throws Exception{
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Claudio", "claudio@gmail.com", "11934399523");
        Contato c2 = new Contato("Eric", "eric@gmail.com", "11934399646");
        Contato c3 = new Contato("Cabelo", "cabelo@gmail.com", "11934399666");

        try {
            vetor.adicionar(c1);
            vetor.adicionar(c2);
            vetor.adicionar(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Tamanho vetor: " + vetor.tamanho());

        System.out.println(vetor);
    }
}
