/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaGeneral;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author Alexander
 */
public class Jugador {
    int ID=0;
    String username;
    String NombreUsuario;
    Calendar FechaNacimiento;
    String Avatar;
    String Password;
    int puntos=0;
    boolean EstaActivo=true;
    
    public Jugador(String user,String NUser,Calendar FNaci,String Ava,String Pass )
    {
       ID=ID++;
       username=user;
       NombreUsuario=NUser;
       FechaNacimiento=FNaci;
       Avatar=Ava;
       Password=Pass;
    }
}
