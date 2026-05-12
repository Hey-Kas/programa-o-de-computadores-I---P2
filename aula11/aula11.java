public class Oc {
    string nome;
    string raca;
    int idade;
    string genero;

    public Oc(string nome, string raca, int idade, string genero){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.genero = genero;
    }

    public string falar(){
        return nome + "acena";
    }
    
    string andar(string lugar){
        return nome + "está indo até" + lugar + ".";
    }
    
    string atacar(Oc, string poder){
        return nome + "ataca" + Oc + "usando a habilidade" + poder + ".";
    }

    public static void main(string[] args){
        
    }
}