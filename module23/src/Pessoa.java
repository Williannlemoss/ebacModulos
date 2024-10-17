public class Pessoa {

    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isFemale(){
        return genero.equals("F") || genero.equals("f");
    }

    @Override
    public String toString() {
        return String.format("nome: %s, genero: %s", nome, genero);
    }
}
