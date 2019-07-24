
package classes;

public class Automovel {
    private int idautomovel;
    private String modelo;
    private int preco;
    private String observacao;

    

    public Automovel(int idautomovel, String modelo, int preco, String observacao) {
       this.idautomovel = idautomovel;
       this.modelo = modelo;
       this.preco = preco;
        this.observacao = observacao;
    }

    public int getIdautomovel() {
        return idautomovel;
    }

    public void setIdautomovel(int idautomovel) {
        this.idautomovel = idautomovel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String Tostring(){
       return idautomovel + "-"
               + modelo + "-"
               + observacao;
               
   }
    
    
}
