package com.guseyn.broken_xml;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class XmlDocument {
    private final int start;
    private final int end;
    private final List<HeadElement> xmlHeads;
    private final List<Comment> comments;
    private final List<Element> roots;

    XmlDocument(final int start, final int end) {
        this.start = start;
        this.end = end;
        this.xmlHeads = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.roots = new ArrayList<>();
    }

    public int start() {
        return this.start;
    }

    public int end() {
        return this.end;
    }

    public List<HeadElement> heads() {
        return this.xmlHeads;
    }

    public List<Comment> comments() {
        return this.comments;
    }

    public List<Element> roots() {
        return this.roots;
    }

    public String json() {
        return String.format(
            "{ \"xmlHeads:\": [ %s ], \"comments:\": [ %s ], \"roots:\": [ %s ], \"start\": %d, \"end\": %d }",
            this.xmlHeads.stream().map(HeadElement::json).collect(Collectors.joining(", ")),
            this.comments.stream().map(Comment::json).collect(Collectors.joining(", ")),
            this.roots.stream().map(Element::json).collect(Collectors.joining(", ")),
            this.start,
            this.end
        );
    }
}
