package LinkedList;
public class MyArray {
    //Deletion
    //1. array, a
    //2. index lokasi data yang akan dihapus, k
    //3. index dari data terakhir, j
    //4. b = k;
    //5. a[b] = a[b+1]
    //6. b++
    //7. jika (b<=j) kembali ke langkah 5
    //8. a[j] = 0 atau null
    int[] deleteFromArray(int[] a, int k, int j){
        int b = k;
        do {
            a[b] = a[b+1];
            b++;
        }while(b<=j);
        a[j] = 0;
        return a;
    }
    
    //1. array, a
    //2. kapasitas array, n
    //3. index dari data terakhir, j
    //4. index lokasi penyisipan, k
    //5. nilai dari data yang akan di-insert-kan
    int[] insertToArray(int[] a, int n, int j, int k, int d){
        if (j==(n-1)){
            return a;
        }
        int b = j; //j adalah terakhir
        while (b>=k){ //k index lokasi penyisipan
            a[b+1]=a[b];
            b--;
        }
        a[k] =d;
        return a;
    }
    void cetakArray(int[] a){
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
