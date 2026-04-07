public class logic1 {
    public static void main(String[] args){
        // task 1
      /*  logic1 ex1= new logic1();
       System.out.println(ex1.cigarParty(70,true));*/

        // task 2
        logic1 ex2= new logic1();
        System.out.println(ex2.caughtSpeeding(86,true));


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

}
