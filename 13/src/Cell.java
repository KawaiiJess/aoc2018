class Cell
{
    boolean isCross;
    boolean isVertLine;
    boolean isHoriLine;
    boolean isBackSlash;
    boolean isForwSlash;
    boolean isCrash;
    boolean isEmpty;
    Cart cart;

    @Override
    public String toString()
    {
        if (isCrash)
            return "X";
        if (cart.occupied)
            return cart.toString();
        if (isCross)
            return "+";
        if (isVertLine)
            return "|";
        if (isHoriLine)
            return "-";
        if (isBackSlash)
            return "\\";
        if (isForwSlash)
            return "/";
        if (isEmpty)
            return " ";
        else
            return "?";
    }
}