import java.util.Arrays;

public class Zahlen {
    private int[] zahl1;
    private int[] zahl2;

    Zahlen(int[] zahl1, int[] zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        if (zahl1.length != zahl2.length)
            throw new IllegalArgumentException("Lengths of zahl1 and zahl2 arrays don't match");

    }

    public int[] summe() {
        int[] ergebnis = new int[20];
        int j = 19;
        int rest = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int sum = zahl1[i] + zahl2[i] + rest;
            if (sum <= 9) {
                ergebnis[j] = sum;
                rest = 0;

            } else {
                ergebnis[j] = sum % 10;
                rest = 1;
            }
            j--;

        }
        ergebnis[j] = rest;
        return ergebnis;
    }

    public int[] dif() {
        int[] ergebnis = new int[20];
        int j = 19;
        int rest = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int dif = zahl1[i] - zahl2[i] + rest;
            if (dif>= 0) {
                ergebnis[j] = dif;
                rest = 0;
            } else {
                ergebnis[j] = 10 - (zahl2[i] - zahl1[i]);
                rest = -1;
            }
            j--;
        }
        return ergebnis;
    }

    public int[] mul(int n) {
        int[] ergebnis = new int[20];
        int j = 19;
        int rest = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int mul = zahl1[i] *n+ rest;
            if (mul <=9) {
                ergebnis[j] = mul;
                rest = 0;
            } else {
                ergebnis[j] = mul%10;
                rest = (mul/10)%10;
            }
            j--;
        }
        ergebnis[j] = rest;
        return ergebnis;
    }

    public int[] div(int n) {
        int[] ergebnis = new int[20];
        int rest = 0;
        int ct=0;

        for (int i = 0; i < zahl1.length; i++) {
            int current = rest * 10 + zahl1[i];
            ergebnis[i] = current / n;
            rest = current % n;
            ct++;
        }

        return Arrays.copyOf(ergebnis,ct);
    }





}
