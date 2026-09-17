public class bubble{
 public static void main(String[args] array){

	int [] arr = {2,6,7,1,5,3,4};
	
	for(int rep = 0 ; rep<arr.length;rep++){
		for(int i = arr.length - rep -1; i>0;i--){
			if(arr[rep] > arr[rep+1]){
				int temp = arr[rep];
				int arr[rep] = arr[rep+1];
				int arr[rep+1] = temp;
			}
		}
	}
}
}

