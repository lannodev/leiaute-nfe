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
import io.github.lannodev.leiaute.nfe.classes.retorno.RetEnviNFeProtNFe;
import jakarta.xml.bind.annotation.*;

@JsonRootName("nfeproc")
@XmlRootElement(
        name = "nfeProc",
        namespace = "http://www.portalfiscal.inf.br/nfe"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeProc extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @XmlAttribute(name = "versao")
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfe")
    @XmlElement(name = "NFe")
    private NFe NFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("protnfe")
    @XmlElement(name = "protNFe")
    private RetEnviNFeProtNFe protNFe;

    public NFeProc() {}

    public NFeProc(String versao, NFe nfe, RetEnviNFeProtNFe protNFe) {
        this.versao = versao;
        this.NFe = nfe;
        this.protNFe = protNFe;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public NFe getNFe() {
		return NFe;
	}

	public void setNFe(NFe nFe) {
		NFe = nFe;
	}

	public RetEnviNFeProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(RetEnviNFeProtNFe protNFe) {
		this.protNFe = protNFe;
	}

}
