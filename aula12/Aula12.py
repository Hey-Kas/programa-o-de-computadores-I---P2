class Insumo:
    def __init__(self, nome, quantidade, mes_validade):
        self.__nome = nome
        self.__quantidade = quantidade
        self.__mes_validade = 1  # valor inicial seguro
        self.set_mes_validade(mes_validade)

    def set_mes_validade(self, mes):
        if 1 <= mes <= 12:
            self.__mes_validade = mes
        else:
            print("ALERTA: Mês inválido! Digite um valor entre 1 e 12.")

    def esta_valido(self, mes_atual):
        if self.__mes_validade < mes_atual:
            print("ALERTA: Risco de Amendoim Murcho! Produto Vencido")
            return False
        return True

    def exibir_dados(self):
        print(f"Nome: {self.__nome}")
        print(f"Quantidade: {self.__quantidade}")
        print(f"Mês de validade: {self.__mes_validade}")

insumo = Insumo("Amendoim", 50, 8)

insumo.exibir_dados()

mes_atual = 7

if insumo.esta_valido(mes_atual):
    print("Produto válido.")
else:
    print("Produto vencido.")