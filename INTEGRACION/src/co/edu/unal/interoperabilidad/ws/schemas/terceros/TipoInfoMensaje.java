/**
 * TipoInfoMensaje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package co.edu.unal.interoperabilidad.ws.schemas.terceros;

/**
 * TipoInfoMensaje bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class TipoInfoMensaje implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * tipoInfoMensaje Namespace URI =
	 * http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros Namespace Prefix
	 * = ns1
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1681527819304449243L;
	/**
	 * field for IdSistema
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema localIdSistema;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema getIdSistema() {
		return localIdSistema;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IdSistema
	 */
	public void setIdSistema(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema param) {

		this.localIdSistema = param;

	}

	/**
	 * field for IdSede
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede localIdSede;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede getIdSede() {
		return localIdSede;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IdSede
	 */
	public void setIdSede(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede param) {

		this.localIdSede = param;

	}

	/**
	 * field for FechaHora
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora localFechaHora;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora getFechaHora() {
		return localFechaHora;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FechaHora
	 */
	public void setFechaHora(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora param) {

		this.localFechaHora = param;

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
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":tipoInfoMensaje", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoInfoMensaje", xmlWriter);
			}

		}

		if (localIdSistema == null) {
			throw new org.apache.axis2.databinding.ADBException("idSistema cannot be null!!");
		}
		localIdSistema.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSistema"), xmlWriter);

		if (localIdSede == null) {
			throw new org.apache.axis2.databinding.ADBException("idSede cannot be null!!");
		}
		localIdSede.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSede"), xmlWriter);

		if (localFechaHora == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaHora cannot be null!!");
		}
		localFechaHora.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaHora"), xmlWriter);

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

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSistema"));

		if (localIdSistema == null) {
			throw new org.apache.axis2.databinding.ADBException("idSistema cannot be null!!");
		}
		elementList.add(localIdSistema);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSede"));

		if (localIdSede == null) {
			throw new org.apache.axis2.databinding.ADBException("idSede cannot be null!!");
		}
		elementList.add(localIdSede);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaHora"));

		if (localFechaHora == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaHora cannot be null!!");
		}
		elementList.add(localFechaHora);

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
		public static TipoInfoMensaje parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TipoInfoMensaje object = new TipoInfoMensaje();

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

						if (!"tipoInfoMensaje".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (TipoInfoMensaje) co.edu.unal.interoperabilidad.ws.gestionempleado.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSistema").equals(reader.getName())) {

					object.setIdSistema(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "idSede").equals(reader.getName())) {

					object.setIdSede(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaHora").equals(reader.getName())) {

					object.setFechaHora(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora.Factory.parse(reader));

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
