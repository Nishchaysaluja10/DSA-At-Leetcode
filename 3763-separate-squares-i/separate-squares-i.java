class Solution {
    public double separateSquares(int[][] squares) {
        // Step 1: Calculate Total Area and Boundaries
        // We use a loop instead of hardcoding [0] and [1] so it works for 3 squares.
        double totalArea = 0;
        double min_y = Double.MAX_VALUE;
        double max_y = Double.MIN_VALUE;

        for (int[] sq : squares) {
            totalArea += (double)sq[2] * sq[2]; // width * width (since it's a square)
            min_y = Math.min(min_y, sq[1]);
            max_y = Math.max(max_y, (double)sq[1] + sq[2]);
        }

        // Step 2: Binary Search (Your existing structure)
        double y = min_y;
        double z = max_y;
        double y1 = y;

        // Loop until precision is met
        while (z - y > 0.00001) {
            y1 = (z + y) / 2.0;
            double ar1 = 0; // Area Below

            // Step 3: Calculate "Area Below y1" for ALL squares
            // This single loop replaces the complex if/else blocks for sorting/overlap.
            for (int[] sq : squares) {
                double bottom = sq[1];
                double top = (double)sq[1] + sq[2];
                double width = sq[2];

                // Math.max(0, ...) ensures we don't add negative area if line is below square
                // Math.min(y1, top) ensures we don't calculate area above the square
                double heightBelowLine = Math.max(0, Math.min(y1, top) - bottom);
                
                ar1 += heightBelowLine * width;
            }

            double ar2 = totalArea - ar1; // Area Above

            // Standard Binary Search Logic
            if (ar2 > ar1) {
                y = y1; // Need more area below, move line Up
            } else {
                z = y1; // Need less area below, move line Down
            }
        }
        
        return y1;
    }
}