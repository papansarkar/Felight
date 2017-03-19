/*
PRINT THE MULTIPLES OF 3 FROM 300 DOWN TO 3.
*/
class MultipleOfThree{
	public static void main(String[] papan) {
		int from=300,to=3;
		int count;
		int counter=0;
		for ( count=from; count>=to ; count-- ) {
			if(count%3==0){//checking number is divisible by 3 or not
				counter++;//counting number of dividents
				System.out.print(count+"  ");
			}
		}
		System.out.println("\nThe Total number of dividents : " + counter);
	}
}
/*

D:\Felight\Basic Java>javac MultipleOfThree.java

D:\Felight\Basic Java>java MultipleOfThree
300  297  294  291  288  285  282  279  276  273  270  267  264  261  258  255  252  249
246  243  240  237  234  231  228  225  222  219  216  213  210  207  204  201  198  195
192  189  186  183  180  177  174  171  168  165  162  159  156  153  150  147  144  141
138  135  132  129  126  123  120  117  114  111  108  105  102  99  96  93  90  87  84  8
1  78  75  72  69  66  63  60  57  54  51  48  45  42  39  36  33  30  27  24  21  18  15
 12  9  6  3
The Total number of dividents : 100

*/