package enumss;

public enum Traficlights {
    RED("stop") ,ORANGE("wait") ,GREEN("strat") ;

    private String action ;
    private Traficlights(String action){
        this.action=action;
    }
}
