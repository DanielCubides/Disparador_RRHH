/**
 * TipoEmpleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package co.edu.unal.interoperabilidad.ws.schemas.terceros;

/**
 * TipoEmpleado bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class TipoEmpleado extends co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTercero implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * tipoEmpleado Namespace URI =
	 * http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros Namespace Prefix
	 * = ns1
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 264713715809304752L;
	/**
	 * field for TipoTerceroSequence This was an Array!
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[] localTipoTerceroSequence;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence
	 *         []
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[] getTipoTerceroSequence() {
		return localTipoTerceroSequence;
	}

	/**
	 * validate the array for TipoTerceroSequence
	 */
	protected void validateTipoTerceroSequence(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[] param) {

		if ((param != null) && (param.length < 1)) {
			throw new java.lang.RuntimeException();
		}

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            TipoTerceroSequence
	 */
	public void setTipoTerceroSequence(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[] param) {

		validateTipoTerceroSequence(param);

		this.localTipoTerceroSequence = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            co.edu.unal.interoperabilidad.ws.schemas.terceros.
	 *            TipoTerceroSequence
	 */
	public void addTipoTerceroSequence(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence param) {
		if (localTipoTerceroSequence == null) {
			localTipoTerceroSequence = new co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[] {};
		}

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localTipoTerceroSequence);
		list.add(param);
		this.localTipoTerceroSequence = (co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[]) list
				.toArray(new co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[list.size()]);

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

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":tipoEmpleado", xmlWriter);
		} else {
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoEmpleado", xmlWriter);
		}

		if (localInfoBasicaTercero == null) {
			throw new org.apache.axis2.databinding.ADBException("infoBasicaTercero cannot be null!!");
		}
		localInfoBasicaTercero.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoBasicaTercero"), xmlWriter);

		if (localInfoContacto == null) {
			throw new org.apache.axis2.databinding.ADBException("infoContacto cannot be null!!");
		}
		localInfoContacto.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoContacto"), xmlWriter);
		if (localInfoTributariaTracker) {
			if (localInfoTributaria == null) {
				throw new org.apache.axis2.databinding.ADBException("infoTributaria cannot be null!!");
			}
			localInfoTributaria.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoTributaria"), xmlWriter);
		}

		if (localTipoTerceroSequence != null) {
			for (int i = 0; i < localTipoTerceroSequence.length; i++) {
				if (localTipoTerceroSequence[i] != null) {
					localTipoTerceroSequence[i].serialize(null, xmlWriter);
				} else {

					throw new org.apache.axis2.databinding.ADBException("tipoTerceroSequence cannot be null!!");

				}

			}
		} else {
			throw new org.apache.axis2.databinding.ADBException("tipoTerceroSequence cannot be null!!");
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

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
		attribList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "tipoEmpleado"));

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoBasicaTercero"));

		if (localInfoBasicaTercero == null) {
			throw new org.apache.axis2.databinding.ADBException("infoBasicaTercero cannot be null!!");
		}
		elementList.add(localInfoBasicaTercero);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoContacto"));

		if (localInfoContacto == null) {
			throw new org.apache.axis2.databinding.ADBException("infoContacto cannot be null!!");
		}
		elementList.add(localInfoContacto);
		if (localInfoTributariaTracker) {
			elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoTributaria"));

			if (localInfoTributaria == null) {
				throw new org.apache.axis2.databinding.ADBException("infoTributaria cannot be null!!");
			}
			elementList.add(localInfoTributaria);
		}
		if (localTipoTerceroSequence != null) {
			for (int i = 0; i < localTipoTerceroSequence.length; i++) {

				if (localTipoTerceroSequence[i] != null) {
					elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "tipoTerceroSequence"));
					elementList.add(localTipoTerceroSequence[i]);
				} else {

					throw new org.apache.axis2.databinding.ADBException("tipoTerceroSequence cannot be null !!");

				}

			}
		} else {

			throw new org.apache.axis2.databinding.ADBException("tipoTerceroSequence cannot be null!!");

		}

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
		public static TipoEmpleado parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TipoEmpleado object = new TipoEmpleado();

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

						if (!"tipoEmpleado".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (TipoEmpleado) co.edu.unal.interoperabilidad.ws.gestionempleado.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list4 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoBasicaTercero").equals(reader.getName())) {

					object.setInfoBasicaTercero(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoBasicaPersonal.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoContacto").equals(reader.getName())) {

					object.setInfoContacto(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoContacto.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "infoTributaria").equals(reader.getName())) {

					object.setInfoTributaria(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoTributariaTercero.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()) {

					// Process the array and step past its final element's end.
					list4.add(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence.Factory.parse(reader));
					// loop until we find a start element that is not part of
					// this array
					boolean loopDone4 = false;
					while (!loopDone4) {

						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone4 = true;
						} else {
							list4.add(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence.Factory.parse(reader));
						}
					}
					// call the converter utility to convert and set the array
					object.setTipoTerceroSequence((co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
							co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence.class, list4));

				} // End of if for expected property start element

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
