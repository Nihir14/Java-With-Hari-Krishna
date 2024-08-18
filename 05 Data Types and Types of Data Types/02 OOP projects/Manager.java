class  Manager
{
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount();
		
		BankAccount b2 = new BankAccount();


		b1.bankName     =  "State Bank Of India";  
		b1.branchName   =  "Chichli";
		b1.ifsc         =  "ui34r24";
		b1.accountNo    =  2325453464L;
		b1.accHName     =  "Nihir Vemra";
		b1.balance      =  784562.00;
		b1.mobNo[0]     =  8934737578L;
		b1.mobNo[1]     =  4878465764L;
		
		
		b2.bankName     =  "State Bank Of India";  
		b2.branchName   =  "Chichli";
		b2.ifsc         =  "ui34r24";
		b2.accountNo    =  2325453464L;
		b2.accHName     =  "Nishika Verma";
		b2.balance      =  784562.00;
		b2.mobNo[0]     =  8934737578L;
		b2.mobNo[1]     =  4878465764L;
		
		
		System.out.println("\n BankAccount 1\n");
		
		System.out.println(b1.bankName  );
	    System.out.println(b1.branchName);
		System.out.println(b1.ifsc      );
		System.out.println(b1.accountNo );
		System.out.println(b1.accHName  );
		System.out.println(b1.balance   );
		System.out.println(b1.mobNo[0]  );
        System.out.println(b1.mobNo[1]  );
		
		System.out.println("\n BankAccount 2\n");
		
		System.out.println(b2.bankName  );
		System.out.println(b2.branchName);
		System.out.println(b2.ifsc      );		
		System.out.println(b2.accountNo );
		System.out.println(b2.accHName  );
		System.out.println(b2.balance   );
		System.out.println(b2.mobNo[0]  );
		System.out.println(b2.mobNo[1]  );
										  

		
		
	}
}
