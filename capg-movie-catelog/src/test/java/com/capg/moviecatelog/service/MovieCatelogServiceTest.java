package com.capg.moviecatelog.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.moviecatelog.model.MovieCatelog;
import com.capg.moviecatelog.repo.MovieCatelogRepo;

@SpringBootTest
class MovieCatelogServiceTest {

	@Autowired
	private MovieCatelogRepo repo;
	//MovieCatelog catelog=new MovieCatelog(5001L, "KGF");
	
	@BeforeEach
	public void setUp() {
		System.out.println("Capg - Tset Started");
	}
	

	@Test
	void testGetMovieCatelog() {
		if(repo.existsById(1001L)) {
		MovieCatelog catelog=repo.getOne(1001L);
		//System.out.println(catelog);
		assertNotNull(catelog);
		}
		
	}

//	@Test
//	void testGetAllMovieCatelog() {
//		
//	}

//	@Test
//	void testAddMovieCatelog() {
//		MovieCatelog catelog=new MovieCatelog(4001L, "Bahubali");
//		assertTrue(repo.existsById(catelog.getId()));
//		
//	}
//	
	@AfterEach
	void cleanUp() throws Exception {
		
		System.out.println("Capg - Test Completed..");
		
	}

}
