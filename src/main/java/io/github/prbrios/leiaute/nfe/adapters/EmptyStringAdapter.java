package io.github.prbrios.leiaute.nfe.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class EmptyStringAdapter extends XmlAdapter<String, String> {

    @Override
    public String unmarshal(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        return value;
    }

    @Override
    public String marshal(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return value;
    }
}