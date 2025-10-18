public class Array {
    private int[] array;
    private int n;

    public Array(int[] array) {
        this.array = array;
    }

    public int getMax(){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public int getMin(){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public int maxSum(){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
    return sum-getMin();
    }
    public int minSum(){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum-getMax();
    }
}
