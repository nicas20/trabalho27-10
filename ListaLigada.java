public class ListaLigada<T> {
    private No<T> primeiro;
    private int tamanho;

    public ListaLigada() {
        primeiro = null;
        tamanho = 0;

    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaFinal(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    private No<T> anterior() {
        No<T> antes = primeiro;
        while (antes.getProx() != null) {
            antes = antes.getProx();
        }
        return antes;
    }

    public void adicionaInicio(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null);
        primeiro = novoNo;
        tamanho++;
    }

    public void crescente() {
        No<T> prox = this.primeiro;
        int contador = 0;
        System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + prox.getConteudo());
        contador++;
        while (prox.getProx() != null) {
            prox = prox.getProx();
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + prox.getConteudo());
        }
    }

    public void decrescente() {
        No<T> anterior = this.anterior();
        int contador = 0;
        System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + anterior.getConteudo());
        contador++;
        while (anterior.getAnterior() != null) {
            anterior = anterior.getAnterior();
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + anterior.getConteudo());
            contador++;
        }

    }

    public void Inicio(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null);
        primeiro = novoNo;
        tamanho++;
    }

    public void mostrarNos() {
        if (tamanho != 0) {
            No<T> atual = primeiro;
            int contador = 0;
            while (atual.getProx() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProx();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }

    public void Final(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }


}