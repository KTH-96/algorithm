package m09.w01.day04;

public class ProBIgNum {
    public String solution(int[] numbers) {
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]/10 == 0){
                arr[i] = numbers[i];
            }else {
                while (true) {
                     numbers[i] = numbers[i]/10;
                    if (numbers[i]/10 == 0){
                        arr[i] = numbers[i];
                        break;
                    }
                }
            }
        }


    }
}
