import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        String in = "355, 246\n" +
                "259, 215\n" +
                "166, 247\n" +
                "280, 341\n" +
                "54, 91\n" +
                "314, 209\n" +
                "256, 272\n" +
                "149, 313\n" +
                "217, 274\n" +
                "299, 144\n" +
                "355, 73\n" +
                "70, 101\n" +
                "266, 327\n" +
                "51, 228\n" +
                "274, 123\n" +
                "342, 232\n" +
                "97, 100\n" +
                "58, 157\n" +
                "130, 185\n" +
                "135, 322\n" +
                "306, 165\n" +
                "335, 84\n" +
                "268, 234\n" +
                "173, 255\n" +
                "316, 75\n" +
                "79, 196\n" +
                "152, 71\n" +
                "205, 261\n" +
                "275, 342\n" +
                "164, 95\n" +
                "343, 147\n" +
                "83, 268\n" +
                "74, 175\n" +
                "225, 130\n" +
                "354, 278\n" +
                "123, 206\n" +
                "166, 166\n" +
                "155, 176\n" +
                "282, 238\n" +
                "107, 295\n" +
                "82, 92\n" +
                "325, 299\n" +
                "87, 287\n" +
                "90, 246\n" +
                "159, 174\n" +
                "295, 298\n" +
                "260, 120\n" +
                "203, 160\n" +
                "72, 197\n" +
                "182, 296";
/*
        String in = "1, 1\n" +
                "1, 6\n" +
                "8, 3\n" +
                "3, 4\n" +
                "5, 5\n" +
                "8, 9";
*/

        Scanner input = new Scanner(in);
        List<int[]> coords = new ArrayList<>();
        int curChar = 40; //For visual representation
        int index = 0; //For storing in int[] count
        int n = 32; //My neutral character for visual representation

        //GET COORDS
        while (input.hasNextLine())
        {
            String temp = input.nextLine();
            String[] coord = temp.split(", ");
            //coord[0] = column
            //coord[1] = row
            coords.add(new int[]{Integer.parseInt(coord[0]), Integer.parseInt(coord[1]), 0});
        }

        //FIND MAX COORD + 1
        int max = 0;
        for (int[] coord : coords)
        {
            if (coord[0] > max)
            {
                max = coord[0];
            }
            if (coord[1] > max)
            {
                max = coord[1];
            }
        }
        max++;
        Cell[][] grid = new Cell[max][max];

        //CALCULATE MANHATTAN DISTANCES AND GENERATE CELLS
        for (int[] coord : coords)
        {
            //System.out.println(Arrays.toString(coord));
            //coord[0] = column
            //coord[1] = row
            grid[coord[1]][coord[0]] = new Cell(curChar, index, true);

            for (int i = 0; i < grid.length; i++)
            {
                for (int j = 0; j < grid.length; j++)
                {
                    //Manhattan Distance
                    int dist = Math.abs(i-coord[1]) + Math.abs(j-coord[0]);

                    if (grid[i][j] == null)
                    {
                        grid[i][j] = new Cell(curChar, index, dist);
                    }
                    else if (dist < grid[i][j].dist)
                    {
                        grid[i][j] = new Cell(curChar, index, dist);
                    }
                    else if (dist == grid[i][j].dist && !grid[i][j].root)
                    {
                        grid[i][j] = new Cell(n, index, dist);
                    }
                }
            }
            curChar++;
            index++;
        }

        //printGrid(grid);

        //COUNT FINITE AREAS
        long[] counts = new long[coords.size()];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if (i == 0 && grid[i][j].name != n)
                {
                    counts[grid[i][j].index] = Integer.MIN_VALUE;
                }
                else if (j == 0 && grid[i][j].name != n)
                {
                    counts[grid[i][j].index] = Integer.MIN_VALUE;
                }
                else if (i == grid.length - 1 && grid[i][j].name != n)
                {
                    counts[grid[i][j].index] = Integer.MIN_VALUE;
                }
                else if (j == grid.length - 1 && grid[i][j].name != n)
                {
                    counts[grid[i][j].index] = Integer.MIN_VALUE;
                }
                else if (grid[i][j].index != Integer.MIN_VALUE && grid[i][j].name != n)
                {
                    counts[grid[i][j].index]++;
                }
            }
        }

        //System.out.println(Arrays.toString(counts));
        Arrays.sort(counts);
        System.out.println(counts[counts.length - 1]);


        //PART2
        int totalMDist = 0;
        int hashCount = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                for (int[] coord : coords)
                {
                    totalMDist += Math.abs(i-coord[1]) + Math.abs(j-coord[0]);
                }
                if (totalMDist < 10000)
                {
                    grid[i][j].name = 35;
                    hashCount++;
                }
                totalMDist = 0;
            }
        }

        //printGrid(grid);
        System.out.println(hashCount);

        long stop = System.currentTimeMillis();
        System.out.println("Took " + (stop - start) + " milliseconds");
    }

    private static void printGrid(Cell[][] grid)
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
