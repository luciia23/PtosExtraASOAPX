package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.customer.InDTO;
import com.bbva.wikj.dto.customer.OutDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT00101ESTransaction extends AbstractTransaction {

	public AbstractWIKJT00101ESTransaction(){
	}


	/**
	 * Return value for input parameter inDTO
	 */
	protected InDTO getIndto(){
		return (InDTO)this.getParameter("inDTO");
	}

	/**
	 * Set value for OutDTO output parameter outDTO
	 */
	protected void setOutdto(final OutDTO field){
		this.addParameter("outDTO", field);
	}
}
