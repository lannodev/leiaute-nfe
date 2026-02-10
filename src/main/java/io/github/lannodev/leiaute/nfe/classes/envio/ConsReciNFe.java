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
package io.github.lannodev.leiaute.nfe.classes.envio;

import io.github.lannodev.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "consReciNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsReciNFe extends Base {

	@XmlAttribute(name = "versao")
	private String versao;

	@XmlElement(name = "tpAmb")
	private String tpAmb;

	@XmlElement(name = "nRec")
	private String nRec;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getnRec() {
		return nRec;
	}

	public void setnRec(String nRec) {
		this.nRec = nRec;
	}

}
