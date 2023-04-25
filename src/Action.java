public enum Action {
    PRESENT(0),
    GET_USER(1),
    GET_ONLINE_USERS(2),
    GET_OFFLINE_USERS(3),
    GET_ALL_USERS(4),
    START_CHAT(5),
    INIT_CHAT(6),
    START_DIRECT(7),
    INIT_DIRECT(8),
    REQ_PERMISION(9);

    Action(int code) {
    }
}
