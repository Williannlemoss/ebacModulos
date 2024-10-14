public class Main {
    public static void main(String[] args) {
        Class<Produto> clazz = Produto.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Valor da anotação Tabela: " + tabela.value());
        } else {
            System.out.println("A anotação Tabela não está presente.");
        }
    }
}