/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author juanj
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        datos[] dato = new datos[10];
        int contador = 1;
        // TODO code application logic here
        dato[0] = new datos("juan",201900532);
        dato[contador] = new datos("pedro",20190033);
        contador++;
        dato[contador] = new datos("lucia",201900534);
        contador++;
        
        System.out.println(dato[0].getnom());
        System.out.println(dato[0].getpass());
        //System.out.println("Nombre: "+usuario.getnom());
       login login = new login(dato);
       login.setVisible(true);                  
    }    
}
