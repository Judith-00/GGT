class GGT {
	public static void main(String args[]) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		if (m < 0 || n < 0) {
			System.out.println("Nur positive Zahlen erlaubt!");
		} else {

			do {

				if (m < n) {
					int k = n;
					n = m;
					m = k;
				}

				int r = m - n;
				m = n;
				n = r;
			}

			while (n > 0);

			System.out.println("ggT(" + args[0] + "," + args[1] + ") = " + m);
		}
	}
} // Änderung
// 2. Änderung
