package cs.lesson3.arrayprobs;

import java.io.*;

public class array1
{
    public static void main(String[] args) throws IOException
    {
        int[] x = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x.length; i++)
        {
            System.out.print("Enter a number: ");
            x[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0 ; i < x.length; i += 2)
        {
            System.out.println("The array is " + x[i]);
        }
    }
}
