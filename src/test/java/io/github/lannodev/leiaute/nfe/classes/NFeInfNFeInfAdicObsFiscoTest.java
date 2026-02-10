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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlElement;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NFeInfNFeInfAdicObsFiscoTest {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xtexto")
    @XmlElement(name = "xTexto")
    private String xTexto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcampo")
    @XmlElement(name = "xCampo")
    private String xCampo;

    public static final String XML = "<obsFisco><xTexto>0</xTexto><xCampo>1</xCampo></obsFisco>";
    
    @Test
    public void test1() {
        NFeInfNFeInfAdicObsFisco obj = new NFeInfNFeInfAdicObsFisco();
        obj.setxTexto("0");
        obj.setxCampo("1");

        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        JAXBContext context = JAXBContext.newInstance(NFeInfNFeInfAdicObsFisco.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        NFeInfNFeInfAdicObsFisco obj =(NFeInfNFeInfAdicObsFisco) unmarshaller.unmarshal(new StringReader(XML));
        
        assertEquals("0", obj.getxTexto());
        assertEquals("1", obj.getxCampo());
    }

}
