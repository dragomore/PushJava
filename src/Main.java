import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1 , 2 , 3 };

        Scanner in = new Scanner(System.in);

        System.out.println("First array: ");
        for( int i : array ){
            System.out.print(i + " ");
        }
        System.out.println();

        while( in.hasNextInt() ){
            array = push( array, in.nextInt() );
        }

        in.close();

        System.out.println("New array: ");
        for( int i : array ){
            System.out.print(i + " ");
        }
    }

    public static int[] push(int[] array, int ...elements){
        final int length = array.length;
        int[] result = Arrays.copyOf( array, elements.length + length );
        if (result.length - length >= 0)
            System.arraycopy(elements, 0, result, length, result.length - length);
        return Arrays.copyOf(result, result.length);
    }
}