package io.github.lannodev.leiaute.nfe.classes.evento.retorno;

import io.github.lannodev.leiaute.nfe.Base;
import io.github.lannodev.leiaute.nfe.assinatura.Signature;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "retEvento")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetEnvEventoRetEvento extends Base {

	@XmlAttribute(name = "versao")
    private String versao = "1.00";

    @XmlElement(name = "infEvento")
    private RetEnvEventoRetEventoInfEvento infEvento;

    @XmlElement(name = "Signature")
    private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetEnvEventoRetEventoInfEvento getInfEvento() {
		return infEvento;
	}

	public void setInfEvento(RetEnvEventoRetEventoInfEvento infEvento) {
		this.infEvento = infEvento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
