package chess.core;

import chess.core.VerktetteListe.Queue;

public class ChessRules
{

    private ChessPiece[][] chessBoard; // the chess board
    private ChessPiece[] deadPieces;
    private int turn; // the current turn
    private int player; // the current player


    public ChessRules(ChessPiece[][] chessBoard)
    {
        this.chessBoard = chessBoard;
        StartPosition();
    }

    public Queue CheckAllMoves(ChessPiece Piece)
    {

        switch (Piece.getChessPieceId())
        {
            case PAWN   -> {return RulesPawn(Piece);}
            case TOWER  -> {return RulesTower(Piece);}
            case BISHOP -> {return RulesBishop(Piece);}
            case HORSE  -> {return RulesHorse(Piece);}
            case KING   -> {return RulesKing(Piece);}
            case QUEEN  -> {return RulesQueen(Piece);}
        }
        return null;
    }

    public Queue RulesPawn(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if(Piece.getPlayerId() == PlayerId.BLACK)
                {

                }
            }
        }
        return possibleMoves;
    }
    public Queue RulesTower(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        possibleMoves.add(new ChessMove(1,1,1,1,true));
        return possibleMoves;
    }

    public Queue RulesBishop(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        return possibleMoves;
    }

    public Queue RulesHorse(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        return possibleMoves;
    }

    public Queue RulesQueen(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        return possibleMoves;
    }
    public Queue RulesKing(ChessPiece Piece)
    {
        Queue possibleMoves = new Queue();
        return possibleMoves;
    }

    public void StartPosition()
    {
        for(int i = 0; i<8; i++)
        {
            for (int j = 0; j <= 7; j++)
            {
                if(i==1 || i == 6)
                {
                    chessBoard[i][j] = new ChessPiece(ChessPieceId.PAWN,i < 2,i);
                }

                else if(i == 0 || i == 7)
                {
                    switch (j) {
                        case 0 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.TOWER,i < 2,i);
                        case 1 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.HORSE,i < 2,i);
                        case 2 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.BISHOP,i < 2,i);
                        case 3 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.QUEEN,i < 2,i);
                        case 4 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.KING,i < 2 ,i);
                        case 5 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.BISHOP,i < 2 ,i);
                        case 6 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.HORSE,i < 2 ,i);
                        case 7 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.TOWER,i < 2 ,i);
                    }

                }
            }



        }

    }
    public boolean setMove(ChessMove setMove)
    {
        return true;
    }
    public ChessPiece[][] getPossibleMoves(int x, int y)
    {
        return chessBoard;
    }
}

