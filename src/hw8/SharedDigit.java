package hw8;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,32));
    }

        public static boolean hasSharedDigit(int numA,int numB){
            if((numA<10||numA>99)||(numB<10||numB>99)){
                return false;
            }
            int realNumB=numB;
            while(numA>0){
                int numADig=numA%10;
                while(numB>0){
                    int numBDig=numB%10;
                    if(numADig==numBDig){
                        return true;
                    }
                    numB=numB/10;
                }
                numA=numA/10;
                numB=realNumB;
            }
            return false;
        }
    }
