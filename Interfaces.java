package OopsAlpha;
public class Interfaces {
    public static void main(String args[]) {

        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();
        Rook r = new Rook();
        r.moves();
    }
}

interface chesPlayer{
    void moves();
}

class Queen implements chesPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (all 4th direction )");
    }
}

class Rook implements chesPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chesPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}