package assistedPracticeProjects;

public class ThrowExecption {
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        int[] array = new int[3];//
            array[7] = 3;
            System.out.println("The array is of size " + array.length);
    }
}
