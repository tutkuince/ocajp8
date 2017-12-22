package com.oracle.javacert.associate.chapter04._8lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public LambdaExpression(String speciesName, boolean hooper, boolean swimmer) {
		species = speciesName;
		canHop = hooper;
		canSwim = swimmer;
	}

	public String toString() {
		return species;
	}

	public static void main(String[] args) {
		List<LambdaExpression> les = new ArrayList<>();
		les.add(new LambdaExpression("fish", false, true));
		les.add(new LambdaExpression("kangroo", true, false));
		les.add(new LambdaExpression("rabbit", true, false));
		les.add(new LambdaExpression("turtle", false, true));

		// print(les, new CheckIfHooper());

		// print(les, a -> a.canHop());

		// print(les, t -> t.canSwim());

		System.out.println("These can't hop!");
		print(les, a -> !a.canHop());
		System.out.println("\nThese can't swim");
		print(les, a -> !a.canSwim());

	}

	private static void print(List<LambdaExpression> les, CheckTrait checker) {
		for (LambdaExpression lambdaExpression : les) {
			if (checker.test(lambdaExpression)) {
				System.out.print(lambdaExpression + " ");
			}
		}
		System.out.println();
	}
}

interface CheckTrait {
	boolean test(LambdaExpression le);
}

class CheckIfHooper implements CheckTrait {

	@Override
	public boolean test(LambdaExpression le) {
		return le.canHop();
	}

}
