class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);

        int ops = 0;

        while (list.size() > 1) {

            // check AFTER previous merge
            if (isNonDecreasing(list)) {
                break;
            }

            int minSum = Integer.MAX_VALUE;
            int idx = 0;

            // find leftmost minimum adjacent sum
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            // merge
            list.set(idx, minSum);
            list.remove(idx + 1);
            ops++;
        }

        return ops;
    }

    private boolean isNonDecreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}