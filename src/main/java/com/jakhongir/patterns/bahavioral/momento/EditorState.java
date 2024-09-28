package com.jakhongir.patterns.bahavioral.momento;

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
