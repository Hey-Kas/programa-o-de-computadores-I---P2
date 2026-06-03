try:
    idade = int(input("Digite sua idade: "))
    print("Idade cadastrada:", idade)

except ValueError:
    print("Erro: Insira apenas caracteres numéricos.")

try:
    with open("log_sistema.txt", "w") as arquivo_log:
        arquivo_log.write("Sistema iniciado com sucesso.\n")

    print("Arquivo de log criado com sucesso.")

except Exception as erro:
    print("Erro ao gravar log:", erro)

finally:
    print("Rotina de persistência finalizada, recursos liberados.")

try:
    with open("dados_financeiros.json", "r") as arquivo:
        conteudo = arquivo.read()
        print("Arquivo encontrado.")

except FileNotFoundError:
    print("Arquivo não encontrado. Criando arquivo padrão...")

    with open("dados_financeiros.json", "a") as arquivo:
        arquivo.write("{\n")
        arquivo.write('    "dados": []\n')
        arquivo.write("}\n")

    print("Arquivo criado com sucesso.")