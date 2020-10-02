package br.gov.sp.fatec.springbootapp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringBootAppApplicationTests {

    @BeforeAll
    static void init(@Autowired JdbcTemplate jdbcTemplate) {
        jdbcTemplate.update("insert into usr_usuario (usr_nome, usr_senha) values (?, ?)",
                            "professor", "pass123");
        jdbcTemplate.update("insert aut_autorizacao (aut_nome) values (?)",
                            "ROLE_USUARIO");
        jdbcTemplate.update("insert into atu_atuacao (usr_id, aut_id) values (?, ?)",
                            1L, 1L);
    }

	@Test
	void contextLoads() {
	}

}
