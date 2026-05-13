#include <iostream>
#include <string>

using namespace std;

class Oc {
    public:
    string nome;
    string raca;
    int idade;
    string genero;
    
    Oc(string n, string r, string g,  int i){
        nome = n;
        raca = r;
        genero = g;
        idade = i;
    }
    
    string falar(string objectself){
        return nome + " acena para " + objectself + ".\n";
    }
    
    string andar(string lugar){
        return nome + " está indo até " + lugar + ".\n";
    }
    
    string atacar(string objectself, string poder){
        return nome + " ataca " + objectself + " usando a habilidade " + poder + ".\n";
    }
};
 int main (){
     Oc Oc1("Natrix","Híbrido", "Feminino", 27);
     Oc Oc2("Zack","Humano","Masculino", 19);
     Oc Oc3("Cameron", "Tiefling", "Masculino", 23);
     
     cout << "Nome:" << Oc1.nome << ", Raça:"<< Oc1.raca << ", Gênero:"<< Oc1.genero << ", Idade:"<< Oc1.idade << endl;
     cout << "Nome:" << Oc2.nome << ", Raça:"<< Oc2.raca << ", Gênero:"<< Oc2.genero << ", Idade:"<< Oc2.idade << endl;
     cout << "Nome:" << Oc3.nome << ", Raça:"<< Oc3.raca << ", Gênero:"<< Oc3.genero << ", Idade:"<< Oc3.idade << "\n"<<endl;
     
     
cout << Oc3.falar(Oc1.nome)<<endl;
cout << Oc2.andar("o canto da sala")<<endl;
cout << Oc1.atacar(Oc3.nome,"Bola de Fogo")<< endl;
     return 0;
 }