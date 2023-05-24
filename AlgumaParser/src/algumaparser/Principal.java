package algumaparser;


import algumalex.AlgumaLexico;

public class Principal {
    public static void main(String args[]) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        AlgumaParser parser = new AlgumaParser(lex);
        parser.programa();
    }
}