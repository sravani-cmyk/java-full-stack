package org.studyeasy;

public class Main {
	public static void main(String[] args) {
		Iphone phone = new Iphone();
		String p = phone.processor();
		System.out.println(p);
		System.out.println(phone.spaceInGb());
		System.out.println(phone.airdrop());
		System.out.println(phone.whatsapp());

		SamsungPhone phone1 = new SamsungPhone();
		String p1 = phone1.processor();
		System.out.println(phone1.processor());
		System.out.println(phone1.spaceInGb());




	}

}
