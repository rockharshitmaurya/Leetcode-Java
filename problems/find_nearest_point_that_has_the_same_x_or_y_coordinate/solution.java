class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
   int min = Integer.MAX_VALUE, ans = -1, idx = -1;
	for (int[] point : points) {
		idx++;
		if (point[0] == x || point[1] == y) {
			int dist = distance(x, y, point[0], point[1]);
			if (dist < min) {
				min = dist;
				ans = idx;
			}
		}
	}

	return ans;
}

// O(1)
public int distance(int x1, int y1, int x2, int y2) {
	return Math.abs(x1 - x2) + Math.abs(y1 - y2);
}
}