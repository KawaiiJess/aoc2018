import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Two
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = getScanner(args);
        String test = in.next();
        boolean removed;

        String temp = test;
        int min = 99999;

        for (int j = 65; j < 91; j++)
        {
            removed = true;

            while (removed)
            {
                for (int i = 0; i < temp.length(); i++)
                {
                    if ((temp.charAt(i)) == j || (temp.charAt(i)) == j + 32)
                    {
                        temp = temp.substring(0, i) + temp.substring(i + 1, temp.length());
                        removed = true;
                        break;
                    }
                    removed = false;
                }
            }

            removed = true;

            while (removed)
            {
                for (int i = 0; i < temp.length() - 1; i++)
                {
                    if ((temp.charAt(i) + 32) == temp.charAt(i + 1) || (temp.charAt(i) - 32) == temp.charAt(i + 1))
                    {
                        temp = temp.substring(0, i) + temp.substring(i + 2, temp.length());
                        removed = true;
                        break;
                    }
                    removed = false;
                }
            }
            if (temp.length() < min)
            {
                min = temp.length();
            }
            temp = test;
        }
        System.out.println("FINAL ANSWER: " + min);
    }

    private static Scanner getScanner(String[] args) throws IOException
    {
        File file;

        if (args.length == 0)
        {
            file = new File("./input.txt");
        }
        else
        {
            file = new File("./" + args[0]);
        }

        return new Scanner(file);
    }
}
