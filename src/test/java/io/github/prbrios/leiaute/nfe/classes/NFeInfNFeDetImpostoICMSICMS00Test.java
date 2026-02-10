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

public class NFeInfNFeDetImpostoICMSICMS00Test {
    
    public static final String XML = "<ICMS00><orig>0</orig><CST>00</CST><modBC>3</modBC><vBC>100.00</vBC><pICMS>18.00</pICMS><vICMS>18.00</vICMS><pFCP>5.00</pFCP><vFCP>5.00</vFCP></ICMS00>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS00 obj = new NFeInfNFeDetImpostoICMSICMS00();
        obj.setCST("00");
        obj.setModBC("3");
        obj.setOrig("0");
        obj.setpFCP("5.00");
        obj.setpICMS("18.00");
        obj.setvBC("100.00");
        obj.setvFCP("5.00");
        obj.setvICMS("18.00");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        
        JAXBContext context = JAXBContext.newInstance(NFeInfNFeDetImpostoICMSICMS00.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFeDetImpostoICMSICMS00 obj =(NFeInfNFeDetImpostoICMSICMS00) unmarshaller.unmarshal(new StringReader(XML));
        
        assertEquals("00", obj.getCST());
        assertEquals("3", obj.getModBC());
        assertEquals("0", obj.getOrig());
        assertEquals("5.00", obj.getpFCP());
        assertEquals("18.00", obj.getpICMS());
        assertEquals("100.00", obj.getvBC());
        assertEquals("5.00", obj.getvFCP());
        assertEquals("18.00", obj.getvICMS());
    }
}
