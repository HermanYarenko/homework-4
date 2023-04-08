import java.util.LinkedList;

public class program2 {
    private LinkedList<Integer> list = new LinkedList<>();

    program2(){};

    program2(int startRange, int endRange)  // конструктор для быстрого заполнения
    {
        for (; startRange <= endRange; startRange++) {
            list.add(startRange);
        }
    }

    public void enqueue(int newElement)
    {
        list.addLast(newElement);
    }

    public int dequeue()
    {
        int temp = list.getFirst();
        list.removeFirst();
        return temp;
    }

    public int first()
    {
        return list.getFirst();
    }

    @Override
    public String toString() {  
         
        return list.toString();
    }
}