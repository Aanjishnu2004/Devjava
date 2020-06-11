/*
 * This class will handle the direction of output, like the console or a file or some field which i am not really sure about 
 */

import java.io.PrintStream;

public class OutputManager
{
    private PrintStream out ;
    
    public OutputManager()
    {
        out = System.out;
    }
    
    public OutputManager(PrintStream o)
    {
        out = o;
    }
    
    public PrintStream getPrintStream()
    {
        return out;
    }
    
    public void print(Object o)
    {
        out.print(o);
    }
}