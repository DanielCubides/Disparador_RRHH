/**
 * TipoTipoTercero.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package co.edu.unal.interoperabilidad.ws.schemas.terceros;

/**
 * TipoTipoTercero bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class TipoTipoTercero implements org.apache.axis2.databinding.ADBBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3609890106556003327L;

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "tipoTipoTercero", "ns1");

	/**
	 * field for TipoTipoTercero
	 */

	protected java.lang.String localTipoTipoTercero;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected TipoTipoTercero(java.lang.String value, boolean isRegisterValue) {
		localTipoTipoTercero = value;
		if (isRegisterValue) {

			_table_.put(localTipoTipoTercero, this);

		}

	}

	public static final java.lang.String _SE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SE");

	public static final java.lang.String _DI = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DI");

	public static final java.lang.String _IG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IG");

	public static final java.lang.String _AX = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AX");

	public static final java.lang.String _EM = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("EM");

	public static final java.lang.String _PR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PR");

	public static final java.lang.String _BC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BC");

	public static final java.lang.String _BA = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BA");

	public static final java.lang.String _AV = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AV");

	public static final java.lang.String _GO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GO");

	public static final java.lang.String _TR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TR");

	public static final java.lang.String _IN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IN");

	public static final java.lang.String _UT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UT");

	public static final java.lang.String _AD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AD");

	public static final java.lang.String _AS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AS");

	public static final java.lang.String _UN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UN");

	public static final java.lang.String _ES = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ES");

	public static final java.lang.String _OT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OT");

	public static final java.lang.String _BG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BG");

	public static final java.lang.String _CT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CT");

	public static final java.lang.String _AF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AF");

	public static final java.lang.String _CP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CP");

	public static final java.lang.String _CD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CD");

	public static final java.lang.String _AP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AP");

	public static final java.lang.String _AL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AL");

	public static final java.lang.String _IV = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IV");

	public static final java.lang.String _CC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CC");

	public static final java.lang.String _FS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FS");

	public static final java.lang.String _FP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FP");

	public static final java.lang.String _FC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FC");

	public static final java.lang.String _UP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UP");

	public static final java.lang.String _SP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SP");

	public static final java.lang.String _RK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RK");

	public static final java.lang.String _DN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DN");

	public static final java.lang.String _EX = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("EX");

	public static final java.lang.String _CN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CN");

	public static final java.lang.String _TB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TB");

	public static final java.lang.String _TV = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TV");

	public static final java.lang.String _OI = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OI");

	public static final TipoTipoTercero SE = new TipoTipoTercero(_SE, true);

	public static final TipoTipoTercero DI = new TipoTipoTercero(_DI, true);

	public static final TipoTipoTercero IG = new TipoTipoTercero(_IG, true);

	public static final TipoTipoTercero AX = new TipoTipoTercero(_AX, true);

	public static final TipoTipoTercero EM = new TipoTipoTercero(_EM, true);

	public static final TipoTipoTercero PR = new TipoTipoTercero(_PR, true);

	public static final TipoTipoTercero BC = new TipoTipoTercero(_BC, true);

	public static final TipoTipoTercero BA = new TipoTipoTercero(_BA, true);

	public static final TipoTipoTercero AV = new TipoTipoTercero(_AV, true);

	public static final TipoTipoTercero GO = new TipoTipoTercero(_GO, true);

	public static final TipoTipoTercero TR = new TipoTipoTercero(_TR, true);

	public static final TipoTipoTercero IN = new TipoTipoTercero(_IN, true);

	public static final TipoTipoTercero UT = new TipoTipoTercero(_UT, true);

	public static final TipoTipoTercero AD = new TipoTipoTercero(_AD, true);

	public static final TipoTipoTercero AS = new TipoTipoTercero(_AS, true);

	public static final TipoTipoTercero UN = new TipoTipoTercero(_UN, true);

	public static final TipoTipoTercero ES = new TipoTipoTercero(_ES, true);

	public static final TipoTipoTercero OT = new TipoTipoTercero(_OT, true);

	public static final TipoTipoTercero BG = new TipoTipoTercero(_BG, true);

	public static final TipoTipoTercero CT = new TipoTipoTercero(_CT, true);

	public static final TipoTipoTercero AF = new TipoTipoTercero(_AF, true);

	public static final TipoTipoTercero CP = new TipoTipoTercero(_CP, true);

	public static final TipoTipoTercero CD = new TipoTipoTercero(_CD, true);

	public static final TipoTipoTercero AP = new TipoTipoTercero(_AP, true);

	public static final TipoTipoTercero AL = new TipoTipoTercero(_AL, true);

	public static final TipoTipoTercero IV = new TipoTipoTercero(_IV, true);

	public static final TipoTipoTercero CC = new TipoTipoTercero(_CC, true);

	public static final TipoTipoTercero FS = new TipoTipoTercero(_FS, true);

	public static final TipoTipoTercero FP = new TipoTipoTercero(_FP, true);

	public static final TipoTipoTercero FC = new TipoTipoTercero(_FC, true);

	public static final TipoTipoTercero UP = new TipoTipoTercero(_UP, true);

	public static final TipoTipoTercero SP = new TipoTipoTercero(_SP, true);

	public static final TipoTipoTercero RK = new TipoTipoTercero(_RK, true);

	public static final TipoTipoTercero DN = new TipoTipoTercero(_DN, true);

	public static final TipoTipoTercero EX = new TipoTipoTercero(_EX, true);

	public static final TipoTipoTercero CN = new TipoTipoTercero(_CN, true);

	public static final TipoTipoTercero TB = new TipoTipoTercero(_TB, true);

	public static final TipoTipoTercero TV = new TipoTipoTercero(_TV, true);

	public static final TipoTipoTercero OI = new TipoTipoTercero(_OI, true);

	public java.lang.String getValue() {
		return localTipoTipoTercero;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localTipoTipoTercero.toString();

	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it

		java.lang.String namespace = parentQName.getNamespaceURI();
		java.lang.String _localName = parentQName.getLocalPart();

		writeStartElement(null, namespace, _localName, xmlWriter);

		// add the type details if this is used in a simple type
		if (serializeType) {
			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":tipoTipoTercero", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoTipoTercero", xmlWriter);
			}
		}

		if (localTipoTipoTercero == null) {

			throw new org.apache.axis2.databinding.ADBException("tipoTipoTercero cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localTipoTipoTercero);

		}

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 * 
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it
		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME, new java.lang.Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoTipoTercero) }, null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static TipoTipoTercero fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
			TipoTipoTercero enumeration = (TipoTipoTercero)

			_table_.get(value);

			if ((enumeration == null) && !((value == null) || (value.equals("")))) {
				throw new java.lang.IllegalArgumentException();
			}
			return enumeration;
		}

		public static TipoTipoTercero fromString(java.lang.String value, java.lang.String namespaceURI) throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static TipoTipoTercero fromString(javax.xml.stream.XMLStreamReader xmlStreamReader, java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
				return TipoTipoTercero.Factory.fromString(content, namespaceUri);
			} else {
				return TipoTipoTercero.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static TipoTipoTercero parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TipoTipoTercero object = null;
			// initialize a hash map to keep values
			java.util.Map attributeMap = new java.util.HashMap();
			java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement() || reader.hasText()) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException("The element: " + "tipoTipoTercero" + "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						if (content.indexOf(":") > 0) {
							// this seems to be a Qname so find the namespace
							// and send
							prefix = content.substring(0, content.indexOf(":"));
							namespaceuri = reader.getNamespaceURI(prefix);
							object = TipoTipoTercero.Factory.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = TipoTipoTercero.Factory.fromString(content, "");
						}

					} else {
						reader.next();
					}
				} // end of while loop

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
