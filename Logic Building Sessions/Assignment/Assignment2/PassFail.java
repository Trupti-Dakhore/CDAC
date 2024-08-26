class PassFail{
	public static void main(String[] args){
		
		int sub1=50,sub2=60,sub3=10,count_f =0;
		//check for sub1
		if(sub1>40)
		{
			//check for sub1
			if(sub2 >40)
			{
				//check for sub1
				if(sub3 > 40){
			System.out.println("Student is pass");
						}
			}
		}
		//check count of failed subjects
		if(sub1<=40){
		count_f++;;
		}
		if(sub2<=40){
		count_f++;;
		}
		if(sub3<=40){
		count_f++;;
		}
		
		System.out.println("Student failed in "+count_f+" sub");
		}
}
		
