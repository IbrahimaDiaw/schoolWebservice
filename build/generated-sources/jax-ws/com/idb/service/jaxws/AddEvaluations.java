
package com.idb.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Evaluations;

@XmlRootElement(name = "addEvaluations", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEvaluations", namespace = "http://service.idb.com/")
public class AddEvaluations {

    @XmlElement(name = "arg0", namespace = "")
    private Evaluations arg0;

    /**
     * 
     * @return
     *     returns Evaluations
     */
    public Evaluations getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Evaluations arg0) {
        this.arg0 = arg0;
    }

}
