class Cell
{
    int value;
    int total;
    int[] totals;

    Cell()
    {
        totals = new int[301];
    }

    public void setTotals(int index, int pl)
    {
        totals[index] += pl;
    }

    @Override
    public String toString()
    {
        return "" + value;
    }
}