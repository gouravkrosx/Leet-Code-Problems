class Solution {
    public int halveArray(int[] nums) {
       		PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

		double sum = 0.0;
		for (int i : nums) {
			pq.add(i * 1.0);
			sum += i;
		}

		double half = sum / 2;
		int op = 0;
		double csum = sum;

		while (sum - csum < half) {
			op++;

			double val = pq.poll();
			csum -= val / 2;
			pq.add(val / 2);
		}

		return op;
    }
}