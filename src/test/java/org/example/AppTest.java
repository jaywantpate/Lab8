package org.example;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;
import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */


    public void testPush()
    {

        MyStack<Integer> st = new MyStack();
        st.push(0);
        assertTrue(st.peekTop().equals(0));
        Integer x = st.pop();
        assertTrue(x.equals(0));

        boolean exceptionthrown = false;

        try{
            x = st.pop();
        } catch (EmptyStackException e){
            exceptionthrown = true;
        }

        assertTrue(exceptionthrown);
    }

    public void testisEmpty(){
        MyStack<Integer> st = new MyStack();
        assertTrue(st.isEmpty());
    }

    public void testSize(){
        MyStack<Integer> st = new MyStack();
        st.push(5);
        assertEquals(st.size(), 1);
    }
}
