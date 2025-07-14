public class PersonInfo {

    // This is a reusable method that returns true/false
    static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        String name = "John";  // Capital 'S' in String
        int age = 25;

        // Correct way to use string concatenation in Java
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Call the method
        boolean result = isAdult(age);
        System.out.println("Is adult: " + result);
    }
}
