// Dina

public class BelajarString {
    public static void main(String[] args) {
        String name = new String("Rizky");
        System.out.println("Hello " + name);
        // toLowerCase untuk mengubah string menjadi huruf kecil
        System.out.println(name.toUpperCase());
        // Concat untuk menggabungkan string
        System.out.println(name.concat("Dina"));
        // Replace untuk mengganti string
        System.out.println(name.replace("Rizky", "Dina"));
        // Length untuk menghitung panjang string
        System.out.println(name.length());
        // CharAt untuk mengambil karakter pada index tertentu
        System.out.println(name.charAt(0));
    }
}
