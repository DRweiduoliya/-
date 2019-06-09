package HLW7;
//实心菱形
public class hlw79 {
	public static void main(String[] asge) {
		//上层部分
//		for (int i = 1; i <= 5; i++) {
//			for (int b = 1; b <= 5 - i; b++) {
//				System.out.print(" ");
//			}
//			for (int n = 1; n <= 2 * i - 1; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//下层部分
//		for (int i = 4; i > 0; i--) {
//			for (int b = 1; b <= 5 - i; b++) {
//				System.out.print(" ");
//			}
//			for (int n = 1; n <= 2 * i - 1; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= 5; i++) {
			for (int b = 1; b <= 5 - i; b++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= 2 * i - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4; i++) {
			for(int b=4;b>4-i;b--) {
				System.out.print(" ");
			}
			for(int n=1 ;n<=((5-i)*2-1);n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}