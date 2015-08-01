package stream;

/**
 * Interface que define uma stream (ou um conjunto de caracteres a ser processado).
 * 
 * @author finx
 * @created 30/07/2015
 */
public interface Stream {

    /**
     * Retorna o próximo caracter a ser processado na stream.
     *
     * @return o próximo caracter da stream.
     */
    char getNext();

    /**
     * Retorna se a stream ainda contém caracteres para processar.
     *
     * @return <code>true</code> caso a stream ainda contém caracteres para processar, <code>false</code> caso contrário.
     */
    boolean hasNext();

}
