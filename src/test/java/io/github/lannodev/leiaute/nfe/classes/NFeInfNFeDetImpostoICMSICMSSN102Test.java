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

public class NFeInfNFeDetImpostoICMSICMSSN102Test {

    public static final String XML = "<ICMSSN102><orig>0</orig><CSOSN>1</CSOSN></ICMSSN102>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN102 obj = new NFeInfNFeDetImpostoICMSICMSSN102();
        obj.setOrig("0");
        obj.setCSOSN("1");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(NFeInfNFeDetImpostoICMSICMSSN102.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFeDetImpostoICMSICMSSN102 obj =(NFeInfNFeDetImpostoICMSICMSSN102) unmarshaller.unmarshal(new StringReader(XML));

        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCSOSN());
    }
}
