public interface RequestCodes {
    final String REQ_INFO = "REQ_INFO";
    final String REQ_ERROR = "ERQ_ERROR";


    final String GET_USER_BY_ID = "GET_USER_BY_ID";
    final String GET_USER_BY_NICK = "GET_USER_BY_NICK";
    final String GET_ALL_ONLINE_USERS = "GET_ALL_ONLINE_USERS";

        final String PRESENT = "PRESENTATION";
        final String SHOW_ALL_ONLINE = "SHOW_ALL_ONLINE";
    
        //Single conversation
        final String SINGLE_REQUESTED = "SINGLE_CHAT_REQUESTED";
        final String START_SINGLE = "START_SINGLE";
        final String SEND_DIRECT_MSG = "SEND_DIRECT_MSG";
    
        //Chat codes
        final String NEW_CHAT = "NEW_CHAT";
        final String CHAT_CREATED = "CHAT_CREATED";
        final String CHAT_REQUESTED = "CHAT_REQUESTED";
        final String START_CHAT = "START_CHAT";
        final String TO_CHAT = "TO_CHAT";
        final String ADD_USER_TO_CHAT = "ADD_USER_TO_CHAT";
    
        //Client comfirmation
        final String ALLOW = "ALLOW";
        final String DENY = "DENY";
    
        //Modifiers
        final String BY_ID = "BY_ID";
        final String BY_NICK = "BY_NICK";
    
        final String INFO_PRESENTATION_START = "PRESENTED to the server as ";
        final String INFO_NO_SERVER_RESPONSE = "NO server response";
        final String INFO_WAITING_RESPONSE = "Waiting to server response";
    
        final String INFO_CONECXION_REJECTED = "CONECXION_REJECTED";
        final String INFO_COMFIRMATION_SUCCESS = "OK";
        final String INFO_CONECXION_ACCEPTED = "CONECXION_ACCEPTED";
         
        final String ERROR_PRESENTATION = "Could not present ";
        final String ERROR_SERVER_CONNECTION = "Could not read response from server";
}
