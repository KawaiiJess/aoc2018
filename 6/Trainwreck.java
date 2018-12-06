import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Trainwreck
{
    public static void main(String[] args)
    {
        /*
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
        */
        String in = "1, 1\n" +
                "1, 6\n" +
                "8, 3\n" +
                "3, 4\n" +
                "5, 5\n" +
                "8, 9";

        Cell[][] grid = new Cell[10][10];
        Scanner input = new Scanner(in);
        List<int[]> coords = new ArrayList<>();
        int curChar = 65;

        /*
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                grid[j][i] = new Cell(32, 0);
            }
        }*/

        while (input.hasNextLine())
        {
            String temp = input.nextLine();
            String[] coord = temp.split(", ");
            //coord[0] = column
            //coord[1] = row
            coords.add(new int[]{Integer.parseInt(coord[0]), Integer.parseInt(coord[1]), 0});
        }

        for (int[] coord : coords)
        {
            System.out.println(Arrays.toString(coord));
            //coord[0] = column
            //coord[1] = row
            grid[coord[1]][coord[0]] = new Cell(curChar, true);
            curChar++;
        }

        printGrid(grid);

        int globalDist = 1;

        //do
        //{
            for (int[] coord : coords)
            {
                if (coord[2] == 0)
                {
                    taxiGrow(grid, coord, globalDist);
                }
            }

            globalDist++;

        for (int[] coord : coords)
        {
            if (coord[2] == 0)
            {
                taxiGrow(grid, coord, globalDist);
            }
            printGrid(grid);
        }
        //} while (isFinished(coords));
    }

    private static void taxiGrow(Cell[][] grid, int[] coord, int globalDist)
    {
        //coord[0] = column
        //coord[1] = row
        int row = coord[1];
        int col = coord[0];

        int up = row + globalDist * -1;
        int left = col + globalDist * -1;
        int right = col + globalDist;
        int down = row + globalDist;

        Cell upCell = grid[0][0];
        Cell rtCell = grid[0][0];
        Cell dnCell = grid[0][0];
        Cell ltCell = grid[0][0];

        boolean upFin = true;
        boolean rtFin = true;
        boolean dnFin = true;
        boolean ltFin = true;

        if(up >= 0)
        {
            //[row][col] GOING UP
            if (grid[up][col] == null)
            {
                grid[up][col] = new Cell(grid[row][col].name + 32, globalDist);
                upCell = grid[up][col];
                upFin = false;
            }
            else if (grid[up][col].dist == globalDist) //space
            {
                grid[up][col].name = 32;
            }
        }

        if (right < grid[0].length)
        {
            //[row][col] GOING RIGHT
            if (grid[row][right] == null)
            {
                grid[row][right] = new Cell(grid[row][col].name + 32, globalDist);
                rtCell = grid[row][right];
                rtFin = false;
            }
            else if (grid[row][right].dist == globalDist) //space
            {
                grid[row][right].name = 32;
            }
        }

        if (down < grid[0].length)
        {
            //[row][col] GOING DOWN
            if (grid[down][col] == null)
            {
                grid[down][col] = new Cell(grid[row][col].name + 32, globalDist);
                dnCell = grid[down][col];
                dnFin = false;
            }
            else if (grid[down][col].dist == globalDist) //space
            {
                grid[down][col].name = 32;
            }
        }

        if (left >= 0)
        {
            //[row][col] GOING LEFT
            if (grid[row][left] == null)
            {
                grid[row][left] = new Cell(grid[row][col].name + 32, globalDist);
                ltCell = grid[row][left];
                ltFin = false;
            }
            else if (grid[row][left].dist == globalDist) //space
            {
                grid[row][left].name = 32;
            }
        }

        up++;
        col++;

        if (globalDist == 2)
        {
            System.out.println("blarg");
        }

        if (grid[up][col] == null)
        {
            up++;
            col++;
        }

        while (grid[up][col] != rtCell)
        {
            if (col < grid[0].length)
            {
                //[row][col] GOING UP
                if (grid[up][col] == null)
                {
                    grid[up][col] = new Cell(grid[row][col].name + 32, globalDist);
                    upFin = false;
                }
                else if (grid[up][col].dist == globalDist && grid[up][col].name != grid[row][col].name) //space
                {
                    grid[up][col].name = 32;
                }
            }
        }

        if (upFin && rtFin && dnFin && ltFin)
        {
            coord[2] = 1;
        }
    }

    private static boolean isFinished(List<int[]> coords)
    {
        for (int[] coord : coords)
        {
            if (coord[2] == 0)
            {
                return false;
            }
        }
        return true;
    }

    private static void printGrid(Cell[][] grid)
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if (grid[i][j] == null)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print(grid[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}