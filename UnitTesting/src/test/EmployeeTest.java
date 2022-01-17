package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.ZoneId;

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
		Employee e=new Employee(386,"USD",15,EmployeeType.Worker); //Caso de prueba para calcular salario de un worker que su moneda es USD
		assertEquals(450.333,e.cs(),0.001);
	}
	
	@Test
	public void testCsSupervisor() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Supervisor);//Caso de prueba para calcular salario de un supervisor que su moneda es USD
		assertEquals(455.583,e.cs(),0.001);
	}
	
	@Test
	public void testCsManager() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager que su moneda es USD
		assertEquals(460.833,e.cs(),0.001);
	}
	
	@Test
	public void testCsWorkerEuro() {
		Employee e=new Employee(386,"EUR",15,EmployeeType.Worker);//Caso de prueba para calcular salario de un worker que su moneda es euro
		assertEquals(431.033,e.cs(),0.001);
	}
	
	@Test
	public void testCsSupervisorLibra() {
		Employee e=new Employee(386,"LB",15,EmployeeType.Supervisor);//Caso de prueba para calcular salario de un supervisor que su moneda es libra
		assertEquals(436.283,e.cs(),0.001);
	}
	@Test
	public void testCsManagerSoles() {
		Employee e=new Employee(386,"SOL",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager que su moneda es soles
		assertEquals(441.533,e.cs(),0.001);
	}
	
	@Test
	public void testCsManagerSolesFecha() {
		
		Employee e=new Employee(386,"SOL",15,EmployeeType.Manager);//Caso de prueba para calcular salario de un manager que su moneda es soles
		assertEquals(4,e.cs(),0.001);
	}
	

	@Test
	public void testCalculateYearBonus() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Worker); //caso de prueba para calcular el bonus anual de un worker con moneda USD
		assertEquals(386.0,e.CalculateYearBonus(),0.001);
	}

	@Test
	public void testCalculateYearBonus2() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Supervisor); //caso de prueba para calcular el bonus anual de un supervisor con moneda USD
		assertEquals(579.0,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus3() {
		Employee e = new Employee(386,"USD",15,EmployeeType.Manager); //caso de prueba para calcular el bonus anual de un manager con moneda USD
		assertEquals(772.0,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus4() {
		Employee e = new Employee(386,"EUR",15,EmployeeType.Worker); //caso de prueba para calcular el bonus anual de un worker con moneda EURO
		assertEquals(386.0,e.CalculateYearBonus(),0.001);
	}

	@Test
	public void testCalculateYearBonus5() {
		Employee e = new Employee(386,"LB",15,EmployeeType.Supervisor); //caso de prueba para calcular el bonus anual de un supervisor con moneda libra
		assertEquals(559.7,e.CalculateYearBonus(),0.001);
	}
	
	@Test
	public void testCalculateYearBonus6() {
		Employee e = new Employee(386,"SOL",15,EmployeeType.Manager); //caso de prueba para calcular el bonus anual de un manager con moneda soles
		assertEquals(752.7,e.CalculateYearBonus(),0.001);
	}
	

}
