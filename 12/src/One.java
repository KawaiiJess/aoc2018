import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One
{
    public static void main(String[] args)
    {
        /*
        String rules = "####. => #\n" +
                "..#.. => .\n" +
                "#.#.. => .\n" +
                ".##.. => .\n" +
                "##... => .\n" +
                "#.##. => #\n" +
                "##.#. => .\n" +
                "##..# => .\n" +
                ".###. => .\n" +
                ".#.## => .\n" +
                ".#..# => #\n" +
                "..... => .\n" +
                "###.. => #\n" +
                "#..## => .\n" +
                "##.## => .\n" +
                "#.... => .\n" +
                "...## => #\n" +
                "....# => .\n" +
                "#.#.# => #\n" +
                "###.# => .\n" +
                ".#### => #\n" +
                ".#... => #\n" +
                "#.### => .\n" +
                "..### => .\n" +
                ".#.#. => #\n" +
                ".##.# => .\n" +
                "#..#. => #\n" +
                "...#. => .\n" +
                "#...# => #\n" +
                "..##. => .\n" +
                "##### => #\n" +
                "..#.# => #";*/

        String rules = "...## => #\n" +
                "..#.. => #\n" +
                ".#... => #\n" +
                ".#.#. => #\n" +
                ".#.## => #\n" +
                ".##.. => #\n" +
                ".#### => #\n" +
                "#.#.# => #\n" +
                "#.### => #\n" +
                "##.#. => #\n" +
                "##.## => #\n" +
                "###.. => #\n" +
                "###.# => #\n" +
                "####. => #";

        String[] temp = rules.split("\n");
        List<String> potRules = new ArrayList<>();
        List<String> notRules = new ArrayList<>();
        for (String t : temp)
        {
            String[] parts = t.split(" => ");
            if (parts[1].equals("#"))
            {
                potRules.add(parts[0]);
            }
            else
            {
                notRules.add(parts[0]);
            }
        }

        //System.out.println(potRules.toString());
        String forty = "........................................";
        String init = "#..#.#..##......###...###";
        //String init = "#.#.#....##...##...##...#.##.#.###...#.##...#....#.#...#.##.........#.#...#..##.#.....#..#.###";
        String ext = forty + init + forty;

        int[] result = new int[ext.length()];
        System.out.println("                                            0         1         2         3         4         5         6         7         8         9");
        System.out.printf("%2d: %s\n", 0, ext);
        for (int i = 0; i < 20; i++)
        {
            for (String r : potRules)
            {
                if (ext.contains(r))
                {
                    int first = ext.indexOf(r) + 2;
                    result[first] = 1;

                    while (first <= ext.lastIndexOf(r))
                    {
                        first = ext.indexOf(r, first);
                        result[first + 2] = 1;
                        first++;
                    }
                }
            }

            String iter = "";
            for (int j = 0; j < ext.length(); j++)
            {
                if (result[j] == 1)
                {
                    iter = iter + "#";
                }
                else
                {
                    iter = iter + ".";
                }
            }
            ext = iter;
            //System.out.println(Arrays.toString(result));
            if (i != 19)
            {
                result = new int[ext.length()];
            }

            System.out.printf("%2d: %s\n", (i + 1), ext);
        }
        System.out.println(Arrays.toString(result));

        int total = 0;
        for (int i = 0; i < result.length; i++)
        {
            if (result[i] == 1)
            {
                System.out.print(i - 40 + " ");
                total += i - 40;
            }
        }
        System.out.println("\n                                            0         1         2         3         4         5         6         7         8         9");
        System.out.println(total);

        //1688 IS WRONG, TOO LOW
    }
}
