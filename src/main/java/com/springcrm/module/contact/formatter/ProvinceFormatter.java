package com.springcrm.module.contact.formatter;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

import com.springcrm.module.contact.model.Province;
import com.springcrm.module.user.model.Permission;

public class ProvinceFormatter implements Formatter<Province> {

	@Override
	public String print(Province hobby, Locale locale) {
		return hobby.getId().toString();
	}

	@Override
	public Province parse(String id, Locale locale) throws ParseException {
		Province hobby = new Province();
		hobby.setId(Integer.parseInt(id));
		return hobby;
	}
}