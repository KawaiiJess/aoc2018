import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class One
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = getScanner(args);
        String test = in.next();
        boolean removed = true;

        while (removed)
        {
            for (int i = 0; i < test.length() - 1; i++)
            {
                if ((test.charAt(i) + 32) == test.charAt(i + 1) || (test.charAt(i) - 32) == test.charAt(i + 1))
                {
                    test = test.substring(0, i) + test.substring(i + 2, test.length());
                    removed = true;
                    break;
                }
                removed = false;
            }
        }
        System.out.println(test);
        System.out.println(test.length());
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
