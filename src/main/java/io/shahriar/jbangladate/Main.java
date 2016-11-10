package io.shahriar.jbangladate;

/**
 * 
 * @author Shahriar Robbani Email: mineme.shahriar@gmail.com http://shahriar.io/
 */
public class Main {
	public static void main(String[] args) {

		BanglaDate banglaDate = BanglaDate.now();
		System.out.println(banglaDate);
		System.out.println(banglaDate.getBanglaDay());
		System.out.println(banglaDate.getBanglaMonth());
		System.out.println(banglaDate.getBanglaYear());
		System.out.println(banglaDate.getBanglaMonthValue());
	}

}
