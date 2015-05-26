package demo;

public class MessagePrinter implements Printer {

		public void printMessage(String message){
			System.out.println("\t $" + message  +"");
		}
}
