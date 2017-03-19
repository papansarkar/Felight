class EmptyPyramids{
	public static void main(String[] papan) {
		int row=5;
		int i,j;
		for (i=1 ; i<=row ; i++ ) {
			for (j=i ; j<row ; j++ ) {
				System.out.print(" ");
			}
			for ( j=1 ; j<=(2*i-1) ; j++ ) {
				if(i==row || j==1 || j==(2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
				System.out.println();
		}
	}
}

/*
D:\Felight\Basic Java>javac EmptyPyramids.java

D:\Felight\Basic Java>java EmptyPyramids
    *
   * *
  *   *
 *     *
*********
*/