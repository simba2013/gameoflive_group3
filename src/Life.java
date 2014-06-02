public class Life {
	private int[][] a;

	public Life(int[][] a) {
		this.a = a;
		}

	public int getN(int i, int j) {
		int row = a.length;
		int col = a[0].length;
		int count = 0;

		if (i - 1 >= 0) {
			if (j - 1 >= 0 && a[i - 1][j - 1] == 1) {
				count++;
			}
			if (j < col && a[i - 1][j] == 1) {
				count++;
			}
			if (j + 1 < col && a[i - 1][j + 1] == 1) {
				count++;
			}
		}

		if (j - 1 >= 0 && a[i][j - 1] == 1) {
			count++;
		}
		if (j + 1 < col && a[i][j + 1] == 1) {
			count++;
		}

		if (i + 1 < row) {
			if (j - 1 >= 0 && a[i + 1][j - 1] == 1) {
				count++;
			}
			if (j < col && a[i + 1][j] == 1) {
				count++;
			}
			if (j + 1 < col && a[i + 1][j + 1] == 1) {
				count++;
			}
		}
		return count;

	}

	public int updateSate(int i, int j,int count) {
		int state = a[i][j];
		if (state == 1 && (count == 2 || count == 3)) {
			return 1;
		}
		if (state == 0 && count == 3)
			return 1;
		return 0;
	}

	public int[][] nextGen() {
		int[][] b = a.clone();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int count = getN(i, j);
				int sate = updateSate(i, j,count);
				b[i][j] = sate;
			}
		}
		return b;
	}
}
