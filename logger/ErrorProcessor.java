public class ErrorProcessor extends LogProcessor{
    ErrorProcessor(LogProcessor errorProcessor) {
        super(errorProcessor);
    }
    public void log(int logLevel,String message) {
        if(logLevel==ERROR) {
            System.out.println("Error : "+message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}
