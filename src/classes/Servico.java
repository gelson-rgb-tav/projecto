
package classes;

public class Servico {
    private double valor;
    private String descricao;
    private int aux;

    public Servico(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
       
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux += aux;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao + "";
    }
   
    public void calcularPreco(int c, int p){
        this.valor = c*p;
        
    }
}
