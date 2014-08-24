package org.tmsoft.crmproject.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.crmproject.entity.TaskEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})
public class TaskRepositoryTest {

	@Autowired
	TaskRepository taskRepository;

	@Test
	public void testGetAll() throws Exception {
		List<TaskEntity> result = taskRepository.findAll();

		assertNotNull(result);

	}
}