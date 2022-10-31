package com.it;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.it.dao.UserDao;
import com.it.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {
	@Autowired
	private UserDao userDao;

	@Test
	void testSave(){
		User user = new User();
		userDao.insert(user);
	}

	@Test
	void deleteById(){
		userDao.deleteById(1586251989084540929l);
	}


	@Test
	void selectByID() {
		userDao.selectList(null);

	}

	@Test
	void testGetPageById(){
		IPage page = new Page(1,2);
		userDao.selectPage(page,null);

	}
}
