public class Array2 {
    public static void main(String[] args){


        Array2 ex = new Array2();
        // task 1
        /*int [] arr = {2, 1, 2, 3, 4};
       System.out.println(ex.countEvens(arr));*/

        // task 2
        /*int [] arr = {2, 1, 13, 3, 4};
        System.out.println(ex.sum13(arr));*/

        // task 3
        /*int [] arr = {2, 4, 13,5, 4};
        System.out.println(ex.lucky13(arr));*/

        // task 4
        //  System.out.println(java.util.Arrays.toString(ex.fizzArray(6)));

        // task 5
        int [] arr = {2, 1, 13,4, 6};
        System.out.println(ex.no14(arr));


    }
    public int  countEvens(int [] arr){
        int count = 0;

        for(int i =0; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int sum13(int [] arr ){
        int total = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]== 13){
                i++;
            }else {
                total+= arr[i];
            }
        }
        return total;
    }

    public boolean lucky13(int [] arr ){
        for(int i =0; i<arr.length;i++){
            if(arr[i]== 1 || arr[i]== 3){
                return false;
            }
        }
        return true;
    }

    public int [] fizzArray(int n ){
        int [] array = new int[n];
        for(int i =0; i<array.length;i++){
            array[i]=i;
        }
        return array;
    }

    public boolean no14(int [] arr){
        boolean has1 = false;
        boolean has4 = false;

        for (int i =0 ; i< arr.length;i++){
            if(arr[i] == 1){
                has1 = true;
            }
            if(arr[i] == 4){
                has4 = true;
            }

        }
        if(has4 == true && has1 == true){
            return false;
        }
        return true;
    }

}
