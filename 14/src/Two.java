import java.util.ArrayList;
import java.util.List;

public class Two
{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);

        int count = 0;
        int a = 0;
        int b = 1;
        String input = "430971";

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
                arr.add(tens);
                arr.add(ones);
            }
            else
            {
                count++;
                arr.add(ar + br);
            }

            a = (a + (1 + ar)) % arr.size();
            b = (b + (1 + br)) % arr.size();

            if (count > 20)
            {
                StringBuilder temp = new StringBuilder();
                for (int i = arr.size() - 10; i < arr.size(); i++)
                {
                    temp.append(arr.get(i));
                }
                if (temp.toString().contains(input))
                    break;
            }
        }

        StringBuilder out = new StringBuilder();
        for (Integer anArr : arr)
        {
            out.append(anArr);
        }
        String actual = out.substring(0, out.indexOf(input));
        System.out.println("RECIPES: " + actual.length());
    }
}