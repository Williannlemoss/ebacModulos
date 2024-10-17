import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static Pessoa criarPessoa() {
        return new Pessoa("vrtfhber", new Random().nextInt() % 2 == 0 ? "f": "m");
    }

    public static List<Pessoa> generatePessoas(){
        List<Pessoa> pessoas = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            pessoas.add(criarPessoa());
        }

        pessoas = pessoas.stream().filter(Pessoa::isFemale).collect(Collectors.toList());

        pessoas.forEach(System.out::println);
        return pessoas;
    }
}