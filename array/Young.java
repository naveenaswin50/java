package array;
public class Young {
    public static void main(String[]as){
    //     Scanner sc=new Scanner (System.in);
    //     int a=sc.nextInt();
    //     if(a<0){
    //         System.out.print("invalid");
    //     }
    //     else{
    //         int arr[]=new int[a];
    //         boolean flag=true;
    //         for(int i=0;i<a;i++){
    //             arr[i]=sc.nextInt();
    //             if(arr[i]<0){
    //                 System.out.println("invalid");
    //                 flag=false;
    //                 break;
    //             }
    //         }
    //         if(flag){
    //         Arrays.sort(arr);
    //     System.out.println(arr[0]+" "+arr[a-1]);
    // }
    //     }
    int arr[][] = new int[4][]; 
		arr[0] = new int[1]; 
		arr[1] = new int[2]; 
		arr[2] = new int[3]; 
		arr[3] = new int[4]; 
        int i, j, k = 0; 
		for (i = 0; i < 4; i++) 
		{ 
			for (j = 0; j < i + 1; j++) 
			{ 
				arr[i][j] = k; 
				k++; 
			} 
		} 
		for (i = 0; i < 4; i++) 
		{ 
			for (j = 0; j < i + 1; j++) 
			{ 
				System.out.print(" " + arr[i][j]); 
				k++; 
			} 
			System.out.println(); 
		} 
        
        
    }
    
}
