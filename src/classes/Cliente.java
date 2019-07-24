
package classes;

import java.util.Date;





public class Cliente {
    
    private int idcliente; 
    private int identificacao; 
    private String nome; 
    private String sobnome; 
    private String endereco; 
    private String telefone; 
    private int bairo; 
    private Date datavenda;
    private Date datanascimento;
    private String email;

    public Cliente(int idcliente, int identificacao, String nome, String sobnome, String endereco, String telefone, int bairo, Date datavenda, Date datanascimento, String email) {
        this.idcliente = idcliente;
        this.identificacao = identificacao;
        this.nome = nome;
        this.sobnome = sobnome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.bairo = bairo;
        this.datavenda = datavenda;
        this.datanascimento = datanascimento;
        this.email = email;
    }

   

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobnome() {
        return sobnome;
    }

    public void setSobnome(String sobnome) {
        this.sobnome = sobnome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getBairo() {
        return bairo;
    }

    public void setBairo(int bairo) {
        this.bairo = bairo;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public String Tostring(){
       return idcliente + "-"
               + identificacao + "-"
               + nome + "-"
               + sobnome + "-"
               + endereco + "-"
               + telefone + "-"
               + bairo + "-"
               + datavenda + "-"
               + datanascimento + "-"
               + email;
   }
      
}
