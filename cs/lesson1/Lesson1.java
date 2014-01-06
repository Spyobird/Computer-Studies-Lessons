package cs.lesson1;

import java.io.*;

public class Lesson1
{
	public static void main(String[] args) throws IOException
	{
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter your name: ");
		name = br.readLine();
		System.out.println("Hello World " + name + "!");
	}
}
