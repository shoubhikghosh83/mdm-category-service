package com.tcs.ahold.mdm.categoryservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.tcs.ahold.mdm.categoryservice.model.Category;

@Repository
public class CategoryRepository {
	
	private static final String CATEGORY_FIND_BY_ID = "SELECT * FROM CATEGORY WHERE CATEGORY_ID = :id";
	private static final BeanPropertyRowMapper<Category> ROW_MAPPER = new BeanPropertyRowMapper<>(Category.class);
	@Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
	
	public Category findById(String id) {
        try {
            final SqlParameterSource paramSource = new MapSqlParameterSource("id", id);
            return jdbcTemplate.queryForObject(CATEGORY_FIND_BY_ID, paramSource, ROW_MAPPER);
        }
        catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

}
