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
	//Prueba no necesaria para constructores 
	public void testEmployee() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Worker);
		assertNotNull(e);
	}

	@Test
	public void testCs() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Worker); //Caso de prueba para calcular salario de un worker
		assertEquals(450,e.cs(),0.001);
	}
	
	@Test
	public void testCs2() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Supervisor);//Caso de prueba para calcular salario de un supervisor
		assertEquals(451,e.cs(),0.001);
	}
	
	@Test
	public void testCs3() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager
		assertEquals(451,e.cs(),0.001);
	}
	
	@Test
	public void testCs4() {
		Employee e=new Employee(386,"Euro",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un worker que su moneda es euro
		assertEquals(451,e.cs(),0.001);
	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
