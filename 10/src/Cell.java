class Cell
{
    String name;
    int dxCol;
    int dxRow;

    Cell(String name, int dxCol, int dxRow)
    {
        this.name = name;
        this.dxCol = dxCol;
        this.dxRow = dxRow;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}