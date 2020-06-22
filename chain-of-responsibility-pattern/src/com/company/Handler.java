package com.company;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HTTPRequest request) {
        if(doHandle(request))
            return;
        if(next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HTTPRequest request);

}
