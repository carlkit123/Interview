public class FIFOQUEUE implements IQueuable{
    private String[] arr;  //Storing of the queue
    private int count;     //Number of elements in the queue
    private int max;       //Maximum number of elements that can be inserted into the queue

    FIFOQUEUE(int size)
    {
        arr = new String[size];
        count = 0;
        max = size;
    }

    @Override
    public String[] enqueue(String value) {
        count++;
        String[] temp = new String[max];
        for (int i = 1; i < max ; i++)
        {
            temp[i-1] = arr[i];
        }
        temp[max-1] = value;
        arr = temp;
        return arr;
    }

    @Override
    public String dequeue() {
        String target = arr[max-count];
        arr[max-count]=null;
        count--;
        return target;
    }

    @Override
    public String[] getQueue() {
        String[] temp = new String[count];
        int index = 0;
        for (int i = 0; i < max ; i++)
        {
            if(arr[i]!=null)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        return temp;
    }

    @Override
    public int size() {
        return count;
    }
}
