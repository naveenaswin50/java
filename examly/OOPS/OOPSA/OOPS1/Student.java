package examly.OOPS.OOPSA.OOPS1;

import java.util.Scanner;
public class Student{
    int roll;
    int m1;
    int m2;
    int m3;
    Student(int roll,int m1,int m2,int m3){
        this.m1=m1;
        this.roll=roll;
        this.m2=m2;
        this.m3=m3;
    }
    static int tot(Student x){
        return x.m1+x.m2+x.m3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] arr=new Student[n];
        for(int i=0;i<n;i++){
            int roll=sc.nextInt();
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            arr[i]=new Student(roll, m1, m2, m3);
        }
        int hr=0;int hm=0;
        for(int i=0;i<n;i++){
            int x=tot(arr[i]);
            System.out.println(x);
            if(x>hm){
                hm=x;
                hr=arr[i].roll;
            }
        }
        int m1h=0,m2h=0,m3h=0,m1hr=0,m2hr=0,m3hr=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(arr[j].m1>m1h){
                    m1h=arr[j].m1;
                    m1hr=arr[j].roll;
                }
                if(arr[j].m2>m2h){
                    m2h=arr[j].m2;
                    m2hr=arr[j].roll;
                }
                if(arr[j].m3>m3h){
                    m3h=arr[j].m3;
                    m3hr=arr[j].roll;
                }
            }
        }
        System.out.println(m1hr+" "+m1h);
        System.out.println(m2hr+" "+m2h);
        System.out.println(m3hr+" "+m3h);
        System.out.println(hr+" "+hm);
        sc.close();
    }
}