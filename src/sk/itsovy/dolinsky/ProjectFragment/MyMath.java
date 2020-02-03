package sk.itsovy.dolinsky.ProjectFragment;

import java.util.Random;

/**
 * @author Martin Dolinsky
 */
public class MyMath {

	public Fragment add(Fragment a, Fragment b) {
		Fragment result = null;
		int commonDenominator = a.getDenominator() * b.getDenominator();
		result = new Fragment(a.getNumerator()*b.getDenominator() + a.getDenominator() * b.getNumerator(),commonDenominator);
		return result;
	}

	public Fragment add(Fragment a, int value) {
		Fragment temp = new Fragment(value,1);
		return add(temp,a);
	}

	public MixedNumber add(MixedNumber a, MixedNumber b) {
		Fragment one = new Fragment(a.convertToFragment());
		Fragment two = new Fragment(b.convertToFragment());
		Fragment result = add(one,two);
		return result.getMixedNumber();
	}


	public static Fragment sub(Fragment a,Fragment b) {
		Fragment result = null;
		int commonDenominator = a.getDenominator() * b.getDenominator();
		result = new Fragment(a.getNumerator()*b.getDenominator() - a.getDenominator() * b.getNumerator(),commonDenominator);
		return result;
	}

	public MixedNumber sub(MixedNumber a, MixedNumber b) {
		Fragment one = new Fragment(a.convertToFragment());
		Fragment two = new Fragment(b.convertToFragment());
		Fragment result = sub(one,two);
		return result.getMixedNumber();

	}

	public Fragment mul(Fragment a, Fragment b) {
		Fragment result = null;
		result = new Fragment(a.getNumerator() * b.getNumerator(),a.getDenominator() * b.getDenominator());
		return  result;
	}

	//polymorfizmus
	public Fragment mul(Fragment a,int value) {
		Fragment result = null;
		result = new Fragment(a.getNumerator() * value,a.getDenominator());
		return  result;
	}

	public MixedNumber mul(MixedNumber a, MixedNumber b) {
		Fragment one = new Fragment(a.convertToFragment());
		Fragment two = new Fragment(b.convertToFragment());
		Fragment result = mul(one,two);
		return result.getMixedNumber();

	}

	public Fragment div(Fragment a, Fragment b) {
		Fragment result = null;
		result = new Fragment(a.getNumerator() * b.getDenominator(),a.getDenominator() * b.getNumerator());
		return  result;
	}

	public static int random4() {
		Random rn = new Random();

		int a = rn.nextInt(9) + 1;
		int b;
		int c;
		int d;

		do {
			b = rn.nextInt(10);
		} while (a == b);

		do {
			c = rn.nextInt(10);
		} while (b == c || a == c);

		do {
			d = rn.nextInt(10);
		} while (a == d || b == d || c == d);

		return a * 1000 + b * 100 + c * 10 + d;
	}

	public MixedNumber div(MixedNumber a, MixedNumber b) {
		Fragment one = new Fragment(a.convertToFragment());
		Fragment two = new Fragment(b.convertToFragment());
		Fragment result = div(one,two);
		return result.getMixedNumber();
	}

	public int reverseNumber(int number) {
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		return reversedNumber;
	}

}
