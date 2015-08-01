package stream;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Classe que executa a leitura de uma {@link Stream}.
 *
 * @author finx
 * @created 30/07/2015
 */
public class ReadStream {

    /**
     * Retorna o primeiro caractere da {@link Stream} que não se repete.
     *
     * @param input o {@link Stream} a ter o primeiro caractere que não se repete encontrado.
     * @return o primeiro caractere da {@link Stream} que não se repete.
     */
    public static char firstChar(Stream input) {
        // inclui no conjunto e garante a ordem. o primeiro incluído é o que precisamos.
        Set<Character> chars = new LinkedHashSet<Character>();
        // para caracteres duplicdos, não é necessário verificar a ordem
        Set<Character> charsDuplicados = new HashSet<Character>();

        while (input.hasNext()) {
            char nextChar = input.getNext();
            if (!chars.contains(nextChar) && !charsDuplicados.contains(nextChar)) {
                chars.add(nextChar);
            } else {
                chars.remove(nextChar);
                charsDuplicados.add(nextChar);
            }
        }
        if (chars.size() > 0) {
            return chars.iterator().next();
        } else {
            throw new RuntimeException("Não existe um caractere que não se repete na stream: " + input.toString() + " .");
        }
    }
}
