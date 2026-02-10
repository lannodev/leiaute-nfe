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

public class NFeInfNFePagDetPagTest {

    public static final String XML = "<detPag><indPag>0</indPag><tPag>1</tPag><xPag>2</xPag><vPag>3</vPag></detPag>";

    @Test
    public void test1() {
        NFeInfNFePagDetPag obj = new NFeInfNFePagDetPag();
        obj.setIndPag("0");
        obj.settPag("1");
        obj.setxPag("2");
        obj.setvPag("3");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(NFeInfNFePagDetPag.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFePagDetPag obj =(NFeInfNFePagDetPag) unmarshaller.unmarshal(new StringReader(XML));

        assertEquals("0", obj.getIndPag());
        assertEquals("1", obj.gettPag());
        assertEquals("2", obj.getxPag());
        assertEquals("3", obj.getvPag());
    }

}
