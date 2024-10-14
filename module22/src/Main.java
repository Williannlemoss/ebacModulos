import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        int opcao = 1;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        do{
            System.out.println("Digite o nome do pessoa e o genero separado por '-'");
            String pessoa = entrada.nextLine();
            if(validaPessoa(pessoa)){
                pessoas.add(new Pessoa(pessoa.split("-")[0].trim(), pessoa.split("-")[1].trim()));
                System.out.println("Cadastro finalizado com sucesso");
            }else{
                System.out.println("Cadastro finalizado com error");
            }
            System.out.println("Se deseja para de cadastrar digite 0 caso contrario digite qualquer número");
            opcao = entradaInt.nextInt();
        }while (opcao != 0);

        pessoas.stream().filter(Pessoa::isFemale).forEach(System.out::println);
    }

    private static boolean validaPessoa(String pessoa){
        if(pessoa.contains("-")){
            String[] dadosPessoa = pessoa.split("-");
            if(dadosPessoa.length != 2){
                return false;
            }

            return (dadosPessoa[1].trim().equals("M") || dadosPessoa[1].trim().equals("m") || dadosPessoa[1].trim().equals("F") || dadosPessoa[1].trim().equals("f")) && !dadosPessoa[0].trim().isBlank();

        }
        return false;
    }
}