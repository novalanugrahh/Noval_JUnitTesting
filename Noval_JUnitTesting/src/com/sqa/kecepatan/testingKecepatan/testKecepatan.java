package com.sqa.kecepatan.testingKecepatan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sqa.kecepatan.main.KecepatanRataRata;

public class testKecepatan {
	KecepatanRataRata kecepatan;

	@Before
	public void setUp() throws Exception {
		kecepatan = new KecepatanRataRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		assertEquals(9, kecepatan.KecepatanRataRata(9.0,0),0.0);
	}

}
