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
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NFeInfNFeDetImpostoCOFINSSTTest {

    public static final String XML = "<COFINSST><vBC>0</vBC><pCOFINS>1</pCOFINS><qBCProd>2</qBCProd><vAliqProd>3</vAliqProd><vCOFINS>4</vCOFINS><indSomaCOFINSST>5</indSomaCOFINSST></COFINSST>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoCOFINSST obj = new NFeInfNFeDetImpostoCOFINSST();
        obj.setvBC("0");
        obj.setpCOFINS("1");
        obj.setqBCProd("2");
        obj.setvAliqProd("3");
        obj.setvCOFINS("4");
        obj.setIndSomaCOFINSST("5");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception{
        JAXBContext context = JAXBContext.newInstance(NFeInfNFeDetImpostoCOFINSST.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFeDetImpostoCOFINSST obj =(NFeInfNFeDetImpostoCOFINSST) unmarshaller.unmarshal(new StringReader(XML));

        assertEquals("0", obj.getvBC());
        assertEquals("1", obj.getpCOFINS());
        assertEquals("2", obj.getqBCProd());
        assertEquals("3", obj.getvAliqProd());
        assertEquals("4", obj.getvCOFINS());
        assertEquals("5", obj.getIndSomaCOFINSST());

    }

}
