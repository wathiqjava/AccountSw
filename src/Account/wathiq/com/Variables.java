package Account.wathiq.com;

 abstract class Variables {
	
		int acc_no=123456;  
		String name;  
		float amount;
		float Balance=1520300.5f;
		public int getAcc_no() {
			return acc_no;
		}
		public float getBalance() {
			return Balance;
		}
		public void setBalance(float balance) {
			Balance = balance;
		}
		public void setAcc_no(int acc_no) {
			this.acc_no = acc_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		} 

}
