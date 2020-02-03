package sk.itsovy.dolinsky.ProjectFragment;

import static sk.itsovy.dolinsky.ProjectFragment.Bank.loan;
import static sk.itsovy.dolinsky.ProjectFragment.MyMath.random4;

/**
 * @author Martin Dolinsky
 */
public class Main {
	public static void main(String[] args) {
	/*	Fragment f1 = new Fragment(32,48);
		Fragment f2 = new Fragment(7,28);

		System.out.println(f1.toString());
		f1.changeToBasicShape();
		System.out.println(f1.toString());
		f1.extendFragment(-5);
		System.out.println(f1.toString());

		f2.changeToBasicShape();
		System.out.println(f2.toString());
		System.out.println(f2.isFragmentBasicShape());

		Fragment f3 = new Fragment(7,0);
		Fragment f4 = f2.copy();
		Fragment f5 = new Fragment(f1);

		MixedNumber m1 = new MixedNumber(4,2,7);
		System.out.println(m1.toString());

		MyMath math = new MyMath();

		System.out.println();
		System.out.println(f1);
		System.out.println(f2);

		Fragment f6 = math.mul(f1,f2);
		System.out.println(f6);
		MyMath.sub(f1,f2);
		math.sub(f1,f2);
		System.out.println();
		*/

		Rectangle rectangle = new Rectangle(12,5);
        System.out.println("Diagonale: " + rectangle.calcDiagonale());
		rectangle.printRectangle();
		rectangle.setCharacter('&');
		rectangle.showRectangle();
		rectangle.setFill(true);
        rectangle.showRectangle();

        System.out.println();
        Bank bank = new Bank("Tatrabanka");
        System.out.println("Output is different because of rate accuracy.");
        System.out.println(bank.convert(120, "CHF"));
        System.out.println(bank.convert(520, "USD"));
        System.out.println(loan(1000, 4.5, 20));
        System.out.println(loan(6000, 2.8, -36));
        System.out.println();
        loan(1000, 1, 1);

        MyMath math = new MyMath();
        System.out.println(math.reverseNumber(123));

        for (int i = 0; i < 1000; i++) {
            System.out.print(random4() + " ");
        }
	}
}
