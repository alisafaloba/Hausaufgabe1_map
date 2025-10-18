public class Shop {
    private int[] usbpreis;
    private int[] tastaturpreis;
    private int budgetpreis;
    public Shop(int[] usbpreis, int[] tastaturpreis,int budgetpreis) {
        this.usbpreis = usbpreis;
        this.tastaturpreis = tastaturpreis;
        this.budgetpreis = budgetpreis;
    }

    public int getMinTastaturpreis() {
        int min=tastaturpreis[0];
        for(int i = 1; i < tastaturpreis.length; i++){
            if(tastaturpreis[i]<min){
                min=tastaturpreis[i];
            }
        }
        return min;
    }
    public int getMaxUsbpreisB() {
        int max=0;
        for(int i = 0; i < usbpreis.length; i++){
            if(usbpreis[i]<=budgetpreis) {
                if (usbpreis[i] > max) {
                    max = usbpreis[i];

                }
            }

        }
        return max;
    }

    public int getMaxTastaturpreisBudget() {
        int max=0;
        for(int i = 0; i < tastaturpreis.length; i++){

            if(tastaturpreis[i]>max){
                max=tastaturpreis[i];
            }
        }
        return max;
    }

    public int getMaxTastaturpreis() {
        int max=0;
        for(int i = 0; i < tastaturpreis.length; i++){
            if(tastaturpreis[i]>max){
                max=tastaturpreis[i];
            }

        }
        return max;
    }

    public int getMaxUsbpreis() {
        int max=0;
        for(int i = 0; i < usbpreis.length; i++){
            if(usbpreis[i]>max){
                max=usbpreis[i];
            }
        }
        return max;
    }

    public int getTeuergegenstand() {
        if(getMaxTastaturpreis()<=getMaxUsbpreis()){
            return getMaxUsbpreis();
        }
        else{
            return getMaxTastaturpreis();
        }
    }
    public int getMaxGeld()
        {
        int max=0;
        for(int i = 0; i < usbpreis.length; i++){
            for (int j = 0; j < tastaturpreis.length; j++){
                if(usbpreis[i]+tastaturpreis[j]<=budgetpreis){
                    if(usbpreis[i]+tastaturpreis[j]>max){
                        max=usbpreis[i]+tastaturpreis[j];
                    }
                }
            }
        }
        if(max==0)
            return -1;
        return max;
        }

}
