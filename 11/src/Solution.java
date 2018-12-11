public class Solution
{
    public static void main(String[] args)
    {
        int serial = 1723;

        //POPULATE GRID
        Cell[][] grid = new Cell[301][301];

        for (int i = 1; i < grid[0].length; i++)
        {
            for (int j = 1; j < grid[0].length; j++)
            {
                grid[i][j] = new Cell();
            }
        }

        //WALK GRID TO PLACE VALUES AND TOTALS
        for (int i = 1; i < grid[0].length; i++)
        {
            for (int j = 1; j < grid[0].length; j++)
            {
                int rack;
                int pl;
                if (grid[i][j].value == 0)
                {
                    //STORE VALUE AT EACH
                    rack = j + 10;
                    pl = rack * i;
                    pl = pl + serial;
                    pl = pl * rack;

                    if (pl < 100)
                    {
                        grid[i][j].value = -5;
                    }
                    else
                    {
                        pl = pl / 100;
                        pl = pl % 10;
                        grid[i][j].value = pl - 5;
                    }
                }

                //STORE TOTALS IN 3X3 AREA AND PLACE VALUES AHEAD OF I/J LOOP
                for (int k = i; k < i + 3 && k < grid[i].length - 2; k++)
                {
                    for (int l = j; l < j + 3 && l < grid[j].length - 2; l++)
                    {
                        rack = l + 10;
                        pl = rack * k;
                        pl = pl + serial;
                        pl = pl * rack;

                        if (pl < 100)
                        {
                            grid[i][j].total += -5;
                            grid[l][k].value = -5;
                        }
                        else
                        {
                            pl = pl / 100;
                            pl = pl % 10;
                            grid[i][j].total += pl - 5;
                            grid[l][k].value = pl - 5;
                        }
                    }
                }
            }
        }
        //printGridValue(grid);
        //printGridTotal(grid);

        int row = 0;
        int col = 0;
        int highest = 0;

        //WALK GRID AGAIN
        for (int i = 1; i < grid[0].length; i++)
        {
            for (int j = 1; j < grid[0].length; j++)
            {
                if (grid[i][j].total > highest)
                {
                    highest = grid[i][j].total;
                    row = i;
                    col = j;
                }
            }
        }
        printSmallGrid(grid, row, col);
        System.out.println(col + "," + row);
        System.out.println("HIGHEST: " + highest);
    }

    private static void printGridValue(Cell[][] grid)
    {
        for (int i = 1; i < grid.length; i++)
        {
            for (int j = 1; j < grid.length; j++)
            {
                int val = grid[i][j].value;
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printGridTotal(Cell[][] grid)
    {
        for (int i = 1; i < grid.length; i++)
        {
            for (int j = 1; j < grid.length; j++)
            {
                int val = grid[i][j].total;
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printSmallGrid(Cell[][] grid, int row, int col)
    {
        for (int i = row - 1; i < row + 4; i++)
        {
            for (int j = col - 1; j < col + 4; j++)
            {
                int val = grid[i][j].value;
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}
