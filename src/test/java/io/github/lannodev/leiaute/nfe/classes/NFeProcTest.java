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
package io.github.lannodev.leiaute.nfe.classes;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static io.github.lannodev.leiaute.nfe.utils.XmlTestUtils.normalizeXml;
import static org.junit.jupiter.api.Assertions.assertEquals;

@XmlRootElement(name = "nfeProc",namespace = "http://www.portalfiscal.inf.br/nfe")
public class NFeProcTest {

    public static final String XML = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"/>";
    
    @Test
    public void test1() {
        NFeProc obj = new NFeProc();
        obj.setVersao("4.00");

        assertEquals(normalizeXml(XML), normalizeXml(obj.toString()));
    }
    
    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(NFeProc.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeProc obj =(NFeProc) unmarshaller.unmarshal(new StringReader(XML));
        
        assertEquals("4.00", obj.getVersao());
    }

}
