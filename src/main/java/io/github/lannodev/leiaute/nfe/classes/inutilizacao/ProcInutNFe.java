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
package io.github.lannodev.leiaute.nfe.classes.inutilizacao;

import io.github.lannodev.leiaute.nfe.Base;
import io.github.lannodev.leiaute.nfe.classes.inutilizacao.envio.InutNFe;
import io.github.lannodev.leiaute.nfe.classes.inutilizacao.retorno.RetInutNFe;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "procInutNFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcInutNFe extends Base {

    @XmlAttribute(name = "versao")
    private String versao;

    @XmlElement(name = "inutNFe")
    private InutNFe inutNFe;

    @XmlElement(name = "retInutNFe")
    private RetInutNFe retInutNFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public InutNFe getInutNFe() {
		return inutNFe;
	}

	public void setInutNFe(InutNFe inutNFe) {
		this.inutNFe = inutNFe;
	}

	public RetInutNFe getRetInutNFe() {
		return retInutNFe;
	}

	public void setRetInutNFe(RetInutNFe retInutNFe) {
		this.retInutNFe = retInutNFe;
	}

}
