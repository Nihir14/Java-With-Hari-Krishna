class College 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		s1.sno    =   101;
		s1.sname  =   "Hari";
		s1.course =   "CJ";
		s1.fee    =   3500;
		
		s2.sno    =   101;
		s2.sname  =   "Ballaya";
		s2.course =   "Acting";
		s2.fee    =   4500;
	
		
		System.out.println("\ns1 object values : \n");
		
		System.out.println("s1.sno\t " + s1.sno);
		System.out.println("s1.sname\t " + s1.sname);
		System.out.println("s1.course\t " + s1.course);
		System.out.println("s1.fee\t " + s1.fee);
		
		
		System.out.println("\ns2 object values : \n");

		System.out.println("s2.sno\t " + s2.sno);
		System.out.println("s2.sname\t " + s2.sname);
		System.out.println("s2.course\t " + s2.course);
		System.out.println("s2.fee\t " + s2.fee);

		
	}
}
