public class Array {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5]; // Jagged

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = i + j + k;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    System.out.print(nums[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}
