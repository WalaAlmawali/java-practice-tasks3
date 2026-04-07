public class logic2 {
    public static void main(String[] args){

        // task 1
       /* logic2 ex1 = new logic2();
        System.out.println(ex1.fizzString("fib"));*/

        // task 2
       /* logic2 ex2 = new logic2();
        System.out.println(ex2.inOrder(1,1,2,true));*/

        // task 3
       /* logic2 ex3 = new logic2();
        System.out.println(ex3.lessBy10(11,1,7));*/

        // task 4
       /* logic2 ex4 = new logic2();
        System.out.println(ex4.redTicket(0,0,0));*/

        // task 5
       /* logic2 ex5 = new logic2();
        System.out.println(ex5.shareDigit(12,44));*/

        // task 6
//   logic2 ex6 = new logic2();
//        System.out.println(ex6.squirrelPlay(95,true));

        // task 7
       /* logic2 ex7 = new logic2();
        System.out.println(ex7.alarmClock(0,false));*/

        // task 8
        /*logic2 ex8= new logic2();
        System.out.println(ex8.specialEleven(24));*/

        // task 9
        logic2 ex9= new logic2();
        System.out.println(ex9.less20(20));

    }

    public String fizzString(String str){
        if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk == false){
            if(b > a && c > b){
                return true;
            }
        } else if (bOk == true) {
            if(c > b){
                return true;
            }
        }
        return false;
    }

    public boolean lessBy10(int a, int b, int c){
        if((Math.abs(a-b) >= 10) || (Math.abs(a-c) >= 10) || (Math.abs(b-c) >= 10)){
            return true;
        }
        return false;
    }

    public int redTicket(int a, int b, int c){
        if( a == 2 && b == 2 && c == 2){
            return 10;
        } else if (a == b && a == c) {
            return 5;
        } else if (b == c && b != a) {
            return 1;
        }
        return 0;
    }
    public boolean shareDigit(int a, int b){
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft =b / 10;
        int bRight = b % 10;

        if((aLeft == bLeft) || (aLeft == bRight) || (aRight == bLeft) || (aRight == bRight)){
            return true;
        }
        return false;
    }

    public boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer == false){
            if(temp >= 60 && temp <= 90){
                return true;
            }
        } else if (isSummer == true) {
            if(temp >= 60 && temp <= 100){
                return  true;
            }
        }
        return false;
    }
    public String alarmClock(int day, boolean vacation){
        if(day == 0 || day == 6){
            if(vacation == false){
                return "10:00";
            }else {
                return "off";
            }
        } else if (vacation == false) {
            return "7:00";
        }else{
            return "10:00";
        }
    }
    public boolean specialEleven(int n){
        if(n % 11 == 0 || n % 11 == 1){
            return true;
        }
        return false;
    }
    public boolean less20(int n){
        if(n % 20 == 18 || n % 20 == 19){
            return true;
        }
        return false;
    }
}
