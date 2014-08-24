package org.tmsoft.crmproject.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.crmproject.entity.UsersEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})
public class UsersRepositoryTest {

	@Autowired
	UsersRepository usersRepository;

	@Test
	public void testGetAll() throws Exception {
		List<UsersEntity> result = usersRepository.findAll();

		assertNotNull(result);
	}

	@Test
	public void testGetUserByNameAndPass() throws Exception {
		UsersEntity result = usersRepository.getUserByNameAndPasswd("test", "test");

		assertNull(result);

	}
}