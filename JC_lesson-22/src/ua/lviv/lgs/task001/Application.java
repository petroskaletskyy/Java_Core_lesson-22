package ua.lviv.lgs.task001;

public class Application {

	public static void main(String[] args) {
		
	Pet cat = () -> "�����-�����, � �� -";
	Pet cow = () -> "����-����, � ������ -";
	Pet dog = () -> "�����-�����, � ��� -";
	
	voice(cat.voice(), "Lia");
	voice(cow.voice(), "Bana");
	voice(dog.voice(), "Jack");
	
	}
	
	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name);
	} 
}
