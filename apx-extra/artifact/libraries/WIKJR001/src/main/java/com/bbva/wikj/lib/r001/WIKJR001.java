package com.bbva.wikj.lib.r001;

import com.bbva.wikj.dto.customer.InDTO;
import com.bbva.wikj.dto.customer.OutDTO;

/**
 * The  interface WIKJR001 class...
 */
public interface WIKJR001 {

	int executeInsert(InDTO inDTO);
	OutDTO executeSelect();

}
