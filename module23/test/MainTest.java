import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void sãoMulheres() {
        List<Pessoa> mulheres = Main.generatePessoas();
        assertTrue(mulheres.isEmpty() || mulheres.stream().allMatch(Pessoa::isFemale));
    }
}
