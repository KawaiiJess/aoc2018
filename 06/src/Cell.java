class Cell
{
    int name;
    boolean root = false;
    int dist = 0;
    int index;

    Cell(int name, int index, boolean root)
    {
        this.name = name;
        this.index = index;
        this.root = root;
    }
    Cell(int name, int index, int dist)
    {
        this.name = name;
        this.index = index;
        this.dist = dist;
    }

    @Override
    public String toString()
    {
        return "" + (char)this.name;
    }
}
