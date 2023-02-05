package BitlabArrays;
/* # 19
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце минимальный элемент умноженное на самого себя.
Ввод:
8
4 9 2 5 8 7 11 16
Вывод:
4*/
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }System.out.print(min * min);
    }
}
