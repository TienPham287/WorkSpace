package _8;

public class GameUtils {
/*
 * n - 1
 * n---
 * n disk 
 * n=1 di chuyen dia n, A => C
 * n=2 di chuyen dia n-1 A => B
 *     di chuyên n A => C(cot A het dia)
 *     di chuyen n-1, B => C
 */
	public static String gameHanoiTower(int n, String beginColumName, String middleColumname, String endColumName) {
		if (n ==1 ) {
			return "move from" + beginColumName + "to" + endColumName;
		}else {
			return
					gameHanoiTower(n-1, beginColumName, endColumName ,middleColumname)+ "\n"// RECURSIVE END SWAP MID
					+ ("move from" +beginColumName + "to" + endColumName)+ "\n"           // PRINT BEIGN AND END
					+ gameHanoiTower(n-1, middleColumname, beginColumName, endColumName);// RECURSIVE MID SWAP BEGIN
			
					
		}
		
		/*
		 * n = 1; A => C
		 * n = 2;
		 * step1: gameHanoiTower(2-1, A , C, B); REC1
		 * SYS A sang C
		 * gameHanoitower(2-1, B, A, C); REC 2
		 * REC 1
		 * gameHanoitower(2-1, A, C, B); A sang B
		 * REC 2
		 * gameHanoitower(2-1,B ,A, C); B sang C
		 * A => B
		 * A => C
		 * B => C
		 * ----------------------------------
		 * n=3;
		 *  step1: gameHanoiTower(3-1, A , C, B); REC1
		 * SYS A sang C
		 * gameHanoitower(3-1, B, A, C); REC 2
		 * 
		 * 
		 * REC 1.....gameHanoitower(2, A, C, B); 
		 * step2: 
		 * gameHanoitower(1, A, B, C); ..........SWAP MID <=> END  A SANG C
		 * sys A SANG B----------------- PRINT BEIGN AND END
		 * gameHanoitower(2-1, C, A, B); ..........SWAP MID <=> BEGIN   C SANG B
		 * REC 2
		 * gameHanoitower(2,B ,A, C);
		 * STEP3:
		 *  gameHanoitower(1, B, C, A); ..........SWAP MID <=> END......> B SANG A
		 *  SYS B SANG C _--------------PRINT BEGIN AND END
		 *  gameHanoitower(1, A, B, C);---------- SWAP MID <=> BEGIN----->> A SANG C
		 */
		
	}
	public static void main(String[] args) {
		System.out.println("number of move: "+( Math.pow(2, 2) -1));
		System.out.println(GameUtils.gameHanoiTower(2, "A", "B", "C"));
	    System.out.println("Number of move:" + (Math.pow(2, 3)-1));
	   System.out.println(GameUtils.gameHanoiTower(3, "A", "B", "C"));
	    
	}
}
