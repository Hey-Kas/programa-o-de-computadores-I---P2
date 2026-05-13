
public class Oc {
    String nome;
    String raca;
    int idade;
    String genero;

    public Oc(String nome, String raca, String genero, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.genero = genero;
    }

    String falar(String objectself){
        return nome + " acena para " + objectself + ".\n";
    }
    
    String andar(String lugar){
        return nome + " está indo até " + lugar + ".\n";
    }
    
    String atacar(String objectself, String poder){
        return nome + " ataca " + objectself + " usando a habilidade " + poder + ".\n";
    }

    public static void main(String[] args){
        Oc Oc1 = new Oc("Natrix","Híbrido", "Feminino", 27);
        Oc Oc2 = new Oc("Zack","Humano","Masculino", 19);
        Oc Oc3 = new Oc("Cameron", "Tiefling", "Masculino", 23);
     
        System.out.println("Nome:" + Oc1.nome + ", Raça:"+ Oc1.raca + ", Gênero:"+ Oc1.genero + ", Idade:" + Oc1.idade);
        System.out.println("Nome:" + Oc2.nome + ", Raça:"+ Oc2.raca + ", Gênero:"+ Oc2.genero + ", Idade:" + Oc2.idade);
        System.out.println("Nome:" + Oc3.nome + ", Raça:"+ Oc3.raca + ", Gênero:"+ Oc3.genero + ", Idade:" + Oc3.idade + "\n");

                
        System.out.println(Oc3.falar(Oc1.nome));
        System.out.println(Oc2.andar("o canto da sala"));
        System.out.println(Oc1.atacar(Oc3.nome,"Bola de Fogo"));
    }
}