
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i=0;
        while(i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while(i < number) {
            System.out.println("");
            i++;
        }
    }

   
    public static void printTriangle(int size)  {
        for(int i=1;i<=size;i++) {
	
            for(int j=0;j<i;j++) {
                System.out.print("*");                 
            }
            System.out.println();
        }             
    
    }


    public static void christmasTree(int height) {
        for(int i=1;i<=height;i++) {

            for(int j=3;j>=i;j--) {
                System.out.print(" ");
            }
	
            for(int s=1;s<=i;s++) {
		System.out.print("*");	
            }       	 
	
            for(int t=2;t<=i;t++) {
		System.out.print("*");	
            }       	 		
		       	 
        System.out.println(); 
        }             
    	
	for(int l=1; l<=2; l++) {
	
            for(int b=1; b<=10/2; b++) {
                System.out.print("");
            }	
		
            for(int u=1;u<=2;u++) {
                System.out.print("*");	
            }     
        System.out.println();     	 
	}
    }

   
    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printStars(6);
        System.out.println("---");
        printSpaces(4);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
       
    }
}
