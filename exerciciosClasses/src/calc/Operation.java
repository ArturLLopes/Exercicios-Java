package calc;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public enum Operation {
    SUM(n -> LongStream.of(n).reduce(0, Long::sum), "+"),
    SUBTRACTION(n -> LongStream.of(n).reduce(0,(n1,n2) -> n1 - n2), "-");



    private final Calc operationCallback;

    public String getSignal() {
        return signal;
    }

    private final String signal;

    Operation(Calc operationCallback, String signal) {
        this.operationCallback = operationCallback;
        this.signal = signal;
    }

    public Calc getOperationCallback() {
        return operationCallback;
     }

}
