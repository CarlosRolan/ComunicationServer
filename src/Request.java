public final class Request {

    private static final long serialVersionUID = 123456789L;

    private String action;
    private String[] parameters;
    private String body;

    public String getAction() {
        return action;
    }

    public String[] getParams() {
        return parameters;
    }

    public String getBody() {
        return body;
    }

    public Request(String act, String[] params) {
        action = act;
        parameters = params;
    }

    public Request(String act, String bodyReq) {
        action = act;
        body = bodyReq;
    }

}
