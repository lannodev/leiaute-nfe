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
package io.github.lannodev.leiaute.nfe.classes.evento.envio;

import io.github.lannodev.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "infEvento")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnvEventoEventoInfEvento extends Base {

	@XmlAttribute(name = "Id")
    private String id;

    @XmlElement(name = "cOrgao")
    private String cOrgao;

    @XmlElement(name = "tpAmb")
    private String tpAmb;

    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @XmlElement(name = "CPF")
    private String CPF;

    @XmlElement(name = "chNFe")
    private String chNFe;

    @XmlElement(name = "dhEvento")
    private String dhEvento;

    @XmlElement(name = "tpEvento")
    private String tpEvento;

    @XmlElement(name = "nSeqEvento")
    private String nSeqEvento;

    @XmlElement(name = "verEvento")
    private String verEvento = "1.00";

    @XmlElement(name = "detEvento")
    private EnvEventoEventoInfEventoDetEvento detEvento;

    public EnvEventoEventoInfEvento() {}

    public EnvEventoEventoInfEvento(String id, String cOrgao, String tpAmb, String CNPJ, String CPF, String chNFe, String dhEvento, String tpEvento, String nSeqEvento, String verEvento, EnvEventoEventoInfEventoDetEvento detEvento) {
        this.id = id;
        this.cOrgao = cOrgao;
        this.tpAmb = tpAmb;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.chNFe = chNFe;
        this.dhEvento = dhEvento;
        this.tpEvento = tpEvento;
        this.nSeqEvento = nSeqEvento;
        this.verEvento = verEvento;
        this.detEvento = detEvento;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcOrgao() {
		return cOrgao;
	}

	public void setcOrgao(String cOrgao) {
		this.cOrgao = cOrgao;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getDhEvento() {
		return dhEvento;
	}

	public void setDhEvento(String dhEvento) {
		this.dhEvento = dhEvento;
	}

	public String getTpEvento() {
		return tpEvento;
	}

	public void setTpEvento(String tpEvento) {
		this.tpEvento = tpEvento;
	}

	public String getnSeqEvento() {
		return nSeqEvento;
	}

	public void setnSeqEvento(String nSeqEvento) {
		this.nSeqEvento = nSeqEvento;
	}

	public String getVerEvento() {
		return verEvento;
	}

	public void setVerEvento(String verEvento) {
		this.verEvento = verEvento;
	}

	public EnvEventoEventoInfEventoDetEvento getDetEvento() {
		return detEvento;
	}

	public void setDetEvento(EnvEventoEventoInfEventoDetEvento detEvento) {
		this.detEvento = detEvento;
	}
    
    
}
