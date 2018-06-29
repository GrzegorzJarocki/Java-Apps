package pl.coderslab.exercise2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> userList = LottoScanner.startGettingNumbers();
		System.out.println(LottoChecker.getUserScore(userList));
	}

}
