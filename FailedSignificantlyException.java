/*I found this after trying to debugging my silly error via copilot and stackoverflow then some blog in this github
from my understanding, Unchecked exceptions do not require explicit handling with try-catch or throws declaration.
btw, extending RuntimeException, this exception can be thrown and caught like any other, but callers are not forced to catch or declare it.*/

public class FailedSignificantlyException extends RuntimeException { 
// The constructor passes the error message to the superclass so it can be retrieved later.
    public FailedSignificantlyException(String message) { //detected the error message describing the failure.
        super(message); //// call RuntimeException constructor with the error message
    }
}

