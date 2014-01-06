package cs.lesson1;

import java.io.*;

public class Lesson1
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
