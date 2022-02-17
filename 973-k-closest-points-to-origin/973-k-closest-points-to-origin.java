class Solution {
    public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<pair> hp = new PriorityQueue<>((a, b) -> Double.compare(b.dis, a.dis));

		for (int i = 0; i < points.length; i++) {
			double dis = findDistance(points[i]);
			if (hp.size() < k) {
				hp.add(new pair(dis, points[i][0], points[i][1]));
			} else {
				if (dis < hp.peek().dis) {
					hp.poll();
					hp.add(new pair(dis, points[i][0], points[i][1]));
				}
			}
		}

		int[][] res = new int[k][2];
		int idx = 0;
		while (!hp.isEmpty()) {
			pair p = hp.poll();
			res[idx++] = new int[] { p.a, p.b };
		}
		return res;
	}

	class pair {
		double dis;
		int a;
		int b;

		pair(double d, int a, int b) {
			this.dis = d;
			this.a = a;
			this.b = b;
		}

		// public double compare(double x, double y) {
		// 	return y - x;
		// }

	}

	public double findDistance(int[] arr) {
		int a = arr[0];
		int b = arr[1];

		a = a * a;
		b = b * b;
		int res = a + b;

		return Math.sqrt(res);
	}
}