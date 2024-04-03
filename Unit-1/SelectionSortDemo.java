public class SelectionSortDemo {
    public static void main(String[] args) {
        int [] temp ={23,6,9,78,56,43,23,1,89,4,34};
        for(int i = 0 ; i < temp.length ;i++){
            int currentMin = temp [i];
            int currentMinIndex = i;
            for(int j = i + 1 ; j < temp.length ; j++){
                if(currentMin > temp [j]){
                    currentMin = temp [j];
                    currentMinIndex = j ;
                }
            }
            if(currentMinIndex != i){
                temp [currentMinIndex] = temp[i];
                temp [i] = currentMin;
            }
        }
        for(int i=0;i<temp.length;i++)
        System.out.println(temp[i]);
    }    
}
