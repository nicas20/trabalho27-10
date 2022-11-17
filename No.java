public class No<T> {
    private T conteudo;
    private No<T> prox;

    private No<T> anterior;

    public No(T conteudo, No<T> proximo) {
        this.conteudo = conteudo;
        this.prox = proximo;
    }

    public T getConteudo() {

        return conteudo;
    }

    public void setConteudo(T conteudo) {

        this.conteudo = conteudo;
    }

    public No<T> getProx() {

        return prox;
    }

    public void setProximo(No<T> proximo) {

        this.prox = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}