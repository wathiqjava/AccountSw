package Account.wathiq.com;

public class Operations extends Variables {
	

	//Creating multiple objects by one type only


	//where we deposit and withdraw amount from our account.  
	//Creating an Account class which has deposit() and withdraw() methods

	/*
	 * int acc_no; String name; float amount;
	 */
	     //Method to initialize object  
		//	void insert(int a,String n,float amt){  
	/*
	 * setAcc_no(a); setName(n); setAmount(amt);
	 * 
	 * }
	 */  
				void insert(String n,float amt){  
					//setAcc_no(a);  
					setName(n); 
				    setAmount(amt);  
				    
				}  

			//deposit method  ?'\
			float deposit(float amt){ 
				float amttotal=0;
				amttotal=getBalance()+amt;
				setBalance(amttotal);
			//System.out.println(amt+" deposited");
				return getBalance();
			}  
			//withdraw method  
			float withdraw(float amt){  
				float Amttotal=0;
			        if(getBalance() > amt){  
				 Amttotal=getBalance()-amt;
				 setBalance(Amttotal);
				System.out.println(amt+" withdrawn");  
			}  else{  
		    System.out.println("Insufficient Balance"); 	  
		    return 0;
			}  
			return getBalance();
			}  

		    //method to check the balance of the account  
			float checkBalance(){System.out.println("Balance is: "+amount);
			return amount;
			}  
			//method to display the values of an object  
			void display(){System.out.println(acc_no+" "+name+" "+amount);}  
	} 

	//Creating a test class to deposit and withdraw amount  




