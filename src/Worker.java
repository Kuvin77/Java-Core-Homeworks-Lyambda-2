public class Worker {

    private OnTaskDoneListener callBack;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callBack, OnTaskErrorListener errorCallback){
        this.callBack = callBack;
        this.errorCallback = errorCallback;
    }

    public void start(){
        for (int i = 0; i < 100; i++){
            if (i == 33) {
                errorCallback.onError("Task " + i + " ****** ERROR ******");
            } else {
                callBack.onDone("Task " + i + " is done");
            }
        }
    }
}
