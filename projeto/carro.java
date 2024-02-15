public class carro {

    public static void main(String[]args){
        cliente Cliente1 = new cliente();

        Cliente1.setNome("Douglas");
        Cliente1.setIdade(33);
        Cliente1.setNumeroCpf("005.192.202-92");

        System.out.println("nome é: " + Cliente1.getNome());
        System.out.println("idade é: " + Cliente1.getIdade());
        System.out.println("seu cpf é: " + Cliente1.getNumeroCpf());
        System.out.println("---------------------------------------");

        cliente Cliente2 = new cliente();
        
        Cliente2.setNome("fernanda");
        Cliente2.setIdade(25);
        Cliente2.setNumeroCpf("037.589.965-93");

        System.out.println("Nome é: " + Cliente2.getNome());
        System.out.println("idade é: " + Cliente2.getIdade());
        System.out.println("Seu CPF é: " + Cliente2.getNumeroCpf());
        System.out.println("--------------------------------------");
    }
}