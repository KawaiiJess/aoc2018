public class Solution
{
    public static void main(String[] args)
    {
        DCLL dcll = new DCLL();
        long start = System.currentTimeMillis();
        dcll.solve(430, 71588);
        dcll.solve(430, 7158800);
        long stop = System.currentTimeMillis();
        System.out.println("Took " + (stop - start) + " milliseconds");
        //dcll.someString();
    }
}
