package com.jade.swp;

import static org.assertj.core.api.Assertions.assertThat;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.activation.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwpApplicationTests {
	@Autowired // spring 에 종속적인 친구들은 이거 사용
	private DataSource ds;

	@Test
	public void testDataSource() throws Exception {
		System.out.println("DS=" + ds);

		try (Connection conn = ds.getConnection()) {
			System.out.println("Cooooooooonn=" + conn);
			assertThat(conn).isInstanceOf(Connection.class);

			assertEquals(100, getLong(conn, "select 100"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	} 

	private Object getLong(Connection conn,String sql){
		long result = 0;
		try (Statement stmt = conn.createStatement();){
			ResultSet rs = stmt.executeQuery
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Test
	void contextLoads() {
	}

}
