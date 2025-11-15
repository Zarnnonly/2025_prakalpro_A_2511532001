package pekan5;

public class tugasPekan5 {
	public static void main(String[] args) {
		for (int line = 1 ; line <=5; line ++) {
			for (int j = 1 ; j <= (5 - line); j++) {
				System.out.print(".");
			}
			System.out.print(line);
			for (int a = 1 ; a <= -1 + line ; a++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}
}