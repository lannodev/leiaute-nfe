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
import io.github.lannodev.leiaute.nfe.assinatura.Signature;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "evento", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnvEventoEvento extends Base {

	@XmlAttribute(name = "versao")
    private String versao = "1.00";

    @XmlElement(name = "infEvento")
    private EnvEventoEventoInfEvento infEvento;

    @XmlElement(name = "Signature")
    private Signature signature;

    public EnvEventoEvento() {}

    public EnvEventoEvento(String versao, EnvEventoEventoInfEvento infEvento, Signature signature) {
        this.versao = versao;
        this.infEvento = infEvento;
        this.signature = signature;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public EnvEventoEventoInfEvento getInfEvento() {
		return infEvento;
	}

	public void setInfEvento(EnvEventoEventoInfEvento infEvento) {
		this.infEvento = infEvento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
