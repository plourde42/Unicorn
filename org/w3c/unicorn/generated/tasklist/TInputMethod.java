//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.0-b52-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2006.06.29 at 06:09:33 PM CEST
//

package org.w3c.unicorn.generated.tasklist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * <p>
 * Java class for tInputMethod.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name=&quot;tInputMethod&quot;&gt;
 *   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;&gt;
 *     &lt;enumeration value=&quot;file&quot;/&gt;
 *     &lt;enumeration value=&quot;direct&quot;/&gt;
 *     &lt;enumeration value=&quot;uri&quot;/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlEnum
public enum TInputMethod {

	@XmlEnumValue("direct")
	DIRECT("direct"), @XmlEnumValue("file")
	FILE("file"), @XmlEnumValue("uri")
	URI("uri");
	private final String value;

	TInputMethod(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static TInputMethod fromValue(String v) {
		for (TInputMethod c : TInputMethod.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v.toString());
	}

}
