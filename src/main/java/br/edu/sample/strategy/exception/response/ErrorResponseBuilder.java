package br.edu.sample.strategy.exception.response;

public final class ErrorResponseBuilder {
    private String error;
    private String description;

    private ErrorResponseBuilder() {
    }

    public static ErrorResponseBuilder builder() {
        return new ErrorResponseBuilder();
    }

    public ErrorResponseBuilder withError(String error) {
        this.error = error;
        return this;
    }

    public ErrorResponseBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ErrorResponse build() {
        return new ErrorResponse(error, description);
    }
}
