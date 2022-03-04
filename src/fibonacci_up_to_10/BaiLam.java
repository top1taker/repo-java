package fibonacci_up_to_10;


public class BaiLam {

	public static void main(String[] args) {
		int a = 1, b = 1, temp;
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			temp = b;
			b = b + a;
			a = temp;
		}
	}

}
