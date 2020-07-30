/**
 * WSYuyueServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package register;


/**
 *  WSYuyueServiceMessageReceiverInOut message receiver
 */
public class WSYuyueServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    //
    private static final javax.xml.bind.JAXBContext wsContext;

    static {
        javax.xml.bind.JAXBContext jc;
        jc = null;

        try {
            jc = javax.xml.bind.JAXBContext.newInstance(com.ws.yuyue.service.UpdateOrderInfo.class,
                    com.ws.yuyue.service.UpdateOrderInfoResponse.class,
                    com.ws.yuyue.service.GetDoctorWorkInfo.class,
                    com.ws.yuyue.service.GetDoctorWorkInfoResponse.class,
                    com.ws.yuyue.service.GetYyNo.class,
                    com.ws.yuyue.service.GetYyNoResponse.class,
                    com.ws.yuyue.service.GetDtNoInfo.class,
                    com.ws.yuyue.service.GetDtNoInfoResponse.class,
                    com.ws.yuyue.service.BackNo.class,
                    com.ws.yuyue.service.BackNoResponse.class,
                    com.ws.yuyue.service.GetDoctorInfo.class,
                    com.ws.yuyue.service.GetDoctorInfoResponse.class,
                    com.ws.yuyue.service.GetDepartInfo.class,
                    com.ws.yuyue.service.GetDepartInfoResponse.class,
                    com.ws.yuyue.service.GetGhInfo.class,
                    com.ws.yuyue.service.GetGhInfoResponse.class,
                    com.ws.yuyue.service.GetDepartWorkInfo.class,
                    com.ws.yuyue.service.GetDepartWorkInfoResponse.class);
        } catch (javax.xml.bind.JAXBException ex) {
            System.err.println("Unable to create JAXBContext: " +
                    ex.getMessage());
            ex.printStackTrace(System.err);
            Runtime.getRuntime().exit(-1);
        } finally {
            wsContext = jc;
        }
    }

    public void invokeBusinessLogic(
            org.apache.axis2.context.MessageContext msgContext,
            org.apache.axis2.context.MessageContext newMsgContext)
            throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            WSYuyueServiceSkeleton skel = (WSYuyueServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                    .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("updateOrderInfo".equals(methodName)) {
                    com.ws.yuyue.service.UpdateOrderInfoResponse updateOrderInfoResponse37 =
                            null;
                    com.ws.yuyue.service.UpdateOrderInfo wrappedParam = (com.ws.yuyue.service.UpdateOrderInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.UpdateOrderInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    updateOrderInfoResponse37 = skel.updateOrderInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            updateOrderInfoResponse37, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/",
                                    "updateOrderInfoResponse"));
                } else
                if ("getDoctorWorkInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetDoctorWorkInfoResponse getDoctorWorkInfoResponse39 =
                            null;
                    com.ws.yuyue.service.GetDoctorWorkInfo wrappedParam = (com.ws.yuyue.service.GetDoctorWorkInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetDoctorWorkInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDoctorWorkInfoResponse39 = skel.getDoctorWorkInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDoctorWorkInfoResponse39, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/",
                                    "getDoctorWorkInfoResponse"));
                } else
                if ("getYyNo".equals(methodName)) {
                    com.ws.yuyue.service.GetYyNoResponse getYyNoResponse41 = null;
                    com.ws.yuyue.service.GetYyNo wrappedParam = (com.ws.yuyue.service.GetYyNo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetYyNo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getYyNoResponse41 = skel.getYyNo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getYyNoResponse41, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "getYyNoResponse"));
                } else
                if ("getDtNoInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetDtNoInfoResponse getDtNoInfoResponse43 =
                            null;
                    com.ws.yuyue.service.GetDtNoInfo wrappedParam = (com.ws.yuyue.service.GetDtNoInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetDtNoInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDtNoInfoResponse43 = skel.getDtNoInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDtNoInfoResponse43, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "getDtNoInfoResponse"));
                } else
                if ("backNo".equals(methodName)) {
                    com.ws.yuyue.service.BackNoResponse backNoResponse45 = null;
                    com.ws.yuyue.service.BackNo wrappedParam = (com.ws.yuyue.service.BackNo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.BackNo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    backNoResponse45 = skel.backNo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            backNoResponse45, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "backNoResponse"));
                } else
                if ("getDoctorInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetDoctorInfoResponse getDoctorInfoResponse47 =
                            null;
                    com.ws.yuyue.service.GetDoctorInfo wrappedParam = (com.ws.yuyue.service.GetDoctorInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetDoctorInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDoctorInfoResponse47 = skel.getDoctorInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDoctorInfoResponse47, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "getDoctorInfoResponse"));
                } else
                if ("getDepartInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetDepartInfoResponse getDepartInfoResponse49 =
                            null;
                    com.ws.yuyue.service.GetDepartInfo wrappedParam = (com.ws.yuyue.service.GetDepartInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetDepartInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDepartInfoResponse49 = skel.getDepartInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDepartInfoResponse49, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "getDepartInfoResponse"));
                } else
                if ("getGhInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetGhInfoResponse getGhInfoResponse51 = null;
                    com.ws.yuyue.service.GetGhInfo wrappedParam = (com.ws.yuyue.service.GetGhInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetGhInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getGhInfoResponse51 = skel.getGhInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getGhInfoResponse51, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/", "getGhInfoResponse"));
                } else
                if ("getDepartWorkInfo".equals(methodName)) {
                    com.ws.yuyue.service.GetDepartWorkInfoResponse getDepartWorkInfoResponse53 =
                            null;
                    com.ws.yuyue.service.GetDepartWorkInfo wrappedParam = (com.ws.yuyue.service.GetDepartWorkInfo) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.ws.yuyue.service.GetDepartWorkInfo.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDepartWorkInfoResponse53 = skel.getDepartWorkInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDepartWorkInfoResponse53, false,
                            new javax.xml.namespace.QName(
                                    "http://service.yuyue.ws.com/",
                                    "getDepartWorkInfoResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
        	System.out.println(e.getMessage());
        	log.error(e.getCause());
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.UpdateOrderInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.UpdateOrderInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.UpdateOrderInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.UpdateOrderInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "updateOrderInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "updateOrderInfo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.UpdateOrderInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.UpdateOrderInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.UpdateOrderInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.UpdateOrderInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.UpdateOrderInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "updateOrderInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "updateOrderInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.UpdateOrderInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorWorkInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorWorkInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorWorkInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorWorkInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDoctorWorkInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDoctorWorkInfo",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDoctorWorkInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorWorkInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorWorkInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorWorkInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorWorkInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDoctorWorkInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDoctorWorkInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDoctorWorkInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetYyNo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetYyNo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetYyNo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetYyNo.class,
                    param, marshaller, "http://service.yuyue.ws.com/", "getYyNo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getYyNo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetYyNo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetYyNoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetYyNoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetYyNoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetYyNoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getYyNoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getYyNoResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetYyNoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDtNoInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDtNoInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDtNoInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDtNoInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDtNoInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDtNoInfo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDtNoInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDtNoInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDtNoInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDtNoInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDtNoInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDtNoInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDtNoInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDtNoInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.BackNo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.BackNo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.BackNo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.BackNo.class,
                    param, marshaller, "http://service.yuyue.ws.com/", "backNo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "backNo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.BackNo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.BackNoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.BackNoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.BackNoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.BackNoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "backNoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "backNoResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.BackNoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDoctorInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDoctorInfo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDoctorInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDoctorInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDoctorInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDoctorInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDoctorInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDoctorInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDepartInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDepartInfo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDepartInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDepartInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDepartInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDepartInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetGhInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetGhInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetGhInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetGhInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getGhInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getGhInfo", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetGhInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetGhInfoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetGhInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetGhInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetGhInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getGhInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getGhInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetGhInfoResponse param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartWorkInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartWorkInfo.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartWorkInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartWorkInfo.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDepartWorkInfo");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDepartWorkInfo",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDepartWorkInfo param, boolean optimizeContent,
            javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartWorkInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartWorkInfoResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.ws.yuyue.service.GetDepartWorkInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.ws.yuyue.service.GetDepartWorkInfoResponse.class,
                    param, marshaller, "http://service.yuyue.ws.com/",
                    "getDepartWorkInfoResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://service.yuyue.ws.com/",
                    null);

            return factory.createOMElement(source, "getDepartWorkInfoResponse",
                    namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.ws.yuyue.service.GetDepartWorkInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
                                    java.lang.Class type, java.util.Map extraNamespaces)
            throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(),
                    type).getValue();
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
            org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

    class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
        /**
         * Bound object for output.
         */
        private final Object outObject;

        /**
         * Bound class for output.
         */
        private final Class outClazz;

        /**
         * Marshaller.
         */
        private final javax.xml.bind.Marshaller marshaller;

        /**
         * Namespace
         */
        private String nsuri;

        /**
         * Local name
         */
        private String name;

        /**
         * Constructor from object and marshaller.
         *
         * @param obj
         * @param marshaller
         */
        public JaxbRIDataSource(Class clazz, Object obj,
                                javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
            this.outClazz = clazz;
            this.outObject = obj;
            this.marshaller = marshaller;
            this.nsuri = nsuri;
            this.name = name;
        }

        public void serialize(java.io.OutputStream output,
                              org.apache.axiom.om.OMOutputFormat format)
                throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), output);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                        e);
            }
        }

        public void serialize(java.io.Writer writer,
                              org.apache.axiom.om.OMOutputFormat format)
                throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), writer);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                        e);
            }
        }

        public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), xmlWriter);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                        e);
            }
        }

        public javax.xml.stream.XMLStreamReader getReader()
                throws javax.xml.stream.XMLStreamException {
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), builder);

                return builder.getRootElement().getXMLStreamReader();
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                        e);
            }
        }
    }
} //end of class
