public class One
{
    public static void main(String[] args)
    {
        int serial = 1723;

        //POPULATE GRID
        Cell[][] grid = new Cell[301][301];

        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                grid[x][y] = new Cell();
            }
        }

        //WALK GRID TO PLACE VALUES AND TOTALS
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                //STORE VALUE AT EACH
                int rack = x + 10;
                int pl = ((rack * y) + serial) * rack;

                if (pl < 100)
                {
                    grid[x][y].value = -5;
                }
                else
                {
                    pl = pl / 100;
                    pl = pl % 10;
                    grid[x][y].value = pl - 5;
                }
            }
        }

        //CALCULATE 3X3 TOTALS
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                for (int yd = y; yd < y + 3 && yd < grid[y].length - 2; yd++)
                {
                    for (int xd = x; xd < x + 3 && xd < grid[x].length - 2; xd++)
                    {
                        grid[x][y].total += grid[xd][yd].value;
                    }
                }
            }
        }

        int x1 = 0;
        int y1 = 0;
        int high = 0;

        //WALK GRID AGAIN
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                if (grid[x][y].total > high)
                {
                    high = grid[x][y].total;
                    x1 = x;
                    y1 = y;
                }
            }
        }

        printSmallGrid(grid, x1, y1);
        System.out.println(x1 + "," + y1);
        System.out.println("HIGHEST: " + high);
    }

    private static void printSmallGrid(Cell[][] grid, int x, int y)
    {
        for (int yd = y - 1; yd < y + 4; yd++)
        {
            for (int xd = x - 1; xd < x + 4; xd++)
            {
                int val = grid[xd][yd].value;
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
/*
    private static void printGridValue(Cell[][] grid)
    {
        for (int y = 1; y < grid.length; y++)
        {
            for (int x = 1; x < grid.length; x++)
            {
                int val = grid[x][y].value;
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printGridTotal(Cell[][] grid)
    {
        for (int y = 1; y < grid.length; y++)
        {
            for (int x = 1; x < grid.length; x++)
            {
                int val = grid[x][y].total;
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
*/
}