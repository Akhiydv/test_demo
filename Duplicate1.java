public class Duplicate1{
     public static void main(String[] args){
	   int[] a={2,3,1,5,6,9,6};
	    for(int i=0; i<a.length-1;i++){
		  for(int j=1+i;j<a.length;j++){
		     if(a[i]==a[j]&& i!=j){
			  System.out.println(a[j]);
			 }
		  }
		}
	 }
}