import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		if (s1.equals(s2)) {
			System.out.println("Perfect Match");
		} else if (s1.equalsIgnoreCase(s2)
               || s1.toLowerCase().contains(s2.toLowerCase())
               || s2.toLowerCase().contains(s1.toLowerCase())) {
			System.out.println("Partial Match");
		} else {
			System.out.println("Not Match");
		}
	}
}
