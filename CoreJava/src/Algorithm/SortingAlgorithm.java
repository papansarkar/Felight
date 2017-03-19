package Algorithm;

/**
 * Created by PAPAN on 2/20/2017.
 */
public class SortingAlgorithm {

    public static int[] selectionSortInt(int[] A){
        int l=A.length;
        int temp;
        for (int i=0 ; i<l-1 ; i++ ){
            for(int j=i+1; j<l; j++ ){
                if( A[j]<A[i]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        return A;
    }

    public static int[] bubbleSortInt(int[] A){
        int l=A.length;
        int temp;
        for ( int i=0 ; i<l-1 ; i++ ){
            if(A[i]>A[i+1]){
                temp=A[i];
                A[i]=A[i+1];
            }
        }
        return A;
    }
//**
    public static int[] merge(int[] A,int[] right,int[] left){

        int aL=A.length;
        int rL=right.length;
        int lL=left.length;
        int i=0,j=0,k=0;

        while(A[aL-1]!=right[rL-1] || A[aL-1]!=left[lL-1]){
            if(right[i]<=left[j])
                A[k++]=right[i++];
            else if(left[j]<=right[i])
                A[k++]=left[j++];
            else if(i!=rL-1){
                A[k++]=right[i++];
            }else
                A[k++]=left[j++];
        }
        return A;
    }

//**
    public static int[] mergeSortInt(int[] array){

        if(array.length<2){
            int arrayL=array.length;
            int lL=arrayL/2;
            int rl=arrayL-lL;

            int[] left=new int[lL];
            int[] right=new int[rl];

            int k;
            for( k=0 ; k<lL ; k++)
                left[k] = array[k];
            for( k=lL ; k<rl ; k++)
                right[k - lL] = array[k];
            mergeSortInt(left);
            mergeSortInt(right);
            merge(array,left,right);
        }

        return array;
    }


}
