package com.guseyn.broken_xml;

public final class Attribute {

    private final String name;
    private final String value;
    private final int nameStart;
    private final int nameEnd;
    private final int valueStart;
    private final int valueEnd;

    Attribute(
        final String name,
        final String value,
        final int nameStart,
        final int nameEnd,
        final int valueStart,
        final int valueEnd
    ) {
        this.name = name;
        this.value = value;
        this.nameStart = nameStart;
        this.nameEnd = nameEnd;
        this.valueStart = valueStart;
        this.valueEnd = valueEnd;
    }

    public String name() {
        return name;
    }

    public String value() {
        return value;
    }

    public int nameStart() {
        return this.nameStart;
    }

    public int nameEnd() {
        return this.nameEnd;
    }

    public int valueStart() {
        return this.valueStart;
    }

    public int valueEnd() {
        return this.valueEnd;
    }

    String json() {
        return String.format(
            "{ \"name\": \"%s\", \"value\": \"%s\", \"nameStart\": %d, \"nameEnd\": %d, \"valueStart\": %d, \"valueEnd\": %d }",
            this.name,
            this.value,
            this.nameStart,
            this.nameEnd,
            this.valueStart,
            this.valueEnd
        );
    }
}
