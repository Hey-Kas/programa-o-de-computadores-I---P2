#criar 3 objetos e no min 3 características deles

class Oc:
    def __init__(self, nome, raca,genero, idade ):
        self.nome = nome
        self.raca = raca
        self.genero = genero
        self.idade = idade

    def falar(self, objectself):
        return f"{self.nome} acena para {objectself}.\n"
    def andar(self, lugar):
        return f"{self.nome} está indo até {lugar}.\n"
    def atacar(self, objectself, poder):
        return f"{self.nome} ataca {objectself} usando a habilidade {poder}.\n"
        
Oc1 = Oc("Natrix","Híbrido", "Feminino", 27)
Oc2 = Oc("Zack","Humano","Masculino", 19)
Oc3 = Oc("Cameron", "Tiefling", "Masculino", 23)

print(f"Nome: {Oc1.nome}, Raça: {Oc1.raca}, Gênero: {Oc1.genero}, Idade: {Oc1.idade}")
print(f"Nome: {Oc2.nome}, Raça: {Oc2.raca}, Gênero: {Oc2.genero}, Idade: {Oc2.idade}")
print(f"Nome: {Oc3.nome}, Raça: {Oc3.raca}, Gênero: {Oc3.genero}, Idade: {Oc3.idade}\n")

print (Oc3.falar(Oc1.nome))
print(Oc2.andar("o canto da sala"))
print(Oc1.atacar(Oc3.nome,"Bola de Fogo"))