package NHCE;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Strmanip {

    // Part 1: String Manipulation Basic Methods
    void string_mani() {
        String str1 = "Java";
        String str2 = "JavascriptJava";
        System.out.println("-------String Manipulation Methods-----");
        System.out.println("---------------------------------------");
        System.out.println("Combined String using concat():" + str1.concat(str2));
        System.out.println("Length of String: " + str2.length());
        System.out.println("Character at position 5: " + str2.charAt(5));
        System.out.println("Index of character 'a': " + str2.indexOf('a'));
        System.out.println("Compare To 'JAVA': " + str1.compareTo("JAVA"));
        System.out.println("Compare To 'JAVA' - Case Ignored: " + str1.compareToIgnoreCase("JAVA"));
        System.out.println("Contains sequence 'tar': " + str2.contains("rip"));
        System.out.println("Replace 'Java' with 'VB': " + str2.replace("Java", "VB"));
        System.out.println("Replace 'Java' with 'VB': " + str2.replaceFirst("Java", "VB"));
    }

    // Part 2: String Buffer and Tokenizer Methods
    void str_buffer() {
        // StringBuffer Methods
        System.out.println("\n-------String Buffer Methods-----");
        System.out.println("---------------------------------");
        StringBuffer s = new StringBuffer("Bufferclass");
        System.out.println("Appended String : " + s.append("Java"));
        System.out.println("Inserted String : " + s.insert(5, "Java"));
        System.out.println("Reversed String : " + s.reverse());
        System.out.println("Replaced String : " + s.replace(1, 3, "Java"));
        System.out.println("String after deletion : " + s.delete(1, 3));
        System.out.println("String after deletecharat : " + s.deleteCharAt(7));
    }

    void str_tokenizer() {
        System.out.println("\n-------String Tokenizer-----");
        System.out.println("----------------------------");
        StringTokenizer st = new StringTokenizer("Spread the Java Wing", " ");
        System.out.println("Total number of Tokens: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("Spread the Java Wing");
        System.out.println("Next token is : " + st1.nextToken(","));
    }

    // Part 3: Main Method
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Strmanip st = new Strmanip();
        int ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. String Manipulation Basic Methods");
        System.out.println("2. String Buffer Methods");
        System.out.println("3. String Tokenizer");
        
        do {
            System.out.println("Enter the choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    st.string_mani();
                    break;
                case 2:
                    st.str_buffer();
                    break;
                case 3:
                    st.str_tokenizer();
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        } while (ch <= 3);
    }
}
