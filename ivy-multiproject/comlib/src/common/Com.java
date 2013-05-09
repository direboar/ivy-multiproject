package common;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import common.config.KeyValue;
import common.config.Property;

public class Com {

	public void exec() throws Exception{
		JAXBContext context = JAXBContext.newInstance(Property.class);
		Marshaller marshaller = context.createMarshaller();

		Property property = new Property();
		KeyValue keyValue = new KeyValue();
		keyValue.setKey("x");
		keyValue.setValue("1");
		property.getKeyValues().add(keyValue);

		keyValue = new KeyValue();
		keyValue.setKey("y");
		keyValue.setValue("2");
		property.getKeyValues().add(keyValue);

		StringWriter sw = new StringWriter();
		marshaller.marshal(property, sw);

		String xml = sw.toString();
		System.out.println(xml);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		StringReader sr = new StringReader(xml);
		Property p = Property.class.cast(unmarshaller.unmarshal(sr));

	}

	public static void main(String args[]) throws Exception{
		new Com().exec();
	}
}
