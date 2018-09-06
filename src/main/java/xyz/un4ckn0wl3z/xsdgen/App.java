package xyz.un4ckn0wl3z.xsdgen;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {

    		String test = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<soap12:Envelope\r\n    xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\"\r\n    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\r\n    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n    <soap12:Body>\r\n        <CardStatusBankResponse\r\n            xmlns=\"http://tempuri.org/\">\r\n            <CardStatusBankResult>\r\n                <Code>12</Code>\r\n                <Desc>\u0E2A\u0E16\u0E32\u0E19\u0E30\u0E1B\u0E01\u0E15\u0E34</Desc>\r\n            </CardStatusBankResult>\r\n        </CardStatusBankResponse>\r\n    </soap12:Body>\r\n</soap12:Envelope>";
    		JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);

    		 StringReader reader = new StringReader(test);
    		
    		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    		Envelope customer = (Envelope) jaxbUnmarshaller.unmarshal(reader);
    		System.out.println(customer.toString());

    	  } catch (JAXBException e) {
    		e.printStackTrace();
    	  }
    }
}
