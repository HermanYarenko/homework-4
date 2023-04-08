import java.util.LinkedList;
import java.util.ListIterator;

/**
 * List
 */
public class program123{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Список:\n" + list);

        reverseList(list);

        System.out.println("\nреверсый список:\n" + list);
        
        System.out.println("\n сумма списка (вроде как ): " + sumOfList(list) + "\n");

        program2 myQueue = new program2(1, 5);

        System.out.println("Ваша очередь: " + myQueue.toString());

        myQueue.enqueue(55);

        System.out.println("элемент который удалиться первым: " + myQueue.dequeue());

        System.out.println("элемент который стал первым " + myQueue.first());

        System.out.println("новая очередь: " + myQueue.toString() + "\n");


    }

    public static void reverseList(LinkedList<Integer> linkedList)
    {
        for (int i = 0; i < linkedList.size()/2; i++) {
            Integer temp = linkedList.get(i);   

            linkedList.set(i, linkedList.get(linkedList.size()-1-i));
            linkedList.set(linkedList.size()-1-i, temp);   

            

        }
        
    }

    public static int sumOfList(LinkedList<Integer> linkedList)
    {
        ListIterator<Integer> iterator = linkedList.listIterator(0);
        int sum = 0;
        while(iterator.hasNext())
        {
            sum += iterator.next();
        }
        return sum;

    }
}