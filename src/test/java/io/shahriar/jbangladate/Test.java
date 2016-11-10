package io.shahriar.jbangladate;

import org.junit.Assert;

public class Test {
	@org.junit.Test
	public void testBanglaNumberConvert() {
		BanglaDate banglaDate = new BanglaDate();
		Assert.assertEquals("Can not convert to bangla numbers", banglaDate.bangla_number(5697421), "৫৬৯৭৪২১");
	}

	@org.junit.Test
	public void testDate() {
		BanglaDate b = BanglaDate.now();
		Assert.assertEquals("Date Creation failed!", b.toString(), b.toString());
	}
}
