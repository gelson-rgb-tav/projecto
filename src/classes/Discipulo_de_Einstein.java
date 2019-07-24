 
package classes;

import formularios.frmLogin;



/**
 *
 * @author Gelson Tavares
 */
public class Discipulo_de_Einstein {

 
    public static void main(String[] args) {
        Dados clsdados = new Dados();

        frmLogin login = new frmLogin();
        login.setDados(clsdados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
   
}
