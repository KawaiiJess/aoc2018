import java.util.*;

public class One
{
    public static void main(String[] args)
    {
        int curNum = 1;
        int index = 0;
        int last = 7158800;
        int curElf = 0;
        int[] scores = new int[430];

        List<Integer> list = new ArrayList<>();

        list.add(0);

        while (curNum <= last)
        {
            if (curNum % 1000000 == 0)
            {
                System.out.println(curNum);
            }

            if (curNum % 23 == 0)
            {
                scores[curElf] += curNum;
                index = index - 7;
                if (index < 0)
                {
                    index = list.size() - Math.abs(index);
                }
                scores[curElf] += list.get(index);
                list.remove(index);
                index = index % list.size();
                curNum++;
                curElf++;
            }

            if (index == 0)
            {

                list.add(curNum);
                curNum++;
                index++;
                curElf++;
            }

            index = ((index + 1) % list.size()) + 1;
            list.add(index, curNum);
            curNum++;
            curElf = (curElf + 1) % scores.length;
        }
        Arrays.sort(scores);
        System.out.println(scores[scores.length - 1]);
    }
}
