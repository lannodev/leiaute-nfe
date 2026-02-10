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
package io.github.lannodev.leiaute.nfe.assinatura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SignedInfo {

    @SuppressWarnings("unused")
	private static final long serialVersionUID = -5878065134465400530L;

    @XmlElement(name = "CanonicalizationMethod")
    private CanonicalizationMethod canonicalizationMethod;

    @XmlElement(name = "SignatureMethod")
    private SignatureMethod signatureMethod;

    @XmlElement(name = "Reference")
    private Reference reference;

    public CanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    public void setCanonicalizationMethod(final CanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public SignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    public void setSignatureMethod(final SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public Reference getReference() {
        return this.reference;
    }

    public void setReference(final Reference reference) {
        this.reference = reference;
    }

}