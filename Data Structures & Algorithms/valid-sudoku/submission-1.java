class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set<String> seen = new HashSet<>();

    if(board == null || board.length == 0) return false;

    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;  // skip empty cells
                char val = board[r][c];

                String rowCheck = "row" + r + val;
                if (!seen.add(rowCheck)) return false;

                String colCheck = "col" + c + val;
                if (!seen.add(colCheck)) return false;

                int boxIndex = (r / 3) * 3 + (c / 3);
                String boxCheck = "box" + boxIndex + val;
                if (!seen.add(boxCheck)) return false;
            }
        }
    return true;
    }
}
