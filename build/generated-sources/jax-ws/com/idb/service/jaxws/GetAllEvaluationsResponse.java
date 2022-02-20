
package com.idb.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Evaluations;

@XmlRootElement(name = "getAllEvaluationsResponse", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllEvaluationsResponse", namespace = "http://service.idb.com/")
public class GetAllEvaluationsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Evaluations> _return;

    /**
     * 
     * @return
     *     returns List<Evaluations>
     */
    public List<Evaluations> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Evaluations> _return) {
        this._return = _return;
    }

}
