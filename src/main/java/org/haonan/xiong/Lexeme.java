package org.haonan.xiong;


public class Lexeme {

    private Object token = new Object();
    private Integer line;
    private String value;

    public Lexeme(Token token, String value, Integer line) {
        setToken(token);
        setValue(value);
        setLine(line);
    }

    public Token getToken() {
        return (Token) token;
    }

    public Object tokenProperty() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public int getLine() {
        return line;
    }

    public Integer lineProperty() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getValue() {
        return value;
    }

    public String valueProperty() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
