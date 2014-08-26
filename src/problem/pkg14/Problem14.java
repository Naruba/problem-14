package problem.pkg14;

public class Problem14 {

    public static long terms = 1;
    public static long highestTerms = 0;
    public static long highestNum = 0;
    public static void main(String[] args) {
        for(long i = 1 ; i <= 1000000; i++){
            System.out.printf("NUM = %d\n",i);
        collatz(i);
        if(terms>highestTerms){
            highestTerms = terms;
            highestNum = i;
        }
        terms=1;
        }
        System.out.printf("highest terms = %d, number = %d\n",highestTerms,highestNum);
    }

    public static long collatz(long num) {
        if (num != 1) {
            if (num % 2 == 0) {//even
                terms++;
                num /= 2;
                return collatz(num);
            } else {//is odd
                terms++;
                num = num * 3 + 1;
                return collatz(num);
            }
        } else {
            return num;
        }

    }

}
