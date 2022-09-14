public class LIFOQUEUE implements IQueuable{
    private String[] arr;  //Storing of the stack
    private int count;     //Number of elements in the stack
    private int max;       //Maximum number of elements that can be inserted into the stack

    LIFOQUEUE(int size)
    {
        arr = new String[size];
        count = size;
        max = size;
    }

    @Override
    public String[] enqueue(String value) {
        count--;
        arr[count] = value;
        return arr;
    }

    @Override
    public String dequeue() {
        String target = arr[count];
        arr[count] = null;
        count++;
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
