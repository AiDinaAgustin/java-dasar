public class UseStringBuffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Rizky");
        name.append(" Dina");

        // Insert untuk menyisipkan string pada index tertentu
        name.insert(0, "Hello ");
        // name.deleteCharAt(0);

        System.out.println(name);
    }
}
