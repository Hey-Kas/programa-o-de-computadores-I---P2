public class Main {

    public static void main(String[] args) {

    Insumo insumo = new Insumo("Amendoim", 50, 8);

    insumo.exibirDados();

    int mesAtual = 7;

    if (insumo.estaValido(mesAtual)) {
        System.out.println("Produto válido.");
    } else {
        System.out.println("Produto vencido.");
    }
}
}

class Insumo {

    private String nome;
    private int quantidade;
    private int mesValidade;

    public Insumo(String nome, int quantidade, int mesValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.mesValidade = 1; 
        setMesValidade(mesValidade);
    }

    public void setMesValidade(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mesValidade = mes;
        } else {
            System.out.println("ALERTA: Mês inválido! Digite um valor entre 1 e 12.");
        }
    }

    public boolean estaValido(int mesAtual) {
        if (mesValidade < mesAtual) {
            System.out.println("ALERTA: Risco de Amendoim Murcho! Produto Vencido");
            return false;
        }
        return true;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Mês de validade: " + mesValidade);
    }
}