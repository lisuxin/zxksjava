package org.example.rlsb_zxks.main;

public class Rseult<T> {
    private Integer code;
    private String message;
    private T date;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public Rseult(Integer code, String message, T date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }
    public Rseult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
