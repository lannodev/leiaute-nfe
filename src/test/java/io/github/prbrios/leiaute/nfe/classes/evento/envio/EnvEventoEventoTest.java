/*
 * Copyright 2022 prbrios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.prbrios.leiaute.nfe.classes.evento.envio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static io.github.prbrios.leiaute.nfe.utils.XmlTestUtils.normalizeXml;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvEventoEventoTest {

    public static final String XML = "<evento versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"/>";
    
	@Test
	public void test1() {
		EnvEventoEvento obj = new EnvEventoEvento();
        obj.setVersao("0");
		assertEquals(normalizeXml(XML), normalizeXml(obj.toString()));
	}

	@Test
	public void test2() throws Exception {
		JAXBContext context = JAXBContext.newInstance(EnvEventoEvento.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		EnvEventoEvento obj =(EnvEventoEvento) unmarshaller.unmarshal(new StringReader(XML));

		assertEquals("0", obj.getVersao());
	}

}
