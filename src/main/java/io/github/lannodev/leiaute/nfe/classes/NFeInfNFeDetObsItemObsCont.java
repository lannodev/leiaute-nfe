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
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.lannodev.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@JsonRootName("obscont")
@XmlRootElement(name = "obsCont")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetObsItemObsCont extends Base {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xcampo")
	@XmlElement(name = "xCampo")
	private String xCampo;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xtexto")
	@XmlElement(name = "xTexto")
	private String xTexto;

	public NFeInfNFeDetObsItemObsCont() {}

	public NFeInfNFeDetObsItemObsCont(String xCampo, String xTexto) {
		this.xCampo = xCampo;
		this.xTexto = xTexto;
	}

	public String getxCampo() {
		return xCampo;
	}

	public void setxCampo(String xCampo) {
		this.xCampo = xCampo;
	}

	public String getxTexto() {
		return xTexto;
	}

	public void setxTexto(String xTexto) {
		this.xTexto = xTexto;
	}

}
