package lecture7;
import java.util.*;
public class NumberSequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int S=s.nextInt();
        int pre=s.nextInt();
        int i=1;
        boolean isdec=true;
        while(i<=S-1){
            int curr=s.nextInt();
            if (curr==pre){
                System.out.println("false");
                return;

            }else if(curr>pre){
                if (isdec){
                    isdec=false;
                    
                }
            }
            else if (pre>curr){
                if(isdec!=true){
                    System.out.println("false");
                    return;

                }
                
            }
            
            pre=curr;
            i++;
        }
        System.out.println("true");

        
	}

}
