public class FormatadoeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            System.out.println("O cep não corresponde as regras de negocio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeption{
        if(cep.length() != 8)
         throw new CepInvalidoExeption();

        return "23.765-064";
    }
}
