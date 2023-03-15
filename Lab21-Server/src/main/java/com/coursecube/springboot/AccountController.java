package com.coursecube.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@PostMapping("/addAccount")
	public String addAccount(@RequestBody Account acc) {
	System.out.println("AC-addAccount()");
	accountService.addAccount(acc);
	String msg="Account Added successfully";
	return msg;
	}
	
	@GetMapping("/myaccount/{accno}")
	public Account getAccountByAccno(@PathVariable("accno") int accno) {
	System.out.println("AC-getAccountByAccno()" + accno);
	Account acc= accountService.getAccountByAccno(accno);
	return acc;
	}
	
	@PutMapping("/mydeposit")
	public void deposit(@RequestBody TxInfo txInfo) {
	System.out.println("AC-deposit()");
	accountService.deposit(txInfo);
	}

	@PutMapping("/mywithdraw")
	public void withdraw(@RequestBody TxInfo txInfo) {
	System.out.println("AC-withdraw()");
	accountService.withdraw(txInfo);
	}
	
	@DeleteMapping("/deleteAccount/{accno}")
	public String deleteAccount(@PathVariable int accno) {
	System.out.println("AC-deleteAccount()");
	accountService.deleteAccount(accno);
	String msg="Account Deleted successfully";
	return msg;
	}
	
	@GetMapping("/myaccounts")
	public List<Account> getAllAccounts() {
	System.out.println("AC-getAllAccounts()" );
	List<Account> accList= accountService.getAllAccounts();
	return accList;
	}
	
}
