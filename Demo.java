

public class Demo {
    public static void main(String[] args) {
        int num [] [] = new int [3] [4];
        Math.random();

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                num [i] [j] = (int)(Math.random() * 10);
                System.out.print(num [i] [j] + " ");
            }
            System.out.println();
        }

        System.err.println("------------------");

        for (int n[] : num){
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
