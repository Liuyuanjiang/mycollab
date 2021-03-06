package com.mycollab.module.crm.domain;

import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class CallWithBLOBs extends Call {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_call.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_call.result
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    @Length(max=65535, message="Field value is too long")
    @Column("result")
    private String result;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_call.description
     *
     * @return the value of m_crm_call.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_call.description
     *
     * @param description the value for m_crm_call.description
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_call.result
     *
     * @return the value of m_crm_call.result
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_call.result
     *
     * @param result the value for m_crm_call.result
     *
     * @mbg.generated Fri Jun 01 14:16:24 ICT 2018
     */
    public void setResult(String result) {
        this.result = result;
    }

    public enum Field {
        id,
        subject,
        startdate,
        durationinseconds,
        calltype,
        type,
        typeid,
        lastupdatedtime,
        createdtime,
        createduser,
        assignuser,
        contactid,
        saccountid,
        status,
        purpose,
        isclosed,
        description,
        result;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}