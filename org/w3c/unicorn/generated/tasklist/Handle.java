//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.29 at 06:09:33 PM CEST 
//

package org.w3c.unicorn.generated.tasklist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for handle element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name=&quot;handle&quot;&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *         &lt;attribute name=&quot;mimetype&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}anySimpleType&quot; /&gt;
 *         &lt;attribute name=&quot;priority&quot; type=&quot;{http://www.w3.org/unicorn/tasklist}tPriority&quot; default=&quot;medium&quot; /&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "handle")
public class Handle {

	@XmlAttribute(required = true)
	protected String mimetype;

	@XmlAttribute
	protected TPriority priority;

	/**
	 * Gets the value of the mimetype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * Sets the value of the mimetype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMimetype(String value) {
		this.mimetype = value;
	}

	/**
	 * Gets the value of the priority property.
	 * 
	 * @return possible object is {@link TPriority }
	 * 
	 */
	public TPriority getPriority() {
		if (priority == null) {
			return TPriority.MEDIUM;
		} else {
			return priority;
		}
	}

	/**
	 * Sets the value of the priority property.
	 * 
	 * @param value
	 *            allowed object is {@link TPriority }
	 * 
	 */
	public void setPriority(TPriority value) {
		this.priority = value;
	}

}
