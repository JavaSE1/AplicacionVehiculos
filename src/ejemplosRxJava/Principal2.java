package ejemplosRxJava;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Notification;
import rx.Observable;
import rx.functions.Action1;

public class Principal2 {

	public static void main(String[] args) throws InterruptedException {

//		/*
//		 * Es igual que la "Forma 2" del ejemplo de abajo
//		 */
//		
//		Observable<Long> observable1 = Observable.interval(500, TimeUnit.MILLISECONDS).take(10);
//		Observable<Long> observable2 = Observable.interval(200, TimeUnit.MILLISECONDS).take(10);
//
////		//Forma 1: Con LAMBDA
////		Observable.merge(observable1, observable2).subscribe(timer1-> System.out.println(timer1));
//		
////		//Forma 2: Con MMRR		
////		Observable.merge(observable1, observable2).subscribe(System.out::println);
//		
//		//Forma 2: Con clase anonima		
//		Observable.merge(observable1, observable2).subscribe(new Action1<Long>() {
//
//			@Override
//			public void call(Long arg0) {
//				System.out.println(arg0);
//			}
//		});
//
//		Thread.sleep(10000);
//		System.out.println("FIN");

		/******************************************************/
		
		//FORMA 1
		//Definiendo una forma diferente de "lanzar" los datos
		//Pero siempre se necesita el "subscribe", aunque no definamos ningún "suscriptor"
		//El resultado será el mismo si usamos MERGE o si ponemos 2 "subscribe", ya que ninguno de los 2 hace nada
		
		Observable<Long> observable1 = Observable
							.interval(500, TimeUnit.MILLISECONDS)
							.take(10)
							.doOnEach( x -> System.out.println("A:" + x.getValue()))
							;
		Observable<Long> observable2 = Observable
							.interval(200, TimeUnit.MILLISECONDS)
							.take(20)
							.doOnEach( x -> System.out.println("              B:" + x.getValue()))
							;

//		//Con MERGE y un solo "subscribe"
		Observable.merge(observable1, observable2).subscribe();
		
//		//Sin MERGE y con 2 "subscribe"	(identico resultado)	
//		observable1.subscribe();
//		observable2.subscribe();

		Thread.sleep(6000);
		System.out.println("FIN");
		
		/******************************************************/
		
//		//FORMA 2		
//		Observable<Long> observable1 = Observable
//							.interval(500, TimeUnit.MILLISECONDS)
//							.take(10)
//							;
//		Observable<Long> observable2 = Observable
//							.interval(200, TimeUnit.MILLISECONDS)
//							.take(20)
//							;
//
//		//Con MERGE y un solo SUSCRIPTOR (en este caso, los resultados no son identicos, pq aqui los
//		//suscriptores si que hacen el trabajo de imprimir los datos)
//		Observable.merge(observable1, observable2).subscribe(System.out::println);
//		
////		//Sin MERGE y con 2 SUSCRIPTORES		
////		observable1.subscribe(x -> System.out.println("A:" + x.byteValue()));
////		observable2.subscribe(x -> System.out.println("              B:" + x.byteValue()));
//
//		Thread.sleep(6000);
//		System.out.println("FIN");		
		
	}

}