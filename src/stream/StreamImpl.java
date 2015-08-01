package stream;

/**
 * Implementação básica de uma {@link Stream}.
 *
 * @author finx
 * @created 30/07/2015
 */
public class StreamImpl implements Stream {

    private char[] data;

    private int posicao = 0;

    /**
     * Construtor. Recebe uma {@link String} a ser processada.
     *
     * @param data a {@link String}.
     */
    public StreamImpl(String data) {
        this.data = new char[data.length()];
        for (int i = 0; i < data.length(); i++) {
            this.data[i] = data.charAt(i);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public char getNext() {
        char retorno = this.data[this.posicao];
        this.posicao++;
        return retorno;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        return this.posicao < this.data.length;
    }

}
