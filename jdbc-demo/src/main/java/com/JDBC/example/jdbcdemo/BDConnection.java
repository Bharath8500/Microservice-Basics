package com.JDBC.example.jdbcdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BDConnection {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void retriveBookDetails() {
		List<Book> list = jdbcTemplate.query("select * from BookDetails", new BeanPropertyRowMapper<>(Book.class));
		System.out.println(list.toString());
	}

	public void createBookDeatail(String bCode, String bName, float bPrice, int bQty) {
		int k = jdbcTemplate.update("insert into BookDetails values(?,?,?,?)", bCode, bName, bPrice, bQty);
		if (k > 0) {
			System.out.println("Book Details are inserted successfully");
		}
	}

	public void deleteBookdetails(String bCode) {
		int k = jdbcTemplate.update("delete from BookDetails where bCode=?", bCode);
		if (k > 0) {
			System.out.println("Succefully Deleted");
		}

	}

	public void updateBookDetails(String bCode) {
		int k = jdbcTemplate.update("update BookDetails set bName='Spring' where bCode=?", bCode);
		if (k > 0) {
			System.out.println("Book Details are updated successfully");
		}
	}

}
