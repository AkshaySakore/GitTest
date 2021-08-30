package Day3;

public class Primeno {

	public static void main(String[] args) {
		int pno;
		int n=1;
		int count;
		while(n<=50)
		{
			count=0;
			pno=2;
			while(pno<=n/2)
			{
				if(n%pno==0)
				{
					count++;
					break;
				}
				pno++;
			}
			if(count==0 && n!=1)
			{
				System.out.println(n+" ");
			}
			n++;
		}

	}

}
