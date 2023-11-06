public class Main {
    public static void main(String[] args) {
        int p[] = {4, 12, 6, 14, 8, 9, 11, 7, 10, 2, 13, 15, 5, 3, 1};
        int g[] = {10, 8, 6, 4, 2, 1, 3, 5, 7, 9};
        int h[] = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
        int q[] = {10, 5, 4, 6, 3, 7, 2, 8, 1, 9};
        int[] a = new int[10];
        int n = 0;
        for (int i = 0; i < 10; i++){
            n = (int)(Math.random()*100)%100 + 1;
            a[i] = (int) (n);
//            System.out.print(a[i] + " ");
        }

        selectionSort(a);
//        System.out.println();
//        for (int i = 0; i < 25; i++){
//            System.out.print((int)(Math.random()*1000000) + " ");
//        }


//        for (int i = 0; i < (q.length); i++){
//            System.out.print(rsort2(q)[i] + " ");
//        }


//        bubbleSort(a);
//        
    }

    public static int[] bubbleSort(int[] a){
        int l = a.length;
        boolean e = true;
        int c = 0;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < (l - 1 - c); i++) {
                if (a[i] > a[i + 1]) {
                    e = false;
                    int b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                }
            }
            if (e == true){
                break;
            }
            for (int k = 0; k < l; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
            e = true;
            c++;
        }
        return a;
    }

    public static int[] selectionSort(int[] a){
        int l = a.length;
        int b = 0, c = 0;
        boolean e = true;
        for (int i = 0; i < l; i++){
            for (int j = c; j < l; j++){
                if (i < j && a[i] > a[j]){
                    e = false;
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
            if (e == true){
                break;
            }
            for (int k = 0; k < l; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
            e = true;
            c++;
        }

        return a;
    }

    public static int[] sort2(int[] a){
        int l = a.length;
        int small = 0, large = 0;
        int smallIndex = 0, largeIndex = 0;
        int temp; //temp placeholder
        int loopNum = 0;
        boolean doesntNeedSwap = true;
        for (int i = 0; i < l; i++){
            for (int j = loopNum; j < (l - loopNum); j++){
                if (a[j] < a[smallIndex]){
                    doesntNeedSwap = false;
                    smallIndex = j;
                }
                if (a[j] > a[largeIndex]){
                    doesntNeedSwap = false;
                    largeIndex = j;
                }
            }

            temp = a[loopNum];
            a[loopNum] = a[smallIndex];
            a[smallIndex] = temp;
            smallIndex = 0;

            temp = a[l - loopNum - 1];
            a[l - loopNum - 1] = a[largeIndex];
            a[largeIndex] = temp;
            largeIndex = 0;

            for (int k = 0; k < l; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
            loopNum++;
        }





//        for (int i = loopNum; i < (l - loopNum); i++){
//            if ((l-i-1) < i){
//                break;
//            }
//            System.out.println(loopNum);
//            for (int j = loopNum; j < (l - loopNum); j++){
//                if (a[j] < a[i] && a[j] < a[smallIndex] && j != smallIndex){ // finding smallest
//                    System.out.println( j + " s " + smallIndex);
//                    doesntNeedSwap = false;
//                    small = a[j];
//                    smallIndex = j;
//                }
//                if (a[j] > a[i] && a[j] > a[largeIndex] && j != largeIndex){ // finding largest
//                    System.out.println( j + " L " + largeIndex);
//                    doesntNeedSwap = false;
//                    large = a[j];
//                    largeIndex = j;
//                }
//                if (j != l-1) {
//                    if (a[j] > a[j + 1]) {
//                        doesntNeedSwap = false;
//                    }
//                }
//            }
//            System.out.println(small + " | " + large + " | " + i);
////            System.out.println();
//            temp = a[loopNum];
//            a[loopNum] = a[smallIndex];
//            a[smallIndex] = temp; // swapping smallest
//
//            temp = a[l-loopNum-1];
//            a[l-loopNum-1] = a[largeIndex];
//            a[largeIndex] = temp; // swapping largest
//
//            for (int k = 0; k < l; k++) {
//                System.out.print(a[k] + " ");
//            }
//            System.out.println(doesntNeedSwap);
//            if (doesntNeedSwap == true){
//                break;
//            }
//            System.out.println();
//            doesntNeedSwap = true;
//            smallIndex = 0;
//            largeIndex = 0;
//            loopNum++;
//        }
        return a;
    }

    public static int[] rsort2(int[] a){
        int l = a.length;
//        int small = 0, large = 0;
        int smallIndex = 0, largeIndex = 0;
        int temp; //temp placeholder
        int loopNum = 0;
        int[] b = new int[l - 2];
        int[] c = new int[l];
//        boolean doesntNeedSwap = true;
        for (int i = 0; i < l; i++){
            for (int j = loopNum; j < (l - loopNum); j++){
                if (a[j] < a[smallIndex]){
                    smallIndex = j;
                }
                if (a[j] > a[largeIndex]){
                    largeIndex = j;
                }
            }

            temp = a[loopNum];
            a[loopNum] = a[smallIndex];
            a[smallIndex] = temp;
            smallIndex = 0;

            temp = a[l - loopNum - 1];
            a[l - loopNum - 1] = a[largeIndex];
            a[largeIndex] = temp;
            largeIndex = 0;

            for (int k = 1; k < (l - 1); k++) {
//                System.out.print(a[k] + " ");
                b[k - 1] = a[k];
            }
//            System.out.println();
            loopNum++;
        }
        if (b.length > 1) {
            rsort2(b);
        }
        return a;
    }

}