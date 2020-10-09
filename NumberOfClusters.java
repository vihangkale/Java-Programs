class Solution {
	int getNumberOfClusters(int arr[][]) {
		int count = 0;
		for(int i=0; i<arr.length; i++)      	//iterate through rows
		for(int j=0; j<arr[i].length; j++) {	//iterate through columns
			if(arr[i][j] == '1')
			count += 1;
			callBFS(arr , i, j);
		}      
		return;
	}
}

