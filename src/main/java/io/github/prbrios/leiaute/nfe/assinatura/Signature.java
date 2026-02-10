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
package io.github.prbrios.leiaute.nfe.assinatura;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(
		name = "Signature",
		namespace = "http://www.w3.org/2000/09/xmldsig#"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class Signature {
	
	@XmlAttribute(name = "Id", required = false)
	private String id;
	
    @XmlElement(name = "SignedInfo")
    private SignedInfo signedInfo;

    @XmlElement(name = "SignatureValue")
    private String signatureValue;

    @XmlElement(name = "KeyInfo")
    private KeyInfo keyInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SignedInfo getSignedInfo() {
		return signedInfo;
	}

	public void setSignedInfo(SignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return signatureValue;
	}

	public void setSignatureValue(String signatureValue) {
		this.signatureValue = signatureValue;
	}

	public KeyInfo getKeyInfo() {
		return keyInfo;
	}

	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}

}