import java.util.Arrays;

public class Two
{
    public static void main(String[] args)
    {
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
                "..#.# => #";
/*
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
                "####. => #";*/

        String[] potRules = rules.split("\n");
        String forty = "........................................";
        //String init = "#..#.#..##......###...###";
        String init = "#.#.#....##...##...##...#.##.#.###...#.##...#....#.#...#.##.........#.#...#..##.#.....#..#.###";
        String ext = forty + init + forty + forty + forty + forty;

        int[] result = new int[ext.length()];
        System.out.println("                                            0         1         2         3         4         5         6         7         8         9");
        System.out.printf("%2d: %s\n", 0, ext);
        for (int i = 0; i < 120; i++)
        {
            for (String r : potRules)
            {
                String[] parts = r.split(" => ");
                String rule = parts[0];
                String value = parts[1];
                if (ext.contains(rule))
                {
                    int first = ext.indexOf(rule);
                    if (value.equals("#"))
                    {
                        result[first + 2] = 1;
                    }
                    else
                    {
                        result[first + 2] = 0;
                    }

                    while (first <= ext.lastIndexOf(rule))
                    {
                        first = ext.indexOf(rule, first);
                        if (value.equals("#"))
                        {
                            result[first + 2] = 1;
                        }
                        else
                        {
                            result[first + 2] = 0;
                        }
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
            if (i != 119)
            {
                result = new int[ext.length()];
            }

            System.out.printf("%2d: %s\n", (i + 1), ext);
        }

        long total = 0;
        for (int i = 0; i < result.length; i++)
        {
            if (result[i] == 1)
            {
                total += i - 40 + (50000000000L - 120);
            }
        }
        System.out.println("                                            0         1         2         3         4         5         6         7         8         9");
        System.out.println(total);

        //1688 IS WRONG, TOO LOW
    }
}