package cs.lesson2.helloi;

import java.io.*;

public class Lesson2Helloi
{
    public static void main(String[] args) throws IOException
    {
        String name;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        name = kb.readLine();
        System.out.println("Hello World, dear " + name + "!");
        System.exit(0);
    }
}
