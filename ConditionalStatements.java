import java.util.Scanner;
class ConditionalStatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Given Number is Zero");
        }
        else if (n>0) {
            System.out.println("Given Number is Positive"); 
        }
        else{
            System.out.println("Given Number is Negative");
        }
        int day = n%7;
        switch (day){
            case 0:{System.out.println("Sunday");break;}
            case 1:{System.out.println("Monday");break;}
            case 2:{System.out.println("Tuesday");break;}
            case 3:{System.out.println("Wednesday");break;}
            case 4:{System.out.println("Thursday");break;}
            case 5:{System.out.println("Friday");break;}
            case 6:{System.out.println("Saturday");break;}
            default :
            System.out.println("Given Number is negative Number");
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int i=n;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
        System.out.println();
        i=0;
        do{
            System.out.print("1 2 3"+' ');
            i++;
        }while(i<=n);
    }

}