package this_is_java.ch15.ex1;

import java.util.List;

public class ListExample{
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        list.forEach((board) -> System.out.println(board.title() + "-" + board.content()));
    }
}
