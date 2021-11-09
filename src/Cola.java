public class Cola {
    private int frent, fin, cant;
    private int[] espacio;

    Cola(int tamanoCola){
        frent = 0;
        fin = -1;
        cant = 0;
        espacio = new int[tamanoCola];
    }

    public void push(int dato){
        if (llena()){
            System.out.println("La cola esta llena, no se pueden insertar mas datos");
        } else {
            if (fin+1 >= espacio.length)
                fin = 0;
            else
                fin++;
            espacio[fin] = dato;
            cant++;
            System.out.println("Se inserto el dato en la cola");
        }
    }

    public int pop(){
        int datoExtraido = 0;

        if (vacia()){
            System.out.println("La cola esta vacia, no se puede sacar un dato");
        } else {
            datoExtraido = espacio[frent];
            cant--;
            if (frent+1 >= espacio.length)
                frent = 0;
            else
                frent++;
            System.out.println("Dato extraido de la cola: "+datoExtraido);
        }

        return datoExtraido;
    }

    public boolean vacia(){
        if (cant == 0){
            System.out.println("La cola esta vacia");
            return true;
        }
        System.out.println("La cola no esta vacia");
        return false;
    }
    
    public boolean llena(){
        if (cant == espacio.length){
            System.out.println("La cola esta llena");
            return true;
        }
        System.out.println("La cola no esta llena");
        return false;
    }

    public int mostrarFrente(){
        int primerElemento = 0;
        if (vacia())
            System.out.println("La cola esta vacia");
        else{
            primerElemento =  espacio[frent];
            System.out.println("El frente es: "+primerElemento);
        }
        return primerElemento;
    }

    public void vaciar(){
        fin = -1;
        frent = 0;
        cant = 0;
        System.out.println("Se ha vaciado la cola");
    }

    public int tamano(){
        System.out.println("El tamano de la cola es: "+cant);
        return cant;
    }
}
