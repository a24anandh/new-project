package ArrayTest;

public class ObjectArrayTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object [] a=new Object[5];
		
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[5]=50;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

}
}