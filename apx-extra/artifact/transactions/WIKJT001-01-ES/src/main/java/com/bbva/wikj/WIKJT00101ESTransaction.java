package com.bbva.wikj;

import com.bbva.wikj.dto.customer.InDTO;
import com.bbva.wikj.dto.customer.OutDTO;
import com.bbva.wikj.lib.r001.WIKJR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * trx example
 *
 */
public class WIKJT00101ESTransaction extends AbstractWIKJT00101ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00101ESTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR001 wikjR001 = this.getServiceLibrary(WIKJR001.class);
		InDTO inDTO = this.getIndto();
		int result = wikjR001.executeInsert(inDTO);
		if (result == 0)
			this.setOutdto(null);
		else{
			this.setOutdto(wikjR001.executeSelect());
		}
		
	}

}
