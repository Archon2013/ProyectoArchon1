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
    
    
    public void AgregarUsuario(int id,String user,String NUser,Calendar FNaci,String Ava,String Pass)
    {
        Usuarios.add(new Jugador(id,user,NUser,FNaci,Ava,Pass));
    }
    
    public void imprimir()
    {
        for(Jugador c:Usuarios)
        {
            System.out.println(Usuarios.toString());;
        }
    }
}
