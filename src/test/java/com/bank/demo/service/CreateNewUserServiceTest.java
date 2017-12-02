/**
 * 
 */
package com.bank.demo.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bank.demo.other.AccountStatus;
import com.bank.demo.other.AccountType;
import com.bank.demo.other.Currency;
import com.bank.demo.vo.Address;
import com.bank.demo.vo.Branch;
import com.bank.demo.vo.User;

/**
 * @author Bala
 *
 */
public class CreateNewUserServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testAddingUser() {
		User user = new User();
		Address address = new Address();
		Branch branch = new Branch();
		UserService userService = new UserServiceImpl();
		
		user.setFirstName("Bala");
		user.setLastName("Thayalan");
		user.setAge(30);
		user.setAddress(address);
		user.setBranch(branch);
		
		user.setBalanceAmount(0.0);
		user.setDepositAmount(100.0);
		user.setCurrency(Currency.INR);
		
		user.setAccountId(1001);
		user.setAccountType(AccountType.SAVINGS);
		user.setAccountStatus(AccountStatus.ACTIVE);
		
		
		user.setMobile(9894795375l);
		user.setEmail("balamurugan.th@gmail.com");
		
		
		assertTrue(userService.addUser(user));
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
