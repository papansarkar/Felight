package TestClass;
import Algorithm.SortingAlgorithm;
/**
 * Created by PAPAN on 2/20/2017.
 */
public class AlgorithmTest {
    public static void main(String[] args){

        int[] A= SortingAlgorithm.selectionSortInt(new int[]{1,2,5,9});
        for(int i=0 ; i<A.length; i++){
            System.out.print(A[i]+"\t");
        }

        System.out.println();
        int[] B= SortingAlgorithm.bubbleSortInt(new int[]{3,4,6,7,8});
        for(int i=0 ; i<B.length; i++){
            System.out.print(A[i]+"\t");
        }

        int[] D=new  int[]{3,4,6,7,8,1,2,5,9};

        System.out.println();
        int[] C= SortingAlgorithm.merge(D,A,B);
        for(int i=0 ; i<C.length; i++){
            System.out.print(C[i]+"\t");
        }

    }

}