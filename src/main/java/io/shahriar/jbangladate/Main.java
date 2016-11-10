package io.shahriar.jbangladate;

public class Main {

	public static void main(String[] args) {


		
//		System.out.println(Instant.now().getEpochSecond());
		

/*		Instant.now();
		Date date = Date.from(Instant.ofEpochSecond(1478504028));
		Calendar.getInstance().get(Calendar.DATE);
		System.out.println(date);*/
		BanglaDate b = BanglaDate.now();
		System.out.println(b);
	}

}
