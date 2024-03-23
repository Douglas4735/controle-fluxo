import javax.swing.JOptionPane;

public class CarroEx {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Qual o nome do Carro?");
        String anoFabricacao = JOptionPane.showInputDialog("Qual o ano de fabricação ?");
        String cor = JOptionPane.showInputDialog("Qual a cor do Veiculo?");
        String modelo = JOptionPane.showInputDialog("Qual modelo do Veiculo");

        Carro carro1 = new Carro();

        carro1.setNome(nome);
        carro1.setanoFabricacao(anoFabricacao);
        carro1.setcor(cor);
        carro1.setmodelo(modelo);

        System.out.println("Nome do carro:  " +carro1.getNome());
        System.out.println("Ano de fabricação: " +carro1.getanoFabricacao());
        System.out.println("Cor do carro: " +carro1.getcor());
        System.out.println("Modelo: " +carro1.getmodelo());
    }
}
