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
       /* int [] arr = {2, 1, 13,4, 6};
        System.out.println(ex.no14(arr));*/

        // task 6
       /* int [] a = {4, 1, 13,10, 6};
        int [] b = {2, 1, 13,4, 5};
        System.out.println(ex.matchUp(a,b));*/

        // task 7
        /*int [] a = {4, 2, 3,1, 10};
        System.out.println(ex.modThree(a));*/

        // task 8
        /*int [] c = {4, 2, 3,4, 2};
        System.out.println(ex.sameEnds(2,c));*/

        // task 9
       /* int [] a = {1,2,3,4};
        System.out.println(java.util.Arrays.toString(ex.shiftLeft(a)));*/

        // task 10
       /* int [] a = {1,2,4,6,7,8};
        System.out.println(java.util.Arrays.toString(ex.post4(a)));*/

        // task 11
       /* int [] a = {1,2,10,6,10,8};
        System.out.println(java.util.Arrays.toString(ex.withoutTen(a)));*/

        // task 12
        //System.out.println(java.util.Arrays.toString(ex.fizzBuzz(2,5)));

        // task 13
       /* int [] a = {1,2,10,6};
        System.out.println(ex.bigDiff(a));*/

        // task 14
        int [] a = {1,5,10,7,3};
        System.out.println(ex.sum67(a));

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
public int matchUp(int [] nums1 , int [] nums2){
    int count = 0;
        if(nums1.length == nums2.length){
            for(int i = 0; i< nums1.length;i++){
                if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2){
                    count++;
                }
            }
        }
        return count;
}

public boolean modThree(int [] arr) {
    if (arr.length >= 3) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0)) {
                return true;
            } else {
                return false;
            }
        }
    }
    return false;
}

public boolean sameEnds(int n , int [] arr){
        for(int i = 0; i <n;i++){
            if(arr[i] != arr[arr.length - n + i]){
                return false;
            }
        }
        return true;
}

public int [] shiftLeft(int [] arr){
        int temp = arr[0];
        for(int i = 0 ; i<arr.length -1 ; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
}

public int [] post4(int [] arr){
        int last4 = 0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i]==4){
                last4=i;
            }
        }

        int [] result = new int[arr.length - last4 -1];
        for (int i = 0; i<result.length;i++){
            result[i]= arr[last4 + 1 + i];
        }
        return result;
}
public int [] withoutTen(int [] arr){
        int [] result= new int[arr.length];
        int index = 0;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] != 10){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
}

public String [] fizzBuzz(int start , int end){
        String[] result = new String[end - start];

        for(int i = start; i< end;i++){
            if(i % 3 ==0 && i % 5 ==0){
                result[i-start] ="FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start]="Fizz";
            } else if (i % 5 == 0) {
                result[i - start]="Buzz";
            }else {
                result[i - start] = String.valueOf(i);
            }
        }
        return result;
}
public int bigDiff(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i =0 ; i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }

        }
        return max - min;
}
public int sum67(int [] arr){
        int sum = 0;
        boolean ignore = false;

        for (int i =0 ; i<arr.length;i++){
            if(arr[i] == 6){
                ignore = true;
            }

            if(!ignore){
                sum += arr[i];
            }

            if (arr[i] == 7 && ignore){
                ignore = false;
            }
        }
        return sum;

}
}
