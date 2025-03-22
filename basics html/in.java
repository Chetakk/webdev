import java.io.*;
import java.util.*;
public class in
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nodes=sc.nextInt();
		int edges=sc.nextInt();
		int[] arr1=new int[edges];
		int[] arr2=new int[edges];
		int[] dist=new int[nodes];
		for(int i=0;i<edges;i++){
		    arr1[i]=sc.nextInt();
		    arr2[i]=sc.nextInt();
		}
		for(int i=0;i<nodes;i++){
		    for(int j=0;j<edges;j++){
		        if(arr2[j]==i){
		            dist[i]++;
		        }
		    }
		}
		int n=nodes;
		while(n>0){
		    for(int i=0;i<nodes;i++){
		        if(dist[i]==0){
		            System.out.print(i+" ");
		            dist[i]=99999;
		            for(int j=0;j<edges;j++){
		               if(arr1[j]==i){
		                   dist[arr2[j]]--;
		               } 
		            }
		            n--;
		        }
		    }
		}
	}
}
