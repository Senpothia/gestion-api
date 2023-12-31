package com.michel.gestionapi.constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants {

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");

	public final static String YOUR_SECRET = "secret";
	public final static String USER_ID = "userId";
	public final static String ROLE = "role";
	public final static String AUTHORIZATION_HEADER = "Authorization";
	public final static String BEARER_TOKEN = "Bearer ";

	public static String convertDateToString(LocalDateTime date) {

		String convertedDate = date.format(formatter);
		return convertedDate;
	}

	public static LocalDateTime formatStringToDate(String stringDate) {

		LocalDateTime date = LocalDateTime.parse(stringDate + " " + "00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		return date;

	}

}
