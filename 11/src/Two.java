import java.util.Arrays;

public class Two
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

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

        int gs = 300;
        //CALCULATE TOTALS
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                for (int yd = y; yd < y + gs && yd < grid[y].length; yd++)
                {
                    for (int xd = x; xd < x + gs && xd < grid[x].length; xd++)
                    {
                        int maxx = xd - x + 1;
                        int maxy = yd - y + 1;
                        int max = Math.max(maxx, maxy);
                        grid[x][y].total += grid[xd][yd].value;
                        for (int i = max; i < gs + 1; i++)
                        {
                            grid[x][y].setTotals(i, grid[xd][yd].value);
                        }
                    }
                }
            }
        }

        int x1 = 0;
        int y1 = 0;
        int index = 0;
        int high = 0;

        //WALK GRID AGAIN
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                int[] temp = grid[x][y].totals;
                for (int i = 1; i < temp.length; i++)
                {
                    if (temp[i] > high)
                    {
                        high = temp[i];
                        index = i;
                        x1 = x;
                        y1 = y;
                    }
                }
            }
        }

        printSmallGrid(grid, x1, y1);
        System.out.println(x1 + "," + y1 + "," + index);
        System.out.println("HIGHEST: " + high);
        System.out.println(Arrays.toString(grid[x1][y1].totals));
        //290,284,15 IS WRONG

        long stop = System.currentTimeMillis();
        System.out.println("Took " + (stop - start) + " milliseconds");
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

    private static void printGridValue(Cell[][] grid)
    {
        for (int y = 1; y < grid.length; y++)
        {
            for (int x = 1; x < grid.length; x++)
            {
                int val = grid[x][y].value;
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}