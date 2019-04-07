import java.util.Observable;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable myObservable = Observable.create(new Observable.OnSubscribe<>() {
			public void call(Subscriber<? super String> sub) {
				sub.onNext("Hello World!");
				sb.onCompleted();
			}
		});
	}

}
