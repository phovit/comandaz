package br.com.opasystems.comanda.dto;

public class ErrorResponse {
    private String error;
    private String description;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ErrorResponse(String error, String description) {
        this.error = error;
        this.description = description;
    }
}
