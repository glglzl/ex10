package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		//ghghghg
		assertEquals(30,Calc.sum(10, 20));
		assertEquals(50,Calc.sum(25, 25));
		assertEquals(3,Calc.sum(1, 2));
	}

}
