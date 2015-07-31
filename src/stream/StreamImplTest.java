package stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author finx
 * @created 30/07/2015
 */
public class StreamImplTest {

    @Test
    public void testGetNext() {
        Stream s = new StreamImpl("a");
        assertEquals('a', s.getNext());
    }

    @Test
    public void testGetNextVariosChars() {
        Stream s = new StreamImpl("abcde");
        assertEquals('a', s.getNext());
        assertEquals('b', s.getNext());
        assertEquals('c', s.getNext());
        assertEquals('d', s.getNext());
        assertEquals('e', s.getNext());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testErroGetNext() {
        Stream s = new StreamImpl("a");
        assertEquals('a', s.getNext());
        assertEquals('a', s.getNext());
    }

    @Test
    public void testHasNext() {
        Stream s = new StreamImpl("a");
        assertTrue(s.hasNext());
        assertEquals('a', s.getNext());
        assertFalse(s.hasNext());
    }

    @Test
    public void testHasNextVariosChars() {
        Stream s = new StreamImpl("abcde");
        assertTrue(s.hasNext());
        assertEquals('a', s.getNext());
        assertTrue(s.hasNext());
        assertEquals('b', s.getNext());
        assertTrue(s.hasNext());
        assertEquals('c', s.getNext());
        assertTrue(s.hasNext());
        assertEquals('d', s.getNext());
        assertTrue(s.hasNext());
        assertEquals('e', s.getNext());
        assertFalse(s.hasNext());
    }
}
