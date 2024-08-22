class Disc{
public static void main(String[]args){
int pur1=400;
if(pur1>=1000){
	System.out.println("Discount is "+(pur1*0.2));
	}
else if(pur1>=500&&pur1<=999){
	System.out.println("Discount is "+(pur1*0.1));
}
else if(pur1<500){
	System.out.println("Discount is "+(pur1*0.05));
}
}
}