import java.io.File;
import java.io.IOException;

public class File06 {
public static void main(String[] args) {
	String rutaRelativa = "canciones";
	String rutaAbsolutaChunga = "c:/windows/system32";
	File cancion = new File(rutaRelativa, "Evil.mp3");
	//si el elemento no existe las preguntas sobre los permisos son inutiles
	try {
		new File(rutaRelativa).mkdir();
		cancion.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//antes de preguntarse sobre los derechos de algo hay que preguntarse si ese algo existe
	System.out.println("puede leer "+cancion.canRead());
	System.out.println("puede escribir "+cancion.canWrite());
	System.out.println("puede ejecutar "+cancion.canExecute());
	cancion = new File(rutaAbsolutaChunga, "Evil.mp3");
	if(cancion.exists()) System.out.println("existe");
	System.out.println("puede leer "+cancion.canRead());
	System.out.println("puede escribir "+cancion.canWrite());
	System.out.println("puede ejecutar "+cancion.canExecute());
}
}
