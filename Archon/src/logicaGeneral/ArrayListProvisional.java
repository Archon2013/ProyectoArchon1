/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaGeneral;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author Alexander
 */
public class ArrayListProvisional {
    ArrayList <Jugador> Usuarios=new ArrayList();
    
    
    public void AgregarUsuario(String user,String NUser,Calendar FNaci,String Ava,String Pass)
    {
            existe(user);
                       
            Usuarios.add(new Jugador(user,NUser,FNaci,Ava,Pass));
            
        
    }
    
    public boolean existe(String user)
    {
        for(Jugador c:Usuarios)
        {
           if(c.username.equals(user))
           {
               return true;
           } 
        }
        return false;
    }
    public void imprimir()
    {
        for(Jugador c:Usuarios)
        {
           
        }
    }
}
