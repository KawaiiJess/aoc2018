import java.util.Arrays;

public class DCLL
{
    private class Node
    {
        private int data;
        private Node next, prev;

        private Node(int data, Node prev, Node next)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;

    DCLL()
    {
        //Base case curNum == 0
        this.head = new Node(0, this.head, this.head);
    }

    public void solve(int elves, int last)
    {
        int curNum = 1;
        int curElf = 0;
        long[] scores = new long[elves];
        Node cur = this.head;

        //Base case curNum == 1
        Node temp = new Node(curNum, this.head, this.head);
        this.head.next = temp;
        this.head.prev = temp;
        curNum++;
        curElf++;

        while (curNum <= last)
        {
            if (curNum % 23 == 0)
            {
                scores[curElf] += curNum;
                cur = cur.prev.prev.prev.prev.prev.prev.prev.prev;
                scores[curElf] += cur.data;
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                cur = cur.next.next;
                curNum++;
                curElf++;
            }

            temp = new Node(curNum, cur, cur.next);
            temp.next.prev = temp;
            cur.next = temp;
            cur = cur.next.next;
            curNum++;
            curElf = (curElf + 1) % scores.length;
        }
        Arrays.sort(scores);
        System.out.println(scores[scores.length - 1]);
    }

    public void someString()
    {
        Node cur = this.head;
        while (cur != this.head.prev)
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}
