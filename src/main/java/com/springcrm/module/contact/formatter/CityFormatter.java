package com.springcrm.module.contact.formatter;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

import com.springcrm.module.contact.model.City;

public class CityFormatter implements Formatter<City> {

	@Override
	public String print(City hobby, Locale locale) {
		return hobby.getId().toString();
	}

	@Override
	public City parse(String id, Locale locale) throws ParseException {
		City hobby = new City();
		hobby.setId(Integer.parseInt(id));
		return hobby;
	}
}