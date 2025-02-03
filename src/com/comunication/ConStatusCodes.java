package com.comunication;

public interface ConStatusCodes {

    final String CONNECTION_ESTABLISH = "CONNECTION_ESTABLISH";
    final String CONNECTION_CLOSED = "CONNECTION CLOSED";

    final String PRESENTATION_SUCCES = "PRESENTATION_SUCCES";

    final String ASKING_PERMISSION = "ASKING_PERMISSION";
    final String WAITING_FOR_PERMISSION = "WAITING_FOR_PERMISSION";

    final String START_CHAT = "START_CHAT";

    final String CLIENT_NOT_FOUND = "There is not an ONLINE user with that userID or nickName";
    final String SELF_REFERENCE = "You cannot talk with yourself";

    final String ONLINE = "ONLINE";
    final String OFFLINE = "OFFLINE";
    
}
