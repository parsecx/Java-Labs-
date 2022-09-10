public class ZadOne {
    /**
     * First method in task.
     * Checks whether array is sorted or not.
     * @param someArray Any integer array.
     * @return True if array is sorted.
     */
    public static boolean arrayChecker(int[] someArray) {
        boolean flag = true;
        for (int i = 0; i < someArray.length-1; i++) {
            if(someArray[i]>someArray[i+1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * Second method in our task.
     * Prints out numbers from 1 to 100 and checks whether number
     * is dividable by 3, 5 or both. If it's 3 then prints out "Fizz",
     * if it's 5, prints out "Buzz" and if it's 3 and 5 then prints out "FizzBuzz".
     */
    public static void fizzBuzzPrinter() {
        for(int i = 0; i<=100; i++) {
            if(i%3==0) {
                System.out.println("Fizz");
                if (i%3==0 && i%5==0) {
                    System.out.println("FizzBuzz");
                }
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Third method in out task.
     * Checks whether hafls of the array are equal.
     * @param someArray Any integer array with more than two elements.
     * @return True, if two halfs of the array if equal.
     */
    public static boolean arrayHalfChecker(int[] someArray) {
        boolean flag;
        int length = someArray.length;
        int sumFirstHalf = 0, sumSecondHalf = 0;
        for(int i = 0; i<length; i++) {
            if(i<length/2) {
                sumFirstHalf += someArray[i];
            } else {
                sumSecondHalf += someArray[i];
            }
        }
        if(sumFirstHalf==sumSecondHalf) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}


