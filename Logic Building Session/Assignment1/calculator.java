class Ope{
	public static void main(String[]args){
		int a=7;
		int r=0;
		int c;
		int cal=2;
		switch(cal){
			case 1:
			c=a+r;
			System.out.println(c);
			break;
			case 2:
			c=a-r;;
			System.out.println(c);
			break;
			case 3:
		     c=a*r;
			System.out.println(c);
			break;
			case 4:
			c=(int)(a/r);
			if(r==0){
			System.out.println("Error");
				
			}
			System.out.println(c);
			break;
			default:
			System.out.println("Invalid input");
		}
	}

}