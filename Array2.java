public class Array2 {
    public static void main(String[] args){


        Array2 ex = new Array2();
        // task 1
        int [] arr = {2, 1, 2, 3, 4};
       System.out.println(ex.countEvens(arr));

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

}
