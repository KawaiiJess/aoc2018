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

        //WALK GRID ONCE TO PLACE VALUES
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
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

        //WALK GRID AGAIN TO CALCULATE SUBGRIDS (Max sub-grid size of 50)
        /*
        Could be rewritten to calculate size x
            On next iteration x+1, only calculate bottom & right edges
                Add x to x+1 two sides for fewer element updates.
         */
        int maxGrid = 50;
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                for (int dy = y; dy < y + maxGrid && dy < grid[y].length; dy++)
                {
                    for (int dx = x; dx < x + maxGrid && dx < grid[x].length; dx++)
                    {
                        //Cool ass math to sum the variable size grids into a 1D array
                        int maxx = dx - x + 1;
                        int maxy = dy - y + 1;
                        int max = Math.max(maxx, maxy);
                        for (int i = max; i < maxGrid + 1; i++)
                        {
                            grid[x][y].setTotals(i, grid[dx][dy].value);
                        }
                    }
                }
            }
        }

        //FIND THE AREA WITH THE HIGHEST POWER LEVEL! (It's over 9000!)
        int x1 = 0;
        int y1 = 0;
        int index = 0;
        int high = 0;
        for (int y = 1; y < grid[0].length; y++)
        {
            for (int x = 1; x < grid[0].length; x++)
            {
                int[] temp = grid[x][y].totals;
                for (int i = 1; i < temp.length; i++)
                {
                    //This was an edge case to exclude non-square answers bottom right. 290,284,15 IS WRONG
                    if (temp[i] > high && i + y < grid[0].length && i + x < grid[0].length)
                    {
                        high = temp[i];
                        index = i;
                        x1 = x;
                        y1 = y;
                    }
                }
            }
        }

        printSmallGrid(grid, x1, y1, index);
        System.out.println(x1 + "," + y1 + "," + index);
        System.out.println("HIGHEST: " + high);
        //System.out.println(Arrays.toString(grid[x1][y1].totals));

        long stop = System.currentTimeMillis();
        System.out.println("Took " + (stop - start) + " milliseconds");
    }

    private static void printSmallGrid(Cell[][] grid, int x, int y, int index)
    {
        for (int dy = y - 1; dy < y + index + 1; dy++)
        {
            for (int dx = x - 1; dx < x + index + 1; dx++)
            {
                int val = grid[dx][dy].value;
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}