import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;

/*
 * Вывести список на экран в перевернутом виде (без массивов)
 * 
 */

 class Task1 {

    public class Lesson_4task1 {
        public static<T> List<T> reverseList(List<T> list)
        {
            List<T> reverse = new ArrayList<>(list);
            Collections.reverse(reverse);
            return reverse;
        }
     
        public static void main(String[] args)
        {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     
            List<Integer> reverse = reverseList(list);
            System.out.println(reverse);
        }
    }
    

}
