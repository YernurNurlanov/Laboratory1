public class Task8 {
    /*
    @ isDigit - definition of func which check whether string is all consists of digits
    @ arr - array of elements of string
    @ length - length of array
    @ counter - counts elements which is not digit
    @ return - returning counter of elements which is not digit
     */
    public static int isDigit(char[] arr, int length, int counter){
        if (length > 0){
            //if element isn't digit => (counter of not digit element)++
            if (Character.isDigit(arr[length])){
                counter = isDigit(arr, length - 1, counter);
            }
            else {
                counter = isDigit(arr, length - 1, counter + 1);
            }
        }
        return counter;
    }
}
