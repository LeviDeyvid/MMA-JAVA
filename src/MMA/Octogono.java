package MMA;

import java.util.Random;

public class Octogono {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void aprovarluta(Lutador L1, Lutador L2){
        if (L1.Getcategorias().equals(L2.Getcategorias())
         && L1 != L2) {
            this.aprovada=true;
            this.desafiado=L1;
            this.desafiante=L2;
        }  else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("###Desafiado");
           this.desafiado.apresentar();
            System.out.println("###Desafiante");
            this.desafiante.apresentar();
        
            Random aleatorio = new Random();
            int Vencedor = aleatorio.nextInt(3);
            System.out.println("========== Resultado da Luta ===========");
            switch(Vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1:
                    System.out.println("Vitoria do "+this.getDesafiante().Getnome());
                    this.desafiado.perderluta();
                    this.desafiante.ganharluta();
                    break;
                case 2:
                    System.out.println("Vitoria do "+this.getDesafiado().Getnome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }else{
            System.out.println("A LUTA NÃO PODE ACONTECER !");
            System.out.println("CATEGORIAS DE PESO DIFERENTES.");
    }
    
    }
    
    public void setDesafiado(Lutador dd){
        this.desafiado=dd;
    }
    
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    
    public void setDesafiante(Lutador te){
        this.desafiante=te;
    }
    
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public void setRounds(int rs){
        this.rounds=rs;
    }
    
    public int getRounds(){
        return this.rounds;
    }
    
    public void setAprovada(boolean ap){
        this.aprovada=ap;
    }
    
    public boolean getAprovada(){
        return this.aprovada;
    }
}

