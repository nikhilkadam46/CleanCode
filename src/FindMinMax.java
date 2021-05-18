public class FindMinMax
{
    public int max(int[] array, int elements)
    {
        int max=0;
        for (int i = 0; i < elements; i++)
        {
            if (array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }
    public int min(int[] array, int elements) {
        int min=array[0];
        for (int i=0; i<elements;i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {11, 15, 4, 7, 88, 5};
        FindMinMax mm= new FindMinMax();
        System.out.println("Minimum element in the array is : " + mm.min(array, 6));
        System.out.println("Maximum element in the array is : " + mm.max(array, 6));
    }
}

