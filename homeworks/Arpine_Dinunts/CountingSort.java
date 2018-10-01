public class CountingSort {
        public static void main(String args[]){
int [] array1={12,3,2,4,8};
int temp =  array1[0];
	for (int i = 0; i < array1.length; i++)  {
	       	if (temp < array1[i]) {
			temp = array1[i];
		}
	}
int [] array2 = new int[temp+1];
		for  (int j = 0; j < array1.length; j++) {
			array2[array1[j]]+=1;
		}
			for (int k = 0; k < array2.length; k++) {
                        	for  (int p = 0; p < array2[k]; k++) {
					System.out.print(k+" ");
				}
			}
	}
 }

