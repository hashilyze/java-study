package this_is_java.ch15.ex1;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> list;

    public BoardDao(){
        list = new ArrayList<>();

        list.add(new Board("제목1","내용1"));
        list.add(new Board("제목2","내용2"));
        list.add(new Board("제목3","내용3"));
    }

    public List<Board> getBoardList(){
        return list;
    }
}
