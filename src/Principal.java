public class Principal { //Esta es la clase principal, tomara datos de la clase acciones
    public Principal() {
       Acciones a = new Acciones(); //Creamos un objeto acciones
        a.setVisible(true);  //Seteamos la visibilidad a verdadero
       // Prueba b = new Prueba();
    }

    public static void main(String args[]){
        new Principal();
       // new Prueba();
    }

}
