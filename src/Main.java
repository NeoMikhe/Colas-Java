import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cola colaObjeto = new Cola(100);

        String menu = " ";
		String[] optionsMenu = {"Insertar un dato", "Quitar un dato", "Verificar si esta vacia", "Verificar si esta llena", "Mostrar frente", "Vaciar", "Ver tamano"};
		
		while(menu != "Salir") {
            menu = (String) JOptionPane.showInputDialog(null, "Elige una opcion del menu",
			        "Menu", JOptionPane.QUESTION_MESSAGE, null, optionsMenu, optionsMenu[0]);
			
			if(menu == null)
				menu = "Salir";
			
			switch(menu) {
			
			case "Insertar un dato":
                int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el dato a ingresar a la cola"));
                colaObjeto.push(dato);
				break;
			
			case "Quitar un dato":
                int datoBorrado = colaObjeto.pop();
				if (datoBorrado == 0)
					JOptionPane.showMessageDialog(null, "No se logro borrar ningun dato, porque esta vacia");
                else
                    JOptionPane.showMessageDialog(null, "El dato borrado fue: "+datoBorrado);
				break;
				
			case "Verificar si esta vacia":
                colaObjeto.vacia();
				break;

			case "Verificar si esta llena":
                colaObjeto.llena();
				break;
				
			case "Mostrar frente":
				int frenteCola = colaObjeto.mostrarFrente();
                if (frenteCola == 0)
				JOptionPane.showMessageDialog(null, "No hay ningun dato");
                else
                    JOptionPane.showMessageDialog(null, "El frente de la cola es: "+frenteCola);
				break;
				
			case "Vaciar":
				colaObjeto.vaciar();
				break;
				
			case "Ver tamano":
				JOptionPane.showMessageDialog(null, "El tamano de la cola es: "+colaObjeto.tamano());
				break;
				
			case "Salir": // Mensaje despedida
				System.out.println("Decidiste salir del programa, hasta pronto!.");
				break;
			}
        }
    }
}
