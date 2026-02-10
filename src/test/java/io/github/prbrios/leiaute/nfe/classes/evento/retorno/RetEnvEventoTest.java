package io.github.prbrios.leiaute.nfe.classes.evento.retorno;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static io.github.prbrios.leiaute.nfe.utils.XmlTestUtils.normalizeXml;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetEnvEventoTest {

    public static final String XML = "<retEnvEvento versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><idLote>1</idLote><tpAmb>2</tpAmb><verAplic>3</verAplic><cOrgao>4</cOrgao><cStat>5</cStat><xMotivo>6</xMotivo></retEnvEvento>";

    @Test
    public void test1() {
        RetEnvEvento obj = new RetEnvEvento();
        obj.setVersao("0");
        obj.setIdLote("1");
        obj.setTpAmb("2");
        obj.setVerAplic("3");
        obj.setcOrgao("4");
        obj.setcStat("5");
        obj.setxMotivo("6");

        assertEquals(normalizeXml(XML), normalizeXml(obj.toString()));
    }

    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(RetEnvEvento.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        RetEnvEvento obj =(RetEnvEvento) unmarshaller.unmarshal(new StringReader(XML));

        assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getIdLote());
        assertEquals("2", obj.getTpAmb());
        assertEquals("3", obj.getVerAplic());
        assertEquals("4", obj.getcOrgao());
        assertEquals("5", obj.getcStat());
        assertEquals("6", obj.getxMotivo());
    }
}
