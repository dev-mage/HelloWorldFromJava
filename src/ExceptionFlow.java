public class ExceptionFlow {
    static void method() throws Exception {
        try {
            throw new CauseException("원인 예외 발생");
        } catch (CauseException ce) {
            ResultException re = new ResultException("예외 발생");
            re.initCause(ce);
            throw re;
        }
    }
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
}