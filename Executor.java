public class Executor {
    public static void main(String[] args) {

        ListaLigada listaLigada = new ListaLigada();
        System.out.println(listaLigada.getTamanho());

        listaLigada.adicionaInicio(32);
        listaLigada.adicionaFinal(56);
        listaLigada.adicionaFinal(78);
        System.out.println(listaLigada.getTamanho());

        listaLigada.mostrarNos();
        listaLigada.mostrarNos();

        listaLigada.Inicio(13);
        listaLigada.Final(35);
        listaLigada.Final(46);
        listaLigada.Final(57);
        System.out.println(listaLigada.getTamanho());

        System.out.println("Lista em ordem crescente:");
        listaLigada.crescente();
        System.out.println("Lista em ordem decrescente:");
        listaLigada.decrescente();


    }


}