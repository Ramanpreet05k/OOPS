import java.util.Scanner;

class Basics {
    public static void main(String[] args){
        //the following line prints hello
        System.out.println("Hello!");
        int num1=10;
        int num2=12;
        System.out.println(num1+num2);

        int num3 = num1>num2 ? num1 : num2;
        System.out.println(num3);

        String s1 = "Hello";
        String s2 = s1;
        System.out.println(s2);
        System.out.println(s1 + " " + s2); // Concatenate: Hello World
        System.out.println(s1.charAt(1)); // Char at index 1: 'e'
System.out.println(s1.length()); // Length: 5
System.out.println(s1.substring(0, 2)); // Substring: "He"
System.out.println(s1.equals("Hello")); // Check content equality: true
Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
System.out.println(num);
scanner.close();    
}
}