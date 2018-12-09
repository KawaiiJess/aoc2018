import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int curNum = 1;
        int index = 0;
        int last = 71588;
        int curElf = 0;
        int[] scores = new int[430];

        List<Integer> list = new ArrayList<>();

        list.add(0);

        //Next marble placed always skips one index.
        //If we're at index 1, we next place at index 3

        while (curNum <= last)
        {
            if (curNum % 23 == 0)
            {
                scores[curElf] += curNum;
                index = index - 7;
                if (index < 0)
                {
                    index = list.size() - Math.abs(index);
                }
                scores[curElf] += list.get(index);
                //System.out.println("REMOVED: " + list.get(index));
                //System.out.println("Index: " + index);
                list.remove(index);
                index = index % list.size();
                curNum++;
                curElf++;
                //System.out.println("Index: " + index);
            }

            if (index == 0)
            {

                list.add(curNum);
                curNum++;
                index++;
                curElf++;
                //System.out.println("CURRENT ELF: " + curElf);
            }

            index = ((index + 1) % list.size()) + 1;
            list.add(index, curNum);
            curNum++;
            curElf = (curElf + 1) % scores.length;
            //System.out.println("Index: " + index);
            //System.out.println("CURRENT INDEX ITEM: " + list.get(index));
            //System.out.println(list.size());
        }
        //System.out.println(Arrays.toString(scores));
        //System.out.println(list);
        Arrays.sort(scores);
        System.out.println(scores[scores.length - 1]);
    }
}
