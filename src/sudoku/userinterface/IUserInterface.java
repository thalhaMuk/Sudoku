package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

public interface IUserInterface {
    interface EventListener {
        // Using the parent as a name space, a way to differentiate different interfaces.
        void onSudokuInput(int x, int y, int input);
        void onDialogClick ();
    }
    interface view{
        void setListener(IUserInterface.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame sudokuGame);
        void showDialog(String message);
        void showError(String message);
    }
}
