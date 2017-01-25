/**
 * TipoNombrePersonaNatural.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package co.edu.unal.interoperabilidad.ws.schemas.terceros;

/**
 * TipoNombrePersonaNatural bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class TipoNombrePersonaNatural implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * tipoNombrePersonaNatural Namespace URI =
	 * http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros Namespace Prefix
	 * = ns1
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119278806809278804L;
	/**
	 * field for PrimerNombre
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre localPrimerNombre;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre getPrimerNombre() {
		return localPrimerNombre;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PrimerNombre
	 */
	public void setPrimerNombre(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre param) {

		this.localPrimerNombre = param;

	}

	/**
	 * field for SegundoNombre
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre localSegundoNombre;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre getSegundoNombre() {
		return localSegundoNombre;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SegundoNombre
	 */
	public void setSegundoNombre(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre param) {

		this.localSegundoNombre = param;

	}

	/**
	 * field for PrimerApellido
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre localPrimerApellido;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre getPrimerApellido() {
		return localPrimerApellido;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PrimerApellido
	 */
	public void setPrimerApellido(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre param) {

		this.localPrimerApellido = param;

	}

	/**
	 * field for SegundoApellido
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido localSegundoApellido;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido getSegundoApellido() {
		return localSegundoApellido;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SegundoApellido
	 */
	public void setSegundoApellido(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido param) {

		this.localSegundoApellido = param;

	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":tipoNombrePersonaNatural", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoNombrePersonaNatural", xmlWriter);
			}

		}

		if (localPrimerNombre == null) {
			throw new org.apache.axis2.databinding.ADBException("primerNombre cannot be null!!");
		}
		localPrimerNombre.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerNombre"), xmlWriter);

		if (localSegundoNombre == null) {
			throw new org.apache.axis2.databinding.ADBException("segundoNombre cannot be null!!");
		}
		localSegundoNombre.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoNombre"), xmlWriter);

		if (localPrimerApellido == null) {
			throw new org.apache.axis2.databinding.ADBException("primerApellido cannot be null!!");
		}
		localPrimerApellido.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerApellido"), xmlWriter);

		if (localSegundoApellido == null) {
			throw new org.apache.axis2.databinding.ADBException("segundoApellido cannot be null!!");
		}
		localSegundoApellido.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoApellido"), xmlWriter);

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

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerNombre"));

		if (localPrimerNombre == null) {
			throw new org.apache.axis2.databinding.ADBException("primerNombre cannot be null!!");
		}
		elementList.add(localPrimerNombre);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoNombre"));

		if (localSegundoNombre == null) {
			throw new org.apache.axis2.databinding.ADBException("segundoNombre cannot be null!!");
		}
		elementList.add(localSegundoNombre);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerApellido"));

		if (localPrimerApellido == null) {
			throw new org.apache.axis2.databinding.ADBException("primerApellido cannot be null!!");
		}
		elementList.add(localPrimerApellido);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoApellido"));

		if (localSegundoApellido == null) {
			throw new org.apache.axis2.databinding.ADBException("segundoApellido cannot be null!!");
		}
		elementList.add(localSegundoApellido);

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

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
		public static TipoNombrePersonaNatural parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TipoNombrePersonaNatural object = new TipoNombrePersonaNatural();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"tipoNombrePersonaNatural".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (TipoNombrePersonaNatural) co.edu.unal.interoperabilidad.ws.gestionempleado.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerNombre").equals(reader.getName())) {

					object.setPrimerNombre(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoNombre").equals(reader.getName())) {

					object.setSegundoNombre(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "primerApellido").equals(reader.getName())) {

					object.setPrimerApellido(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "segundoApellido").equals(reader.getName())) {

					object.setSegundoApellido(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
