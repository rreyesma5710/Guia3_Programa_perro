package paquete;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;
import paquete.Perro;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner (System.in);
        
		String nombre;
		String raza;
		String localidad;
		int cedula;
		String nombreDueno;	
		int contacto;
		String diaSemana;
		
		int respuesta;
		
		ArrayList <Perro> lista = new ArrayList<Perro>();

        try{
	        do{
	        System.out.println("�Cual es su nombre?: ");
	        nombre = in.nextLine();
	        System.out.println("¿Cual es su raza: ");
	        raza = in.nextLine();
	        System.out.println("¿Cual es su localidad?: ");
	        localidad = in.nextLine();
	        System.out.println("¿Cual es su cedula?: ");
	        cedula = Integer.parseInt(in.nextLine());
	        System.out.println("¿Cual es el nombre del dueño?: ");
	        nombreDueno = in.nextLine();
	        System.out.println("Numero de contacto: ");
	        contacto = Integer.parseInt(in.nextLine());
	        System.out.println("Dia de la semana de la cita: ");
	        diaSemana = in.nextLine();
	        lista.add(new Perro(nombre,raza,localidad,cedula,nombreDueno,contacto,diaSemana));
	        System.out.println("¿Desea agregar otro perro? SI=1 NO=otro?");
	        //lee como caracter y transforma a entero evita error de salto
	        respuesta = Integer.parseInt(in.nextLine()); 
	        // Esto tambien quitará del buffer el cambio de línea
	        //teclado.nextLine() 
	        }while(respuesta == 1);
        }catch(Exception ex){ // handle your exception

        }
        
        String mensaje;
        for(Perro p : lista){
           mensaje = p.toString();
           System.out.println(mensaje); 
           System.out.println("*********************");           
        }  
        
        
        //Filtrando por localidad
        
        String localidadFilter;		
        respuesta = 1;
        
        System.out.println("¿Deseas filtrar por localidad? SI=1, NO=otro");
        respuesta = Integer.parseInt(in.nextLine());
        while(respuesta == 1){
        	System.out.println("Digita Localidad de filtrado");
        	localidadFilter = in.nextLine();
        	mensaje = filtrado(localidadFilter, lista);	        	
        	System.out.println(mensaje);
	        System.out.println("¿Desea filtrar nuevamente? SI=1 NO=otro?");
	        respuesta = Integer.parseInt(in.nextLine());
	     }
		
	}
	
	public static String filtrado(String localidadFilter, ArrayList <Perro> lista)
	{
    	ArrayList <Perro> listaDos = new ArrayList<Perro>();
    	String mensaje;
    	
    	/*Eliminar elemento del arrayList
    	Iterator<Perro> it = lista.iterator();
    	while (it.hasNext()) {
    	    String current = it.next().getLocalidad();
    	    if (!current.equals(localidadFilter)) {
    	        it.remove();
    	    }
    	}*/
    	
        for(Perro p : lista){
            if(p.getLocalidad().equals(localidadFilter)){
            		listaDos.add(new Perro(
            			p.getNombre(),
            			p.getRaza(),
            			p.getLocalidad(),
            			p.getCedula(),
            			p.getNombreDueno(),
            			p.getContacto(),
            			p.getDiaSemana()
            			));
            }       
         }  
        
    	//System.out.println(listaDos); me muestra una coleccion de objetos
        mensaje = "Lista Filtrada\n";
        for(Perro p : listaDos){
           mensaje = mensaje+""+p.toString()+"\n**************\n";         
        }  	
         
		return mensaje;
		
	}

}
