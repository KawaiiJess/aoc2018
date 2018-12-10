import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        String input = " 10775 -31651 -1 3\n" +
                "-21064 -42262 2 4\n" +
                " 53217 53247 -5 -5\n" +
                "-42269 -52869 4 5\n" +
                " 10768 53245 -1 -5\n" +
                "-31694 53253 3 -5\n" +
                " 42632 -10428 -4 1\n" +
                "-10439 53253 1 -5\n" +
                "-21043 42635 2 -4\n" +
                "-21032 -52876 2 5\n" +
                "-52911 -42259 5 4\n" +
                " 10771 53252 -1 -5\n" +
                "-31695 -52867 3 5\n" +
                " 32001 21417 -3 -2\n" +
                "-10478 42641 1 -4\n" +
                " 42611 -52871 -4 5\n" +
                "-31662 -21031 3 2\n" +
                "-42288 32025 4 -3\n" +
                "-10441 42638 1 -4\n" +
                " 10799 -31651 -1 3\n" +
                " 10796 42635 -1 -4\n" +
                "-42276 -31652 4 3\n" +
                " 21372 -31650 -2 3\n" +
                " 10800 10799 -1 -1\n" +
                " 21367 -52870 -2 5\n" +
                "-42267 21411 4 -2\n" +
                " 42627 -52875 -4 5\n" +
                "-10441 42639 1 -4\n" +
                "-42305 -31648 4 3\n" +
                " 42640 -42264 -4 4\n" +
                " 42583 -21031 -4 2\n" +
                "-31681 -21037 3 2\n" +
                " 10801 -10424 -1 1\n" +
                " 53244 -21039 -5 2\n" +
                " 53235 -21040 -5 2\n" +
                " 42592 -31652 -4 3\n" +
                "-10428 53252 1 -5\n" +
                "-21092 -42260 2 4\n" +
                "-21083 -52867 2 5\n" +
                "-31681 -52871 3 5\n" +
                " 32015 -21035 -3 2\n" +
                " 31967 -42257 -3 4\n" +
                "-42277 53252 4 -5\n" +
                "-42269 53244 4 -5\n" +
                "-31654 42638 3 -4\n" +
                "-31680 10798 3 -1\n" +
                " 21381 -31649 -2 3\n" +
                " 31979 -21032 -3 2\n" +
                " 10769 -42260 -1 4\n" +
                "-31705 -21040 3 2\n" +
                " 53248 -52869 -5 5\n" +
                "-10424 -31646 1 3\n" +
                "-31702 42632 3 -4\n" +
                "-42288 -42257 4 4\n" +
                " 21355 10800 -2 -1\n" +
                "-10457 10797 1 -1\n" +
                "-21052 -42255 2 4\n" +
                " 10777 53244 -1 -5\n" +
                "-10452 -31650 1 3\n" +
                " 31983 -10419 -3 1\n" +
                " 21355 53245 -2 -5\n" +
                " 42603 -42257 -4 4\n" +
                "-31645 53250 3 -5\n" +
                " 21392 -10420 -2 1\n" +
                "-52881 32026 5 -3\n" +
                "-42297 -21037 4 2\n" +
                "-10425 32020 1 -3\n" +
                " 10759 21408 -1 -2\n" +
                " 31979 10796 -3 -1\n" +
                "-31649 -10428 3 1\n" +
                " 10794 21414 -1 -2\n" +
                "-10461 -10425 1 1\n" +
                "-52908 -10419 5 1\n" +
                "-10449 42635 1 -4\n" +
                "-42290 53249 4 -5\n" +
                "-31652 21410 3 -2\n" +
                " 31985 -31648 -3 3\n" +
                " 21374 -31647 -2 3\n" +
                " 21379 10801 -2 -1\n" +
                " 21356 -31643 -2 3\n" +
                "-10422 -10423 1 1\n" +
                "-31665 53246 3 -5\n" +
                " 10791 53245 -1 -5\n" +
                " 10763 -52869 -1 5\n" +
                " 10796 21413 -1 -2\n" +
                " 10783 53246 -1 -5\n" +
                " 10788 10804 -1 -1\n" +
                "-21061 -42256 2 4\n" +
                " 31992 -21039 -3 2\n" +
                "-21069 42637 2 -4\n" +
                " 53215 10797 -5 -1\n" +
                " 10793 -52872 -1 5\n" +
                " 10759 32028 -1 -3\n" +
                "-52876 -52870 5 5\n" +
                " 21355 32022 -2 -3\n" +
                "-31693 -42263 3 4\n" +
                " 42582 -31648 -4 3\n" +
                "-42264 -10421 4 1\n" +
                "-52927 32020 5 -3\n" +
                " 42608 -42258 -4 4\n" +
                "-21057 53244 2 -5\n" +
                " 21355 -42258 -2 4\n" +
                " 53240 21409 -5 -2\n" +
                " 32025 -52872 -3 5\n" +
                " 53203 32021 -5 -3\n" +
                "-42301 -42256 4 4\n" +
                " 10767 32028 -1 -3\n" +
                " 53240 53246 -5 -5\n" +
                "-21040 21416 2 -2\n" +
                " 10772 53252 -1 -5\n" +
                " 42599 -31650 -4 3\n" +
                " 42597 -10423 -4 1\n" +
                "-52894 -52867 5 5\n" +
                "-21066 53250 2 -5\n" +
                "-31704 32020 3 -3\n" +
                "-10469 -21033 1 2\n" +
                " 21375 -21033 -2 2\n" +
                " 31995 42639 -3 -4\n" +
                " 53247 -31651 -5 3\n" +
                "-31693 21413 3 -2\n" +
                " 53219 53251 -5 -5\n" +
                "-10452 53247 1 -5\n" +
                " 42638 21412 -4 -2\n" +
                "-21048 21409 2 -2\n" +
                " 21381 53248 -2 -5\n" +
                "-10452 -10422 1 1\n" +
                "-21040 53250 2 -5\n" +
                "-10456 21410 1 -2\n" +
                "-10464 21415 1 -2\n" +
                " 42580 21408 -4 -2\n" +
                "-21093 32028 2 -3\n" +
                "-52905 -42260 5 4\n" +
                " 10791 -21038 -1 2\n" +
                "-31681 -42260 3 4\n" +
                " 10775 -21038 -1 2\n" +
                "-10440 32020 1 -3\n" +
                " 42598 21413 -4 -2\n" +
                " 42621 21417 -4 -2\n" +
                " 42638 -21036 -4 2\n" +
                " 42616 -21039 -4 2\n" +
                " 31972 10796 -3 -1\n" +
                "-10432 -31651 1 3\n" +
                "-21058 -42264 2 4\n" +
                "-21076 42638 2 -4\n" +
                "-21040 -21039 2 2\n" +
                "-21053 -52873 2 5\n" +
                "-21093 -21039 2 2\n" +
                "-31693 10803 3 -1\n" +
                "-52917 10801 5 -1\n" +
                " 21380 21410 -2 -2\n" +
                "-31705 -52870 3 5\n" +
                " 21367 42635 -2 -4\n" +
                " 21373 -42260 -2 4\n" +
                " 10755 53245 -1 -5\n" +
                "-42305 53248 4 -5\n" +
                "-31697 32028 3 -3\n" +
                "-21077 -31651 2 3\n" +
                " 53193 53253 -5 -5\n" +
                " 32016 -52874 -3 5\n" +
                " 21403 21415 -2 -2\n" +
                "-21035 42637 2 -4\n" +
                " 42627 -31652 -4 3\n" +
                "-21050 53244 2 -5\n" +
                "-42258 -10423 4 1\n" +
                " 10803 32022 -1 -3\n" +
                " 21360 53244 -2 -5\n" +
                " 31996 -21031 -3 2\n" +
                "-52902 42637 5 -4\n" +
                " 31994 -42259 -3 4\n" +
                " 53224 21408 -5 -2\n" +
                " 10776 32020 -1 -3\n" +
                " 21371 10797 -2 -1\n" +
                " 31971 32020 -3 -3\n" +
                "-10425 -42256 1 4\n" +
                "-52869 -42262 5 4\n" +
                " 42612 -10428 -4 1\n" +
                " 10796 32025 -1 -3\n" +
                " 10743 42637 -1 -4\n" +
                " 42590 -52867 -4 5\n" +
                "-52929 32028 5 -3\n" +
                "-10470 10796 1 -1\n" +
                " 21413 53248 -2 -5\n" +
                "-52905 -52869 5 5\n" +
                "-52895 -10428 5 1\n" +
                "-52881 32029 5 -3\n" +
                " 10803 21411 -1 -2\n" +
                " 42599 21410 -4 -2\n" +
                " 42636 -21038 -4 2\n" +
                "-31701 21412 3 -2\n" +
                " 21403 -52867 -2 5\n" +
                " 10767 32022 -1 -3\n" +
                " 42615 -31652 -4 3\n" +
                "-42276 42632 4 -4\n" +
                "-52873 21417 5 -2\n" +
                "-10452 10798 1 -1\n" +
                " 42632 -21040 -4 2\n" +
                "-31700 -42255 3 4\n" +
                " 10804 -21032 -1 2\n" +
                "-31665 -52874 3 5\n" +
                " 53196 -42255 -5 4\n" +
                " 10786 -31652 -1 3\n" +
                " 53203 -42260 -5 4\n" +
                " 31970 21408 -3 -2\n" +
                " 53228 21409 -5 -2\n" +
                " 10800 10799 -1 -1\n" +
                " 42638 42637 -4 -4\n" +
                "-21037 32029 2 -3\n" +
                " 32019 32028 -3 -3\n" +
                " 10743 -52872 -1 5\n" +
                "-31669 32020 3 -3\n" +
                " 10746 32020 -1 -3\n" +
                "-21061 10804 2 -1\n" +
                "-10437 -42264 1 4\n" +
                " 42598 -10423 -4 1\n" +
                " 10775 32024 -1 -3\n" +
                " 42623 21417 -4 -2\n" +
                "-21064 -10427 2 1\n" +
                " 10800 -31646 -1 3\n" +
                " 42603 32026 -4 -3\n" +
                "-42299 -42260 4 4\n" +
                " 42632 -21040 -4 2\n" +
                " 10760 10803 -1 -1\n" +
                " 53235 32020 -5 -3\n" +
                "-42317 42636 4 -4\n" +
                "-52877 -52869 5 5\n" +
                "-42256 -52875 4 5\n" +
                "-21034 32024 2 -3\n" +
                "-10433 -21033 1 2\n" +
                "-10481 -10425 1 1\n" +
                "-52924 53253 5 -5\n" +
                "-52897 -21033 5 2\n" +
                " 10767 10798 -1 -1\n" +
                "-21045 -10422 2 1\n" +
                "-42308 -42255 4 4\n" +
                "-21051 32029 2 -3\n" +
                "-10465 10804 1 -1\n" +
                "-10469 -52874 1 5\n" +
                " 32000 -31643 -3 3\n" +
                " 10743 32025 -1 -3\n" +
                "-21069 10802 2 -1\n" +
                "-10433 -42255 1 4\n" +
                " 32027 10799 -3 -1\n" +
                "-21084 -42255 2 4\n" +
                "-21081 21408 2 -2\n" +
                "-21045 10802 2 -1\n" +
                " 53252 -21031 -5 2\n" +
                "-10455 21411 1 -2\n" +
                " 10775 21416 -1 -2\n" +
                "-42317 -52868 4 5\n" +
                "-42305 -42259 4 4\n" +
                "-52929 10805 5 -1\n" +
                "-31673 -21034 3 2\n" +
                "-42289 -10420 4 1\n" +
                " 53223 10802 -5 -1\n" +
                " 32001 53253 -3 -5\n" +
                " 10794 21413 -1 -2\n" +
                "-42293 21412 4 -2\n" +
                "-52887 -10428 5 1\n" +
                " 32004 53252 -3 -5\n" +
                "-31665 -10421 3 1\n" +
                "-42264 -21037 4 2\n" +
                " 21387 32025 -2 -3\n" +
                " 21416 -42255 -2 4\n" +
                " 21403 32022 -2 -3\n" +
                " 42579 -52869 -4 5\n" +
                "-10481 -21034 1 2\n" +
                "-52917 -21034 5 2\n" +
                "-10457 42632 1 -4\n" +
                "-42298 -21036 4 2\n" +
                " 10743 53253 -1 -5\n" +
                " 42627 21413 -4 -2\n" +
                " 42595 32029 -4 -3\n" +
                " 10775 10803 -1 -1\n" +
                "-10479 32024 1 -3\n" +
                "-52876 -10419 5 1\n" +
                " 32003 32029 -3 -3\n" +
                "-21053 -31647 2 3\n" +
                "-21090 32029 2 -3\n" +
                "-52876 32024 5 -3\n" +
                " 53240 -52875 -5 5\n" +
                "-31644 53244 3 -5\n" +
                " 53215 21409 -5 -2\n" +
                "-31689 -42263 3 4\n" +
                "-21089 32024 2 -3\n" +
                " 21408 10797 -2 -1\n" +
                "-10481 21413 1 -2\n" +
                "-31657 10800 3 -1\n" +
                "-31670 -42255 3 4\n" +
                " 42603 21417 -4 -2\n" +
                " 31996 53251 -3 -5\n" +
                " 21413 -10423 -2 1\n" +
                "-10429 10804 1 -1\n" +
                " 42627 -52868 -4 5\n" +
                "-31665 -42263 3 4\n" +
                " 21392 -42256 -2 4\n" +
                "-21040 10800 2 -1\n" +
                "-10420 -21039 1 2\n" +
                "-10441 -42261 1 4\n" +
                "-52928 32029 5 -3\n" +
                "-21081 -21034 2 2\n" +
                "-42260 21414 4 -2\n" +
                "-31644 32021 3 -3\n" +
                "-21040 42636 2 -4\n" +
                " 53251 -10425 -5 1\n" +
                "-10448 32029 1 -3\n" +
                " 53199 -21033 -5 2\n" +
                " 32015 -10424 -3 1\n" +
                " 21390 53253 -2 -5\n" +
                " 42631 -31644 -4 3\n" +
                " 53219 42639 -5 -4\n" +
                "-10464 -52869 1 5\n" +
                "-52913 -52867 5 5\n" +
                " 21376 21416 -2 -2\n" +
                " 10803 -42257 -1 4\n" +
                "-10428 -42258 1 4\n" +
                " 10753 21417 -1 -2\n" +
                "-21064 -52873 2 5\n" +
                "-10460 21409 1 -2\n" +
                "-52881 32023 5 -3\n" +
                "-10461 -10422 1 1\n" +
                "-42280 10797 4 -1\n" +
                " 53231 -21036 -5 2\n" +
                " 21387 -52872 -2 5\n" +
                "-42317 -31643 4 3\n" +
                " 32027 21415 -3 -2\n" +
                " 10786 42632 -1 -4\n" +
                " 31999 -10422 -3 1\n" +
                " 10772 53244 -1 -5\n" +
                "-10449 53246 1 -5\n" +
                "-10464 42635 1 -4\n" +
                "-52879 53248 5 -5\n" +
                " 42632 21416 -4 -2\n" +
                "-21061 -52871 2 5\n" +
                "-31676 53248 3 -5\n" +
                " 21376 -52876 -2 5\n" +
                " 42596 -52870 -4 5\n" +
                " 10775 -31649 -1 3";
/*
        String input = "9 1 0 2\n" +
                "7 0 -1 0\n" +
                "3 -2 -1 1\n" +
                "6 10 -2 -1\n" +
                "2 -4 2 2\n" +
                "-6 10 2 -2\n" +
                "1 8 1 -1\n" +
                "1 7 1 0\n" +
                "-3 11 1 -2\n" +
                "7 6 -1 -1\n" +
                "-2 3 1 0\n" +
                "-4 3 2 0\n" +
                "10 -3 -1 1\n" +
                "5 11 1 -2\n" +
                "4 7 0 -1\n" +
                "8 -2 0 1\n" +
                "15 0 -2 0\n" +
                "1 6 1 0\n" +
                "8 9 0 -1\n" +
                "3 3 -1 1\n" +
                "0 5 0 -1\n" +
                "-2 2 2 0\n" +
                "5 -2 1 2\n" +
                "1 4 2 1\n" +
                "-2 7 2 -2\n" +
                "3 6 -1 -1\n" +
                "5 0 1 0\n" +
                "-6 0 2 0\n" +
                "5 9 1 -2\n" +
                "14 7 -2 0\n" +
                "-3 6 2 -1";
*/
        Scanner scan = new Scanner(input);
        List<int[]> points = new ArrayList<>();

        while (scan.hasNextLine())
        {
            //Parsing the default input was annoying af
            String line = scan.nextLine();
            Scanner temp = new Scanner(line);
            points.add(new int[]{temp.nextInt(), temp.nextInt(), temp.nextInt(), temp.nextInt()});
        }

        long area = Integer.MAX_VALUE;
        int len = 0;
        int wid = 0;
        int count = 0;

        while (true)
        {
            count++;
            int xmin = Integer.MAX_VALUE;
            int xmax = Integer.MIN_VALUE;
            int ymin = Integer.MAX_VALUE;
            int ymax = Integer.MIN_VALUE;
            for (int[] p : points)
            {
                p[0] = p[0] + p[2];
                p[1] = p[1] + p[3];

                if (p[1] < xmin)
                    xmin = p[1];
                if (p[1] > xmax)
                    xmax = p[1];
                if (p[0] < ymin)
                    ymin = p[0];
                if (p[0] > ymax)
                    ymax = p[0];
            }
            int l = xmax - xmin + 1;
            int w = ymax - ymin + 1;

            //Stupid, but preventing long overflow
            if (count > 10000)
            {
                long temp = l * w;

                if (temp < area)
                {
                    area = temp;
                    len = l;
                    wid = w;
                }
                else
                {
                    break;
                }
            }

        }

        for (int[] p : points)
        {
            p[0] = p[0] - p[2];
            p[1] = p[1] - p[3];
        }
        count--;
        System.out.println(len);
        System.out.println(wid);
        System.out.println(area);

        int dx = 0;
        int dy = 0;
        for (int[] p : points)
        {
            if (p[0] < dx)
                dx = p[0];
            if (p[1] < dy)
                dy = p[1];
        }

        Cell[][] grid = new Cell[len + 1000][wid + 1000];

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                grid[i][j] = new Cell(".", 0, 0);
            }
        }

        for (int[] p : points)
        {
            grid[p[1]][p[0]] = new Cell("#", p[2], p[3]);
        }

        printGrid(grid);
        System.out.println(count);
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
