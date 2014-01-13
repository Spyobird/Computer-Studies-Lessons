package cs.lesson2.number;

import java.io.*;

public class Lesson2number
{
    public static void main(String[] args) throws IOException
    {
        int x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter a second number");
        y = Integer.parseInt(br.readLine());
        int c;
        c = x + y;
        double d;
        d = c / 2F;
        System.out.println("The average is " + d + "!");
        System.exit(0);
    }
}
