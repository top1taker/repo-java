package user_pass;

import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập username: ");
		String username = input.nextLine();

		System.out.print("Nhập password: ");
		String password = input.nextLine();

		if (Objects.equals(username, "HuyHoang") && Objects.equals(password, "2021"))
			System.out.println("Đã nhập đúng (u, p)");
		else
			System.out.println("Sai username hoặc password");
	}

}
