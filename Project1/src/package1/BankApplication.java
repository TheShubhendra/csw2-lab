package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class BankAccount{
	private int accno;
	private int balance;
	private String name;
	private int aadhar;
	
	
	public BankAccount(int accno, int balance, String name, int aadhar) {
		this.accno = accno;
		this.balance = balance;
		this.name = name;
	    this.setAadhar(aadhar);
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + ", name=" + name + ", aadhar=" + aadhar + "]";
	}


	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getAadhar() {
		return aadhar;
	}


	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}


	@Override
	public int hashCode() {
		return Objects.hash(aadhar, accno, balance, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return  accno == other.accno && balance == other.balance
				&& Objects.equals(name, other.name);
	}

	
}


public class BankApplication {
	private static List <BankAccount> list = new ArrayList<>();
	
	public static String search_acc(BankAccount acc) {
		return list.contains(acc)? "Found" : "Not Found";
	}
	
	public static void merge_acc() {
		Map<Integer, List<BankAccount>> aadhar_mapping = new HashMap<>();
		for(BankAccount acc: list) {
			if (aadhar_mapping.get(acc.getAadhar())==null) {
				aadhar_mapping.put(acc.getAadhar(), new ArrayList<BankAccount>() );
			}
			aadhar_mapping.get(acc.getAadhar()).add(acc);
			
		}
		
		list.removeAll(list);
		
		for(Entry<Integer, List<BankAccount>> entry :aadhar_mapping.entrySet()) {
			List<BankAccount> aadhar_accounts = entry.getValue();
			BankAccount merged = aadhar_accounts.get(0);
			for (int i=1; i<aadhar_accounts.size(); i++) {
				merged.setBalance(merged.getBalance() + aadhar_accounts.get(i).getBalance());
			}
			list.add(merged);
		}
	}
	
	public static void merge_acc(BankAccount acc) {
		if(!list.contains(acc)) {
			return ;
		}
	    
	    for(BankAccount a: list) {
	    	if(!a.equals(acc) && a.getAadhar()==acc.getAadhar()) {
	    		acc.setBalance(acc.getBalance()+ a.getBalance());
	    		
	    		list.remove(list.indexOf(a));
	    	}
	    }
	}
	// 1, 2, 3, 4, 5, 6, 7, 8
	// 1, 2, 3, 4,5 6, 7

	public static void main(String[] args) {
		list.add( new BankAccount(1, 34324, "A", 1));
		list.add( new BankAccount(2, 3452, "A", 1));
		list.add( new BankAccount(3, 4324, "B", 2));
		list.add( new BankAccount(4, 543, "C", 5));
		list.add( new BankAccount(5, 453, "C", 5));
		for(BankAccount acc: list) {
			System.out.println(acc);
		}
		BankAccount x = new BankAccount(5, 453, "C", 5);
		System.out.println(search_acc(x));
		
		merge_acc(list.get(4));
		
		for(BankAccount acc: list) {
			System.out.println(acc);
		}
		
		
	}

}
