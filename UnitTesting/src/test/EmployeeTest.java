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
	public void testCsWorker() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Worker); //Caso de prueba para calcular salario de un worker
		assertEquals(450.333,e.cs(),0.001);
	}
	
	@Test
	public void testCsSupervisor() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Supervisor);//Caso de prueba para calcular salario de un supervisor
		assertEquals(455.583,e.cs(),0.001);
	}
	
	@Test
	public void testCsManager() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager
		assertEquals(460.833,e.cs(),0.001);
	}
	
	@Test
	public void testCsWorkerEuro() {
		Employee e=new Employee(386,"EUR",15,EmployeeType.Worker);//Caso de prueba para calcular salario de un worker que su moneda es euro
		assertEquals(431.033,e.cs(),0.001);
	}
	
	@Test
	public void testCsSupervisorLibra() {
		Employee e=new Employee(386,"Euro",15,EmployeeType.Supervisor);//Caso de prueba para calcular salario de un supervisor que su moneda es libra
		assertEquals(436.283,e.cs(),0.001);
	}
	@Test
	public void testCsManagerSoles() {
		Employee e=new Employee(386,"Euro",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager que su moneda es soles
		assertEquals(441.533,e.cs(),0.001);
	}
	

	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Worker);
		assertEquals(386.0,e.CalculateYearBonus(),0.001);
	}

	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Supervisor);
		assertEquals(579.0,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Manager);
		assertEquals(772.0,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"EUR",15,EmployeeType.Worker);
		assertEquals(386.0,e.CalculateYearBonus(),0.001);
	}

	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"EUR",15,EmployeeType.Supervisor);
		assertEquals(559.7,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"EUR",15,EmployeeType.Manager);
		assertEquals(752.7,e.CalculateYearBonus(),0.001);
	}
	

}
