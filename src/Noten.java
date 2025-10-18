import java.util.Arrays;

public class Noten {
    private int[] Noten = new int[100];

    public Noten(int[] noten) {
        Noten = noten;
    }
    public int[] getNichtAusreichendeNoten() {
        int[] nichtAusreichendeNoten = new int[100];
        int j=0;
        for(int i = 0; i < Noten.length; i++){
            if(Noten[i]<40){
                nichtAusreichendeNoten[j] = Noten[i];
                j++;
            }
        }
        return Arrays.copyOf(nichtAusreichendeNoten, j);

    }

    public double getMittelwert() {
        float sum = 0;
        for (int j : Noten) {
            sum += j;
        }
        double avg = sum / Noten.length;
        return (Math.floor(avg* 100) / 100);
    }

    public int[] getAbgerundeteNoten() {
        int[] abgerundeteNoten = new int[100];
        int j=0;
        for(int i = 0; i <Noten.length; i++){
            if(Noten[i]<38){
                abgerundeteNoten[j] = Noten[i];
                j++;
            }else
            {
                int aux;
                aux=Noten[i];
                while(aux%5 != 0)
                {
                    aux++;
                }
                if(aux-Noten[i] < 3)
                    {
                    abgerundeteNoten[j] = aux;
                    j++;
                    }else
                    {
                        abgerundeteNoten[j] = Noten[i];
                    }
            }
        }

        return Arrays.copyOf(abgerundeteNoten, j);

    }

    public int getMaxNoten() {
        int max = 0;
        for(int i = 0; i < getAbgerundeteNoten().length; i++){
            if(getAbgerundeteNoten()[i] > max){
                max=getAbgerundeteNoten()[i];
            }
        }
        return max;
    }

}
