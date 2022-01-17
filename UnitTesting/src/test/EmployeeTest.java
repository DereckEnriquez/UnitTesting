package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmployee() {
		Employee e=new Employee(300,"dollar",15,EmployeeType.Worker);
		assertNotNull(e);
	}

	@Test
	public void testCs() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
