package stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Teste para {@link ReadStream}.
 *
 * @author finx
 * @created 30/07/2015
 */
public class ReadStreamTest {

    @Test
    public void exemploEnunciado() {
        Stream s = new StreamImpl("aAbBABac");
        Character resultado = ReadStream.firstChar(s);
        assertEquals(new Character('b'), resultado);
    }

    @Test
    public void exemploEnunciadoComOutraResposta() {
        Stream s = new StreamImpl("aAbBABacb");
        Character resultado = ReadStream.firstChar(s);
        assertEquals(new Character('c'), resultado);
    }

    @Test
    public void apenasCaracteresQueNaoSeRepetem() {
        Stream s = new StreamImpl("abcdefgh");
        Character resultado = ReadStream.firstChar(s);
        assertEquals(new Character('a'), resultado);
    }

    @Test
    public void sequenciaAleatoria() {
        Stream s = new StreamImpl("abcdefgha");
        Character resultado = ReadStream.firstChar(s);
        assertEquals(new Character('b'), resultado);
    }

    @Test(expected = RuntimeException.class)
    public void naoEncontrou() {
        Stream s = new StreamImpl("aabbccdd");
        ReadStream.firstChar(s);
        fail("Deveria ter dado erro.");
    }

    @Test(expected = RuntimeException.class)
    public void textoVazio() {
        Stream s = new StreamImpl("");
        ReadStream.firstChar(s);
        fail("Deveria ter dado erro.");
    }
}
