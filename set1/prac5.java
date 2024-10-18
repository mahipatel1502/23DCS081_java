// class prac5 {
//     public static void main(String []args){
//         int[] code={1,2,3,4,5};
//         int[] price={20,40,50,100,200};

//         float tax;

//         for(int i=0 ; i<5 ;i++){

//             tax=0;
//             switch (code[i]){
//                 case 1 : 
//                     tax += price[i] + (price[i]*0.08);
//                     System.out.println("total price :"+ tax);
//                     break;
                

//                 case 2 : 
//                     tax += price[i] + (price[i]*0.12);
//                     System.out.println("total price :"+ tax);
//                     break;
                

//                 case 3 : 
//                     tax += price[i] + (price[i]*0.05);
//                     System.out.println("total price :"+ tax);
//                     break;
                

//                 case 4 : 
//                     tax += price[i] + (price[i]*0.075);
//                     System.out.println("total price :"+ tax);
//                     break;
                

//                 default : 
//                     tax += price[i] + (price[i]*0.03);
//                     System.out.println("total price :"+ tax);
//                     break;
                
//             }
//         }
//  }
// }

import java.util.Scanner;

public class prac5 {
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int code[]={1,2,3,4,5,6};
        double price[]=new double[5];
        double tax,total=0;
        int no;


       do{ 

        System.out.println("1.motor\n2.fan\n3.tube\n4.wires\n5.other items \n6.exit");
         no= sc.nextInt();
          
        
     
        switch(code[no-1])
        {
            case 1:
            {
                System.out.print("Enter Price of motor:");
                price[0]=sc.nextDouble();
                tax=price[0]*(8/100);
                total=total+(price[0]+tax);  
            }
            break;
            case 2:
            {
                System.out.print("Enter Price of fan:");
                price[1]=sc.nextDouble();
                tax=price[1]*(12/100);
                total=total+(price[1]+tax);  
            }
            break;
            case 3:
            {
                System.out.print("Enter Price of tube:");
                price[2]=sc.nextDouble();
                tax=price[2]*(5/100);   
                total=total+(price[2]+tax);
            }
            break;
            case 4:
            {
                System.out.print("Enter Price of wires:");
                 price[3]=sc.nextDouble();
                tax=price[3]*(7.5/100);   
                total=total+(price[3]+tax); 
            }
            break;
            case 5:
            {
                System.out.print("Enter Price of other:");
                price[4]=sc.nextDouble();
                tax=price[4]*(3/100);   
                total=total+(price[4]+tax);
                
            }
            break;

            case 6:{
                
            }
            break;

            default:
            System.out.println("wrong");
            break;
        }

    }while(no!=6);

    System.out.println("TOTAL BILL PRICE:"+total);
    System.out.println("23dcs081 Mahi patel");
}
}