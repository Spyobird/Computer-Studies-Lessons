package cs.lesson2.imbored;

import java.io.*;

public class Main
{
    /**
     * 
     * @param Some useless thing
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        String name;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter something: ");
        name = kb.readLine();
        new Stuff(name);
    }
}
