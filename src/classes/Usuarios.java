
package classes;

public class Usuarios {
   private String idusuario;
   private String nome;
   private String sobnome;
   private String senha;
   private int perfil;

    public Usuarios(String idusuario, String nome, String sobnome, String senha, int perfil) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.sobnome = sobnome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

   public String Tostring(){
       return idusuario + "-"
               + nome + "-"
               + sobnome + "-"
               + senha + "-"
               + perfil;
               
   }
    
    
}
