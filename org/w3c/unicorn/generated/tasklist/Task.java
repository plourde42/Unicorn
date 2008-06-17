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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for task element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name=&quot;task&quot;&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref=&quot;{http://www.w3.org/unicorn/tasklist}subtasks&quot;/&gt;
 *           &lt;element ref=&quot;{http://www.w3.org/unicorn/tasklist}parameters&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name=&quot;id&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}anySimpleType&quot; /&gt;
 *         &lt;attribute name=&quot;visible&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;true&quot; /&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subtasks", "parameters" })
@XmlRootElement(name = "task")
public class Task {

	@XmlElement(namespace = "http://www.w3.org/unicorn/tasklist", required = true)
	protected Subtasks subtasks;

	@XmlElement(namespace = "http://www.w3.org/unicorn/tasklist")
	protected Parameters parameters;

	@XmlAttribute(required = true)
	protected String id;

	@XmlAttribute
	protected Boolean visible;

	/**
	 * Gets the value of the subtasks property.
	 * 
	 * @return possible object is {@link Subtasks }
	 * 
	 */
	public Subtasks getSubtasks() {
		return subtasks;
	}

	/**
	 * Sets the value of the subtasks property.
	 * 
	 * @param value
	 *            allowed object is {@link Subtasks }
	 * 
	 */
	public void setSubtasks(Subtasks value) {
		this.subtasks = value;
	}

	/**
	 * Gets the value of the parameters property.
	 * 
	 * @return possible object is {@link Parameters }
	 * 
	 */
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * Sets the value of the parameters property.
	 * 
	 * @param value
	 *            allowed object is {@link Parameters }
	 * 
	 */
	public void setParameters(Parameters value) {
		this.parameters = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the visible property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isVisible() {
		if (visible == null) {
			return true;
		} else {
			return visible;
		}
	}

	/**
	 * Sets the value of the visible property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setVisible(Boolean value) {
		this.visible = value;
	}

}
