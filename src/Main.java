import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Noten noten1= new Noten(new int[]{29, 37, 38,41, 84, 67});
        System.out.println(Arrays.toString(noten1.getNichtAusreichendeNoten()));
        System.out.println((noten1.getMittelwert()));
        System.out.println(Arrays.toString(noten1.getAbgerundeteNoten()));
        System.out.println((noten1.getMaxNoten()));
        Array array1= new Array(new int[]{4, 8, 3,10,17});
        System.out.println(array1.getMax());
        System.out.println(array1.getMin());
        System.out.println(array1.maxSum());
        System.out.println(array1.minSum());
    }
}
