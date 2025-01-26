/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pewarisan;

/**
 *
 * @author ACER
 */
class herbivora{
    public void mencarimakan(){
        System.out.println("mencari tumbuhan");
    }
}
class sapi extends herbivora{
    public void makan (){
        System.out.println("makan rumput");
    }
}
public class Pewarisan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        herbivora input1=new herbivora();
        sapi input2=new sapi ();
        input1.mencarimakan();
        input2.makan();
        
    }
    
}
