package cs.lesson3.arrayprobs;

import java.io.*;

public class array2
{
    public static void main(String[] args) throws IOException
    {
        int[] x = new int[5];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x.length; i++)
        {
            System.out.print("Enter a number: ");
            x[i] = Integer.parseInt(br.readLine());
            sum += x[i];
        }
        System.out.println("The sum is " + sum);
    }
}
