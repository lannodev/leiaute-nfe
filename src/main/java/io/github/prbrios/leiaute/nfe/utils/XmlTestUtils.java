package io.github.prbrios.leiaute.nfe.utils;

public final class XmlTestUtils {

    private XmlTestUtils() {
    }

    public static String normalizeXml(String xml) {
        if (xml == null) {
            return null;
        }

        return xml
                .replaceAll("(<\\/?)ns\\d+:", "$1")
                .replaceAll("\\s+xmlns:ns\\d+=\"[^\"]+\"", "")
                .replaceAll("\\s+xmlns=\"[^\"]+\"", "")
                .replaceAll("\\s+", "")
                .trim();
    }

}

