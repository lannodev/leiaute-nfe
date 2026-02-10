package io.github.lannodev.leiaute.nfe.classes.evento.retorno;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static io.github.lannodev.leiaute.nfe.utils.XmlTestUtils.normalizeXml;
import static org.junit.jupiter.api.Assertions.assertEquals;

@XmlRootElement(name = "retEvento")
public class RetEnvEventoRetEventoTest {

    public static final String XML = "<retEvento versao=\"0\"/>";
    
	@Test
	public void test1() {
		RetEnvEventoRetEvento obj = new RetEnvEventoRetEvento();
        obj.setVersao("0");
        
		assertEquals(normalizeXml(XML), normalizeXml(obj.toString()));
	}

	@Test
	public void test2() throws Exception {
		JAXBContext context = JAXBContext.newInstance(RetEnvEventoRetEvento.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		RetEnvEventoRetEvento obj =(RetEnvEventoRetEvento) unmarshaller.unmarshal(new StringReader(XML));

		assertEquals("0", obj.getVersao());
	}

}
