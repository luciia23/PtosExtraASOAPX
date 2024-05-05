package com.bbva.wikj.lib.r001.impl;

import com.bbva.wikj.dto.customer.InDTO;
import com.bbva.wikj.dto.customer.OutDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR001Impl class...
 */
public class WIKJR001Impl extends WIKJR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR001Impl.class);

	@Override
	public int executeInsert(InDTO inDTO) {
		Map<String, Object> args = new HashMap<>();
		args.put("id", inDTO.getId());
		args.put("date_param", inDTO.getDate());
		return this.jdbcUtils.update("query.insert", args);
	}
	
	@Override
	public OutDTO executeSelect() {
		Map<String, Object> result = this.jdbcUtils.queryForMap("query.select");
		OutDTO outDTO = new OutDTO();
		outDTO.setId(String.valueOf(result.get("id")));
		outDTO.setDate(String.valueOf(result.get("date_param")));
		return outDTO;
	}
}
