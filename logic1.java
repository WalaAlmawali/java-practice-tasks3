public class logic1 {
    public static void main(String[] args){
        // task 1
      /*  logic1 ex1= new logic1();
       System.out.println(ex1.cigarParty(70,true));*/

        // task 2
        /*logic1 ex2= new logic1();
        System.out.println(ex2.caughtSpeeding(86,true));
*/
        // task 3
        /*logic1 ex3= new logic1();
        System.out.println(ex3.love6(1,5));*/

        // task 4
       /* logic1 ex4= new logic1();
        System.out.println(ex4.more20(22));*/

        // task 5
      /*  logic1 ex5= new logic1();
        System.out.println(ex5.nearTen(12));*/

        // task 6
        /*logic1 ex6= new logic1();
        System.out.println(ex6.teaParty(6,8));*/

        // task 7
       /* logic1 ex7= new logic1();
        System.out.println(ex7.twoAsOne(3,2,2));*/

        // task 8
        /*logic1 ex8= new logic1();
        System.out.println(ex8.lastDigit(23,19,3));*/

        // task 9
        /*logic1 ex9= new logic1();
        System.out.println(ex9.maxMod5(3,2));*/

        // task 10
       /* logic1 ex10= new logic1();
        System.out.println(ex10.blueTicket(6,1,4));*/

        // task 11
      /*  logic1 ex11= new logic1();
        System.out.println(ex11.dateFashion(5,5));*/

        // task 12
        /*logic1 ex12= new logic1();
        System.out.println(ex12.sortaSum(10,11));*/

        // task 13
        logic1 ex13= new logic1();
        System.out.println(ex13.in1To10(5,false));



    }
public boolean cigarParty(int cigars, boolean isWeekend){

        if(isWeekend){
            if( cigars >= 40){
                return true;
            }else {
                return false;
            }

        } else if (cigars >= 40 && cigars <= 60) {
            return true;
        }else {
            return false;
        }

}

    public int caughtSpeeding(int speed, boolean isBirthday){
        if(isBirthday ){
            if(speed <= 65){
                return 0;
            } else if (speed>=66 && speed<= 85) {
                return 1;
            }else {
                return 2;
            }
        } else if (speed<= 60) {
            return 0;
        }else if(speed>= 60 && speed <=80){
            return 1;
        }else{
            return 2;
        }

    }

    public boolean love6(int a, int b){
        if(a == 6 || b == 6 ||a + b == 6 || Math.abs(a - b) == 6 ){
            return true;
        }else {
            return false;
        }
    }

    public boolean more20(int n){
        if(n % 20 == 1 || n % 20 ==2){
            return true;
        }else{
            return false;
        }
    }

    public boolean nearTen(int num){
        if(num % 10 == 0 ||num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9){
            return true;
        }else {
            return false;
        }
    }
    public int teaParty(int tea, int candy){
        if(tea < 5 || candy <5){
            return 0;
        }  else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }else {
            return 1;
        }
    }

    public boolean twoAsOne(int a, int b, int c){
        if(a+b == c || a+c==b || c+b==a ){
            return true;
        }else {
            return false;
        }
    }
    public boolean lastDigit(int a, int b, int c){
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if(lastA == lastB || lastA==lastC || lastC==lastB ){
            return true;
        }else {
            return false;
        }
    }

    public int maxMod5(int a, int b){
        if(a==b){
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a,b);
        }else {
            return Math.max(a,b);
        }
    }

    public int blueTicket(int a, int b, int c){
        if(a+b == 10 || b+c == 10 || a+c == 10){
            return 10;
        } else if (a+b == b+c+10 ||a+b == a+c+10) {
            return 5;
        }else{
            return 0;
        }
    }

    public int dateFashion(int you, int date){
        if(you<= 2 || date<= 2){
            return 0;
        } else if ((you >= 8 || date>= 8)) {
            return 2;
        }else{
            return 1;
        }

    }

    public int sortaSum(int a, int b){
        int sum = a +b;
        if(sum >= 10 && sum <= 19){
            return 20;
        }else {
            return sum;}
    }
    public boolean in1To10(int n, boolean outsideMode){
        if(outsideMode == false){
            if( n >= 1 && n<= 10){
                return true;
            }
        } else if (outsideMode == true) {
            if(n>=10 || n <= 1){
                return true;
            }
        }
       return false;
    }
}
