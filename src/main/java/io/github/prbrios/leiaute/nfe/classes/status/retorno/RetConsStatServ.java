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
package io.github.prbrios.leiaute.nfe.classes.status.retorno;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(
		name = "retConsStatServ",
		namespace = "http://www.portalfiscal.inf.br/nfe"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class RetConsStatServ extends Base {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
	@XmlAttribute(name = "versao")
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpAmb")
	@XmlElement(name = "tpAmb")
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("verAplic")
	@XmlElement(name = "verAplic")
	private String verAplic;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cStat")
	@XmlElement(name = "cStat")
	private String cStat;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xMotivo")
	@XmlElement(name = "xMotivo")
	private String xMotivo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cUF")
	@XmlElement(name = "cUF")
	private String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhRecbto")
	@XmlElement(name = "dhRecbto")
	private String dhRecbto;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhRetorno")
	@XmlElement(name = "dhRetorno", required = false)
	private String dhRetorno;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xObs")
	@XmlElement(name = "xObs", required = false)
	private String xObs;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tMed")
	@XmlElement(name = "tMed", required = false)
	private String tMed;

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

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getDhRetorno() {
		return dhRetorno;
	}

	public void setDhRetorno(String dhRetorno) {
		this.dhRetorno = dhRetorno;
	}

	public String getxObs() {
		return xObs;
	}

	public void setxObs(String xObs) {
		this.xObs = xObs;
	}

	public String gettMed() {
		return tMed;
	}

	public void settMed(String tMed) {
		this.tMed = tMed;
	}

}
