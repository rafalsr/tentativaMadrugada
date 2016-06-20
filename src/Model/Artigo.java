package Model;

/*

 */

/**
 *    Classe destinada a representar as informações de um artigo.
 * @author Rafael
 */
public class Artigo {
    
    private String classificacao;
    private Boolean revista;
    private Boolean evento;
    private int ano;
    
    public Artigo(int ano){
        this.classificacao = "";
        revista = false;
        evento = false;
        this.ano = ano;
    }

    public Boolean getRevista() {
        return revista;
    }

    public void setRevista(Boolean revista) {
        this.revista = revista;
    }

    public Boolean getEvento() {
        return evento;
    }

    public void setEvento(Boolean conferencia) {
        this.evento = conferencia;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getAno() {
        return ano;
    }
}
