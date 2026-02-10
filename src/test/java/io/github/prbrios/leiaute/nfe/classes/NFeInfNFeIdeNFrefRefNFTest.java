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
package io.github.prbrios.leiaute.nfe.classes;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NFeInfNFeIdeNFrefRefNFTest {

    public static final String XML = "<refNF><cUF>0</cUF><AAMM>1</AAMM><CNPJ>2</CNPJ><mod>3</mod><serie>4</serie><nNF>5</nNF></refNF>";

    @Test
    public void test1() {
        NFeInfNFeIdeNFrefRefNF obj = new NFeInfNFeIdeNFrefRefNF();
        obj.setcUF("0");
        obj.setAAMM("1");
        obj.setCNPJ("2");
        obj.setMod("3");
        obj.setSerie("4");
        obj.setnNF("5");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(NFeInfNFeIdeNFrefRefNF.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFeIdeNFrefRefNF obj =(NFeInfNFeIdeNFrefRefNF) unmarshaller.unmarshal(new StringReader(XML));

        assertEquals("0", obj.getcUF());
        assertEquals("1", obj.getAAMM());
        assertEquals("2", obj.getCNPJ());
        assertEquals("3", obj.getMod());
        assertEquals("4", obj.getSerie());
        assertEquals("5", obj.getnNF());
    }

}
