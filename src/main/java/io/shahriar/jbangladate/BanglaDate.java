package io.shahriar.jbangladate;

import java.time.LocalDateTime;
import java.time.Year;

/**
 * 
 * @author Shahriar Robbani Email: mineme.shahriar@gmail.com http://shahriar.io/
 */

public class BanglaDate {
	private int morning = 6; // when the date will change?
	private int engHour; // Current hour of English Date
	private int engDay; // Current date of English Date
	private int engMonth; // Current month of English Date
	private int engYear; // Current year of English Date
	private int bangDate; // generated Bangla Date in English number
	private String banglaDay; // generated Bangla Date
	private String banglaMonth; // generated Bangla Month
	private String banglaMonthValue; // Value of the month
	private int bangYear; // generated Bangla Year in English number
	private String banglaYear; // generated Bangla Year
	private String[] bn_months = { "পৌষ", "মাঘ", "ফাল্গুন", "চৈত্র", "বৈশাখ", "জ্যৈষ্ঠ", "আষাঢ়", "শ্রাবণ", "ভাদ্র",
			"আশ্বিন", "কার্তিক", "অগ্রহায়ণ" };
	private int[] bn_month_dates = { 30, 30, 30, 30, 31, 31, 31, 31, 31, 30, 30, 30 };
	private int[] bn_month_middate = { 13, 12, 14, 13, 14, 14, 15, 15, 15, 15, 14, 14 };
	private int lipyearindex = 3;
	private char[] bangNumber = { '০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯' };

	public BanglaDate() {
		this.calculate_datetime(LocalDateTime.now());
	}

	public BanglaDate(LocalDateTime dateTime) {
		this.calculate_datetime(dateTime);
	}

	public static BanglaDate now() {
		return new BanglaDate();
	}

	public void calculate_datetime(LocalDateTime dateTime) {
		this.engDay = dateTime.getDayOfMonth();
		this.engMonth = dateTime.getMonthValue();
		this.engYear = dateTime.getYear();
		this.engHour = dateTime.getHour();

		this.calculate_date();
		this.calculate_year();
		this.convert();
	}

	public void calculate_date() {
		this.bangDate = this.engDay - this.bn_month_middate[this.engMonth - 1];
		if (this.engHour < this.morning)
			this.bangDate -= 1;

		if ((this.engDay <= this.bn_month_middate[this.engMonth - 1])
				|| (this.engDay == this.bn_month_middate[this.engMonth - 1] + 1 && this.engHour < this.morning)) {
			this.bangDate += this.bn_month_dates[this.engMonth - 1];
			if (Year.of(this.engYear).isLeap() && this.lipyearindex == this.engMonth)
				this.bangDate += 1;
			this.banglaMonthValue = this.bangla_number(this.engMonth - 1);
			this.banglaMonth = this.bn_months[this.engMonth - 1];
		} else {
			this.banglaMonthValue = this.bangla_number((this.engMonth) % 12);
			this.banglaMonth = this.bn_months[(this.engMonth) % 12];
		}
	}

	public void calculate_year() {
		this.bangYear = this.engYear - 593;
		if ((this.engMonth < 4)
				|| ((this.engMonth == 4) && ((this.engDay < 14) || (this.engDay == 14 && this.engHour < this.morning))))
			this.bangYear -= 1;
	}

	public void convert() {
		this.banglaDay = this.bangla_number(this.bangDate);
		this.banglaYear = this.bangla_number(this.bangYear);
	}

	public String bangla_number(int number) {

		StringBuffer buffer = new StringBuffer();
		Integer temp = new Integer(number);

		int[] num = new int[temp.toString().length()];

		for (int i = 0; i < temp.toString().length(); i++) {
			num[i] = temp.toString().charAt(i) - '0';
		}

		for (int i : num) {
			buffer.append(this.bangNumber[i]);
		}
		return buffer.toString();
	}

	public String getBanglaDay() {
		return banglaDay;
	}

	public String getBanglaMonth() {
		return banglaMonth;
	}

	public String getBanglaYear() {
		return banglaYear;
	}

	@Override
	public String toString() {
		return this.banglaDay + "-" + this.banglaMonth + "-" + this.banglaYear;
	}

	public String getBanglaMonthValue() {
		return banglaMonthValue;
	}

}
