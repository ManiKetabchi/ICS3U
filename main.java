public class main {
    public static void main(String[] args) {

        System.out.println("1. Numeric Operations:");
        System.out.println();

        int a = 1;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println();
        System.out.println("2. Temperature Conversion:");
        System.out.println();

        float celsius_temp = 20;
        float fahrenheit_temp = (celsius_temp * 9 / 5) + 32;

        System.out.println(fahrenheit_temp);

        System.out.println();
        System.out.println("3. Personal Introduction:");
        System.out.println();

        String name = "Mani";
        int age = 15;

        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");

        System.out.println();
        System.out.println("4. Boolean Logic");
        System.out.println();

        boolean is_sunny = true;
        boolean is_weekend = true;

        if (is_sunny == true) {
            System.out.println("It is sunny today.");
        } else {
            System.out.println("It is not sunny today.");
        }

        if (is_weekend == true) {
            System.out.println("It is a weekend today.");
        } else {
            System.out.println("It is not a weekend today.");
        }

        System.out.println();
        System.out.println("5. Quote of the Day");
        System.out.println();

        System.out.println("Quote of the day:");
        System.out.println("- Author");

        System.out.println();
        System.out.println("6. Boolean Challenge");
        System.out.println();

        boolean is_js_fun = true;

        if (is_js_fun == true) {
            System.out.println("JavaScript is fun!");
        } else {
            System.out.println("JavaScript is not fun!");
        }

        System.out.println();
        System.out.println("7. Personal Fact Sheet");
        System.out.println();

        String name2 = "Mani";
        String age2 = "15";
        String city = "Toronto";

        System.out.println("Hello my name is " + name2 + ", I am " + age2 + " years old, and I live in " + city + ".");
    }
}
