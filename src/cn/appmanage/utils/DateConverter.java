package cn.appmanage.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {
	
	private String pattern;
	
	public DateConverter(String pattern){
		this.pattern = pattern;
	}

	@Override
	public Date convert(String value) {
		Date date = null;
		
		try {
			date = new SimpleDateFormat(pattern).parse(value);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return date;
	}

}
