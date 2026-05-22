class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0) return false;

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < board.length ; i++){
            for (int j = 0; j < board.length; j++){

                if (board[i][j] == '.') continue;

                int val = board[i][j];

                String col = "col" + i + val;
                if (!seen.add(col)) return false;

                String row = "row" + j + val;
                if (!seen.add(row)) return false;

                int boxId = (i/3) * 3 + (j/3);
                String box = "box" + boxId + val;

                if (!seen.add(box)) return false;
            }
        }

        return true;

    }
}
