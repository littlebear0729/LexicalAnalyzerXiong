package org.haonan.xiong;

public enum Token {
    IDENTIFIER, KEYWORD, INVALID,
    STRING, INTEGER, FLOAT,
    PLUS, MINUS, TIMES, DIVIDE,
    ASSIGNMENT_OPERATOR, SEMICOLON,
    LEFT_PARENTHESIS, RIGHT_PARENTHESIS, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, DOTDOT, COLON,
    EQUAL, LOWER_OR_EQUALS, GREATER_OR_EQUALS, NOT_EQUALS, GREATER_THAN, LOWER_THAN,
    AT_SIGN
}
