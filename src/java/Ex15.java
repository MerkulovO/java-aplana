package java;


public class Ex15 {


    public static void main(String[] args) {

        int[] array = {4,5,12,7,8,1,-1,-14};

        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int someValue = array[j];
                    array[j] = array[j+1];
                    array[j+1] = someValue;
                }
            }
    }


}
}
