/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class TestCliente {
static ArrayList<Cliente> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClienteDAO clidao;
        clidao = new ClienteCtrlImpl();
        list = clidao.readCliente();
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
//        
        // TODO code application logic here
    
        Cliente cli=new Cliente();
        cli.setId_cliente("3");
        cli.setNombres_razon_social("richard");
        cli.setTelefono("3456");
        cli.setCorreo("stita");
        cli.setDni_ruc("55666");
       if(clidao.createCliente(cli)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       }
    }
    
    
}
