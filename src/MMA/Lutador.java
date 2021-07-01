package MMA;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private  float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas,empates;
    
    public Lutador(String no,String na,int id,float al,float pe,int vi,int de,int em){
                
        nome=no;
        nacionalidade= na;
        idade=id;
        altura=al;
        this.Setpeso(pe);
        vitorias=vi;
        derrotas=de;
        empates=em;
        
    }
    
        public void apresentar(){
        System.out.println("Apresentando o Lutador "+this.Getnome());
        System.out.println("Pais "+this.Getnacionalidade());
        System.out.println("Com "+this.Getidade()+ " anos");
        System.out.println("Tem "+this.Getaltura()+"m de altura");
        System.out.println("Pesando "+this.Getpeso()+" Kg");
        System.out.println("=-==-=-=-=-=- CARTEL MMA =-=-=-=-=-=-=-=");
        System.out.println("Vitorias: "+this.Getvitorias());
        System.out.println("Derrotas: "+this.Getderrotas());
        System.out.println("Empates: "+this.Getempates());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void info (){
        System.out.println(this.Getnome()+" luta na divisao de peso");
        System.out.println("Categoria de peso:"+this.Getcategorias());
        System.out.println("Possui,"+this.Getvitorias()+" vitorias: " +this.Getderrotas()+" derrotas: "+ this.Getempates()+" empates:");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void ganharluta(){
        this.Setvitorias(this.Getvitorias()+1);
    }
    public void perderluta(){
        this.Setderrotas(this.Getderrotas()+1);
    }
    public void empatarluta(){
        this.Setempate(this.Getempates()+1);
    }   
    
    public void Setnome(String no){
        this.nome = no;
    }
    
    public void Setnacionalidade(String na){
        this.nacionalidade = na;
    }
    
    public void Setidade(int id){
        this.idade = id;
    }
    
    public void Set(float al){
        this.altura= al;
    }
    
    public final void Setpeso(float peso){
        this.peso=peso;
        this.SetCategoria();
    }
    
    private void SetCategoria(){
        if (this.peso < 52.2) {
            this.categoria="Peso invalido.";
        }else if (this.peso < 70.5) {
            this.categoria="Peso leve.";
        }else if (this.peso <= 83.9) {
           this.categoria="Peso Medio.";
        }else if (this.peso <= 120.0) {
            this.categoria="Peso Pesado.";
        }else{
            this.categoria="Categoria invalida.";
        }
}
    
    public void Setvitorias(int vi){
        this.vitorias = vi;
    }
    
    public void Setderrotas(int de){
        this.derrotas=de;
    }
    
    public void Setempate(int em){
        this.empates=em;
    }
    
   public String Getnome (){
       return this.nome;
   }
   
   public String Getnacionalidade(){
       return this.nacionalidade;
   }
   
   public int Getidade(){
       return this.idade;
   }
   
   public float Getaltura(){
       return this.altura;
   }
   
   public float Getpeso(){
       return this.peso;
   }
   
   public String Getcategorias(){
       return this.categoria;
   }
   
   public int Getvitorias(){
       return this.vitorias;
   }
   
   public int Getderrotas(){
       return this.derrotas;
   }
   
   public int Getempates(){
       return this.empates;
   }    
}
