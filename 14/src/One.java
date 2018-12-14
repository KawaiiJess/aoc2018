import java.util.ArrayList;
import java.util.List;

public class One
{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);

        int count = 0;
        int a = 0;
        int b = 1;
        int total = 430980; //Actual input 430971 + 10 - 1;

        while (true)
        {
            int ar = arr.get(a);
            int br = arr.get(b);

            if (ar + br >= 10)
            {
                int temp = ar + br;
                int tens = temp / 10;
                int ones = temp % 10;

                count += 2;
                if (count >= total)
                    break;
                arr.add(tens);
                arr.add(ones);
            }
            else
            {
                count++;
                if (count >= total)
                    break;
                arr.add(ar + br);
            }

            a = (a + (1 + ar)) % arr.size();
            b = (b + (1 + br)) % arr.size();
            //System.out.println(arr.toString());
        }
        System.out.println(count);
        for (int i = arr.size() - 10; i < arr.size(); i++)
        {
            System.out.print(arr.get(i));
        }
    }
}
