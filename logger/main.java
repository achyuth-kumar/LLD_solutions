public class Main {
   public static void main(String args[]) {
        LogProcessor logProcessor=new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logProcessor.log(logProcessor.INFO,"print requested information");
        logProcessor.log(logProcessor.DEBUG,"print debugger logs");
        logProcessor.log(logProcessor.ERROR,"print error logs");
    } 
}

