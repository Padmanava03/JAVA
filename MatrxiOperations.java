public class Exp3 {

	static void disp(int x[][]) {
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void MatMul(int x[][], int y[][]) {
		int z[][] = new int [x.length][y[0].length];
		for(int i=0; i<x.length; i++) {
			for(int j=0;j<y[i].length; j++) {
				z[i][j]=0;
				for(int k=0;k<y.length;k++) {
					z[i][j]+=x[i][k]*y[k][j];
				}
			}
		}
		System.out.println("Multiplication of two matrices is:");
		disp(z);
	}
	
	static void MatAdd(int x[][], int y[][]) {
		int z[][] = new int [x.length][x[0].length];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.println("Addition of two matrices is:");
		disp(z);
	}
	
	static void MatSub(int x[][], int y[][]) {
		int z[][] = new int [x.length][x[0].length];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j]=x[i][j]-y[i][j];
			}
		}
		System.out.println("Subtraction of two matrices is:");
		disp(z);
	}
	
	public static void main(String[] args) {
		int A[][] = {{3,34,5},{6,7,23},{98,65,7}};
		int B[][] = {{49,3,58},{69,23,33},{1,-45,9}};
		MatMul(A,B);
		MatAdd(A,B);
		MatSub(A,B);
	}

}
