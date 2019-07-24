package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Gelson Tavares
 */
public class Dados {

    private final int mxusuario = 20;
    private final int mxautomovel = 20;
    private final int mxcliente = 5;
    Usuarios Musuario[] = new Usuarios[mxusuario];
    Automovel Maumovel[] = new Automovel[mxautomovel];
    Cliente MCliente[] = new Cliente[mxcliente];
    private int contusuario = 0;
    private int contautomovel = 0;
    private int contcliente = 0;

    private int numvenda = 0;

    public Dados() {
        PrencherUsuario();

       
        Automovel Mautomoveis;
        Mautomoveis = new Automovel(1, "BMW", 5000, "BMW, PRETO");
        Maumovel[contautomovel] = Mautomoveis;
        contautomovel++;

        Mautomoveis = new Automovel(2, "MERCEDES", 12000, "MERCEDES, AZUL");
        Maumovel[contautomovel] = Mautomoveis;
        contautomovel++;

        Mautomoveis = new Automovel(3, "ACURA", 15000, "ACURA, PRETO");
        Maumovel[contautomovel] = Mautomoveis;
        contautomovel++;

        Mautomoveis = new Automovel(4, "TOYOTA", 5000, "TOYOTA, VERMELHO");
        Maumovel[contautomovel] = Mautomoveis;
        contautomovel++;

        Cliente Mclientes;
        Mclientes = new Cliente(1, 1, "Gelson", "Tavares", "ilhéu", "9819819", 6,
                Utilidades.StringtoDate("2019/06/11"),
                Utilidades.StringtoDate("2000/04/05"), "gelsontavares956@gmail.com");
        MCliente[contcliente] = Mclientes;
        contcliente++;

        Mclientes = new Cliente(2, 1, "Danildo", "Tavares", "vila maria", "9819819", 4,
                Utilidades.StringtoDate("2019/06/11"),
                Utilidades.StringtoDate("2000/04/05"), "danildo@gmail.com");
        MCliente[contcliente] = Mclientes;
        contcliente++;

        Mclientes = new Cliente(3, 1, "Celmilton", "Boa Morte", "palha", "9819819", 3,
                Utilidades.StringtoDate("2019/06/11"),
                Utilidades.StringtoDate("2000/04/05"), "celmilton@gmail.com");
        MCliente[contcliente] = Mclientes;
        contcliente++;

        Mclientes = new Cliente(4, 2, "Carla", "Gaty", "vila maria", "9819819", 4,
                Utilidades.StringtoDate("2019/06/11"),
                Utilidades.StringtoDate("2000/04/05"), "carla@gmail.com");
        MCliente[contcliente] = Mclientes;
        contcliente++;

        Mclientes = new Cliente(5, 2, "Gunilda", "Menezes", "rua 3 fevereiro", "9819819", 5,
                Utilidades.StringtoDate("2019/06/11"),
                Utilidades.StringtoDate("2000/04/05"), "guinilda@gmail.com");
        MCliente[contcliente] = Mclientes;
        contcliente++;

    }

    public int NUsuario() {
        return contusuario;
    }

    public int NAutomovel() {
        return contautomovel;
    }

    public int NCliente() {
        return contcliente;
    }

    public Usuarios[] getUsuarios() {
        return Musuario;
    }

    public Automovel[] getAutomovel() {
        return Maumovel;
    }

    public Cliente[] getCliente() {
        return MCliente;
    }

    public boolean validarUsuario(String usuario, String senha) {
        
        for (int i = 0; i < contusuario; i++) {
            if (Musuario[i].getIdusuario().equals(usuario) && Musuario[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public int getPerfil(String usuario) {

        for (int i = 0; i < contusuario; i++) {
            if (Musuario[i].getIdusuario().equals(usuario)) {
                return Musuario[i].getPerfil();
            }
        }
        return -1;

    }

    public int LinhaUsuario(String usuario) {
        for (int i = 0; i < contusuario; i++) {
            if (Musuario[i].getIdusuario().equals(usuario)) {
                return i;
            }
        }
        return -1;

    }

    public int LinhaAutomovel(int automovel) {
        for (int i = 0; i < contautomovel; i++) {
            if (Maumovel[i].getIdautomovel()==(automovel)) {
                return i;
            }
        }
        return -1;

    }

    public int LinhaCliente(int automovel) {
        for (int i = 0; i < contcliente; i++) {
            if (MCliente[i].getIdcliente()==(automovel)) {
                return i;
            }
        }
        return -1;

    }

    public String CadUsuario(Usuarios MMusuario) {
        if (contusuario == mxusuario) {
            return "Voce não tem mais espaço";
        }
        Musuario[contusuario] = MMusuario;
        contusuario++;
        return "Cadastrado com sussesso";
    }

    public String CadAutomovel(Automovel MMautomovel) {
        if (contautomovel == mxautomovel) {
            return "Voce não tem mais espaço";
        }
        Maumovel[contautomovel] = MMautomovel;
        contautomovel++;
        return "Cadastrado com sussesso";
    }

    public String CadCliente(Cliente MMcliente) {
        if (contcliente == mxcliente) {
            return "Voce não tem mais espaço";
        }
        MCliente[contcliente] = MMcliente;
        contcliente++;
        return "Cadastrado com sussesso";
    }

    public String EditarUsuario(Usuarios MMusuario, int poslinha) {
        Musuario[poslinha].setNome(MMusuario.getNome());
        Musuario[poslinha].setSobnome(MMusuario.getSobnome());
        Musuario[poslinha].setSenha(MMusuario.getSenha());
        Musuario[poslinha].setSenha(MMusuario.getSenha());
        Musuario[poslinha].setPerfil(MMusuario.getPerfil());

        return "Editado com sussesso";
    }

    public String EditarAutomovel(Automovel MMautomovel, int poslinha) {
        Maumovel[poslinha].setPreco(MMautomovel.getPreco());
        Maumovel[poslinha].setModelo(MMautomovel.getModelo());
        Maumovel[poslinha].setObservacao(MMautomovel.getObservacao());

        return "Editado com sussesso";
    }

    public String EditarCliente(Cliente MMcliente, int poslinha) {
        MCliente[poslinha].setIdentificacao(MMcliente.getIdentificacao());
        MCliente[poslinha].setNome(MMcliente.getNome());
        MCliente[poslinha].setSobnome(MMcliente.getSobnome());
        MCliente[poslinha].setTelefone(MMcliente.getTelefone());
        MCliente[poslinha].setEndereco(MMcliente.getEndereco());
        MCliente[poslinha].setBairo(MMcliente.getBairo());
        MCliente[poslinha].setDatavenda(MMcliente.getDatavenda());
        MCliente[poslinha].setDatanascimento(MMcliente.getDatanascimento());
        MCliente[poslinha].setEmail(MMcliente.getEmail());

        return "Editado com sussesso";
    }

    public String DeletarUsuario(int poslinha) {
        for (int i = poslinha; i < contusuario - 1; i++) {
            Musuario[i] = Musuario[i + 1];
        }
        contusuario--;
        return "Deletado com sussesso";
    }

    public String DeletarAutomovel(int poslinha) {
        for (int i = poslinha; i < contautomovel - 1; i++) {
            Maumovel[i] = Maumovel[i + 1];
        }
        contautomovel--;
        return "Deletado com sussesso";
    }

    public String DeletarCliente(int poslinha) {
        for (int i = poslinha; i < contcliente - 1; i++) {
            MCliente[i] = MCliente[i + 1];
        }
        contcliente--;
        return "Deletado com sussesso";
    }
// Metodo de Cadastro Geral
    public void CadastroGeral() {
        SalvarUsuario();
       
        
    }
    
     
    // salvar Usuario/ guardando no bloco de notas:
    
    public void SalvarUsuario() {
        FileWriter FW = null;
        PrintWriter PW;

        try {
            FW = new FileWriter("BancoDB/usuario.txt");
            PW = new PrintWriter(FW);

            for (int i = 0; i < contusuario; i++) {
                PW.println(Musuario[i].Tostring());
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {

            try {
                if (FW != null) {
                    FW.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
        // salvar automovel

    
      // prencher Usuario

    private void PrencherUsuario() {
        File arquivo = null;
        FileReader Fr = null;
        BufferedReader BR = null;

        try {

            arquivo = new File("BancoDB/usuario.txt");
            Fr = new FileReader(arquivo);
            BR = new BufferedReader(Fr);

            int pos;
            String Ax;
            String linha;

            String idusuario;
            String nome;
            String sobnome;
            String senha;
            int perfil;

            while ((linha = BR.readLine()) != null) {
                pos = linha.indexOf("-");
                Ax = linha.substring(0, pos);
                idusuario = Ax;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf("-");
                Ax = linha.substring(0, pos);
                nome = Ax;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf("-");
                Ax = linha.substring(0, pos);
                sobnome = Ax;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf("-");
                Ax = linha.substring(0, pos);
                senha = Ax;
                linha = linha.substring(pos + 1);

                perfil = new Integer(linha);

                Usuarios Musuarios;
                Musuarios = new Usuarios(idusuario, nome, sobnome, senha, perfil);
                Musuario[contusuario] = Musuarios;
                contusuario++;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (Fr != null) {
                    Fr.close();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}
