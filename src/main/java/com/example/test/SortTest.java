package com.example.test;

public class SortTest {
    /**
     * 插入排序
     * @param array
     * @return
     */
    private static int[] insertSort(int[] array){
        int length = array.length;
        for(int i = 1;i<length;i++){
            int value = array[i];
            int j = i -1;
            for(;j>0;j--){
                if(array[j]>value){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1]=value;
        }
        return array;
    }

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    private static int[] bubbleSort(int [] array){
        int length = array.length;
        for(int i = 0; i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(array[j+1]< array[j]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    /***
     * 选择排序
     * @param array
     * @return
     */
    private static int [] selectSort(int [] array){
        int length = array.length;
        if (length<1) return array;

        for(int i = 0;i<length;i++){
            int j = i + 1;
            int v = array[i];
            int max = array[i];
            int index = i;
            for(;j<length;j++){
                if(array[j]>max){
                    max = array[j];
                    index = j;
                }
            }
            array[index] = v;
            array[i] = max;
        }
        return array;
    }
    private static void quickSort(int [] arr , int l ,int r ){
        if(l >=r) return ;
        int i = partion(arr , l ,r);
        quickSort(arr,l,i-1);
        quickSort(arr,i+1,r);
    }

    private static int partion(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l;
        int tmp = 0;
        for(int j = l ;j < r;j++){
            if(arr[j]<pivot){
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] =tmp;
                i = i+1;
            }
        }
        tmp = arr[r];
        arr[r] = arr[i];
        arr[i] = tmp;
        return i;
    }

    public static double sqrt(double t, Double precise) {
        double low = 0, high = t, middle, squre,
                prec = precise != null ? precise : 1e-6;
        if ( t < 0 ) {
            throw new RuntimeException("Negetive number cannot have a sqrt root.");
        }

        while ( high - low > prec ) {
            middle = ( low + high ) / 2;
            squre = middle * middle;

            if ( squre > t ) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return ( low + high ) / 2;

    }



    public static void main(String[]args){
        int [] data = {1,2,89,33,2872,71,23,263,1818};
//        int [] dataArray = insertSort(data);
//        int [] dataArray2 = bubbleSort(data);
//        int [] dataArray3 = selectSort(data);

//        for(int i:dataArray){
//            System.out.println(i);
//        }
//
//        System.out.println("--------------");
//        for (int i : dataArray2) {
//            System.out.println(i);
//        }
//        System.out.println("--------------");
//        for (int i : dataArray3) {
//            System.out.println(i);
//        }

//        quickSort(data,0,data.length-1);
//        for (int datum : data) {
//            System.out.println(datum);
//        }
        System.out.println(sqrt(2222.2, null));
        System.out.println(sqrt(2222.2, null)*sqrt(2222.2, null));
    }
}
