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
package io.github.prbrios.leiaute.nfe.classes.retorno;

import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "retConsReciNFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetConsReciNFe extends Base {

	@XmlAttribute(name = "versao")
	private String versao;
	
	@XmlElement(name = "tpAmb")
	private String tpAmb;
	
	@XmlElement(name = "verAplic")
	private String verAplic;
	
	@XmlElement(name = "nRec")
	private String nRec;
	
	@XmlElement(name = "cStat")
	private String cStat;
	
	@XmlElement(name = "xMotivo")
	private String xMotivo;
	
	@XmlElement(name = "cUF")
	private String cUF;
	
	@XmlElement(name = "dhRecbto")
	private String dhRecbto;
	
	@XmlElement(name = "cMsg")
	private String cMsg;
	
	@XmlElement(name = "xMsg")
	private String xMsg;
	
	@XmlElement(name = "protNFe")
	private List<RetEnviNFeProtNFe> protNFe = new ArrayList<RetEnviNFeProtNFe>();

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

	public String getnRec() {
		return nRec;
	}

	public void setnRec(String nRec) {
		this.nRec = nRec;
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

	public String getcMsg() {
		return cMsg;
	}

	public void setcMsg(String cMsg) {
		this.cMsg = cMsg;
	}

	public String getxMsg() {
		return xMsg;
	}

	public void setxMsg(String xMsg) {
		this.xMsg = xMsg;
	}

	public List<RetEnviNFeProtNFe> getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(List<RetEnviNFeProtNFe> protNFe) {
		this.protNFe = protNFe;
	}
	
}
