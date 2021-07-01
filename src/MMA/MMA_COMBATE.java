/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMA;

/**
 *
 * @author levi1
 */
public class MMA_COMBATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Lutador L[ ] = new Lutador[6];
             
        L[0] = new Lutador ("Levi Deyvid", "Brasil" ,22 ,1.70f ,54.00f ,9 ,0 ,1);
        
        L[1] = new Lutador("Pretty Boy", "França" ,28 ,1.75f ,60.00f , 12, 3, 0);
        
        L[2] = new Lutador("Spartano","Canadá" ,32,1.82f ,78.00f, 20 ,4,3);
        
        L[3] = new Lutador("Ryder","Estados Unidos" ,26 ,1.83f,80.00f,15,2,3);
        
        L[4] = new Lutador("Tyson","Estados Unidos" ,29, 1.78f, 86f, 22, 6, 0);
        
        L[5]= new Lutador("Dc Dog","Italia",34,1.92f,87f, 24 ,3,0);
        
        Octogono luta = new Octogono();
        luta.aprovarluta(L[0], L[1]);
        luta.lutar();
        L[0].info();
        L[1].info();
        
   }
}