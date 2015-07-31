package stream;

/**
 * @author finx
 * @created 30/07/2015
 */
public class StreamImpl implements Stream {

    private char[] data;

    private int posicao = 0;

    public StreamImpl(String data) {
        this.data = new char[data.length()];
        for (int i = 0; i < data.length(); i++) {
            this.data[i] = data.charAt(i);
        }
    }

    @Override
    public char getNext() {
        char retorno = this.data[this.posicao];
        this.posicao++;
        return retorno;
    }

    @Override
    public boolean hasNext() {
        return this.posicao < this.data.length;
    }

}
