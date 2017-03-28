package Task2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by sodobescu on 3/28/2017.
 */
public class Array2D {

	int row;
	int col;
	int[][] grid;

	public Array2D(int row, int col) {
		this.row = row;
		this.col = col;
		grid = new int[row][col];

		Set<Integer> mySet = new HashSet<>();

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {
				boolean flag = true;
				while (flag) {
					int temp = randInt(1, row * col);
					if (!mySet.contains(temp)) {
						grid[i][j] = temp;
						mySet.add(temp);
						flag = false;
					}
				}
			}

		}
	}

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public void printArray() {
		System.out.println("Array printing begins");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(this.grid[i][j] + " ");
			}
			System.out.println();
		}


	}

}
