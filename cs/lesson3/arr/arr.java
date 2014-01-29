package cs.lesson3.arr;

import java.io.*;

public class arr
{
    public static void main(String[] args) throws IOException
    {
        int[] x = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x.length; i++)
        {
            System.out.print("Enter a number: ");
            x[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0 ; i < x.length; i++)
        {
            System.out.println("The array is " + x[i]);
        }
    }
}
