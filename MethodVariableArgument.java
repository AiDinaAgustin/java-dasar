public class MethodVariableArgument {
    public static void main(String[] args) {

        // Memanggil method tanpa variable argument
        int [] values = {80, 90, 75, 60, 85};
        sayCongrats("Dinoo", values);

        // Memanggil method dengan variable argument
        hitung("Dina", 80, 90, 75, 60, 85);
    }

    // Method tidak dengan variable argument
    static void sayCongrats(String name, int[] values)
    {
        var total = 0;
        for(var value : values)
        {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75)
        {
            System.out.println("Congratulations " + name + ", you passed the exam");
        } else {
            System.out.println("Sorry " + name + ", you did not pass the exam");
        }
    }

    // Method dengan variable argument
    static void hitung(String name, int... values)
    {
        var total = 0;
        for(var value : values)
        {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75)
        {
            System.out.println("Congratulations " + name + ", you passed the exam");
        } else {
            System.out.println("Sorry " + name + ", you did not pass the exam");
        }
    }
}
