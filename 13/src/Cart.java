public class Cart
{
    int dir;
    int nextDir;
    boolean occupied;

    Cart(int dir, int nextDir, boolean occupied)
    {
        this.dir = dir;
        this.nextDir = nextDir;
        this.occupied = occupied;
    }

    void setNextDir()
    {
        this.nextDir = ((this.nextDir + 1) % 3);
    }

    @Override
    public String toString()
    {
        if (dir == 0)
            return "v";
        if (dir == 1)
            return "<";
        if (dir == 2)
            return "^";
        if (dir == 3)
            return ">";
        else
        {
            return "!";
        }
    }
}
