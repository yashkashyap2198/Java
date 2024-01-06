package lecture7;

public class Break3 {

	public static void main(String[] args) {
		
//		 int i=0;
//		    for(;;)
//		    {
//		        if(i==5)
//		            break;
//		        System.out.print(i);
//		        i++;
//		    }
//		 for(int i=7;i!=0;i--)
//		    {
//		        System.out.print(i--);
//		    }
		
//		for(int i=1;;i++)
//	    {   if(i==5)
//	            break;
//	        System.out.print(i);
//	    }
		
//		for(int i=1;;i++)
//	    {   if(i<5)
//	            System.out.print(i);
//	        else 
//	            break;
//	    }
		
//		for(int i=1;;i++)
//	    {   if(i>5)
//	        {
//	            break;
//	          //  System.out.print("break statement reached");
//	        }
//	        System.out.print(i);
//	    }
		
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		        break;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}
		
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		        continue;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}
		
		int i = 1;
		while(i < 3) {
		    int j = 1;
		    while(j < 5) {
		        if(j == 3) {
		            break;
		        }
		        System.out.print(j + " ");
		        j++;
		    }
		    i++;
		}
	}

}
