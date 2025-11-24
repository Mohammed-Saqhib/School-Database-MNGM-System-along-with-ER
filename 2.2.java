void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Lab3_BubbleSort ob = new Lab3_BubbleSort();

        int inputArr[]=ob.inputArray();
        ob.bubbleSort(inputArr);
        System.out.println("Sorted array");
        ob.printArray(inputArr);

    }

}