package com.bingham.enthuwarestudy;

public class LoopConstructs {

	public static void main(String[] args) {
		
	}
	static class CountingTechnique {
		static void example() {
			int x = 0;
			int y = 0;
			// i<3 will iterate 3 times
			// i<=2 will iterate 3 times
			for (int i = 0; i < 3; i++) {
				System.out.println(++x);
				for (int j = 0; j <= 2; j++) {
					System.out.println(++y);
				}
			}
		}
	}
	static class UsingLabels {
		// labels break outside of themselves, break middle continues in outer;
		static void example() {
			int counter = 0;
			outer: for (int i = 0; i < 3; i++) {
				System.out.println("out: i=" + i);
				middle: for (int j = 0; j < 3; j++) {
					System.out.println("mid: i=" + i + "\tj=" + j);
					inner: for (int k = 0; k < 3; k++) {
						System.out.println("inn: i=" + i + "\tj=" + j + "\tk=" + k);
						if (k - j > 0) {
							System.out.println("break");
							break middle;
						}
						counter++;
						System.out.println("counter=" + counter);
					}

				}

			}
			System.out.println(counter);
		}
	}

	static class NoLabels {
		static void example() {
			int c = 0;
			A: for (int i = 0; i < 2; i++) {
				System.out.println("A: i=" + i);
				B: for (int j = 0; j < 2; j++) {
					System.out.println("B: i=" + i + "\tj=" + j);
					C: for (int k = 0; k < 3; k++) {
						System.out.println("C: i=" + i + "\tj=" + j + "\tk=" + k);
						c++;
						System.out.println("counter=" + c);
						if (k > j)
							break;
					}
				}
			}
			System.out.println(c);
		}
	}

	static class ValidLoop {
		static void example() {
			// can be missing any of the three parts, if accounted for elswhere
			// for (<init>; <condition>; <@after>){ ...code }
			int i = 0;
			for (i = 1; i < 5; i++)
				continue;
			for (i = 0;; i++)
				break;
			for (; i < 5 ? false : true;)
				;
			for (; true;)
				break;

			do {
				break;
			} while (true);
			
			switch (1) {
			default:
				break;
			}
		}
		static void example2() {
			int i = 0, j = 5;
			//having for( ; ; i++) isn't an automatic false, it just expects to handled in the code somewhere
			//never runs the i++, because it never gets to loop
		    lab1 : for( ; ; i++){
		      for( ; ; --j)  if( i >j ) break lab1;
		    }
		    System.out.println(" i = "+i+", j = "+j); //returns i=0, j = -1
		}
	}
}
