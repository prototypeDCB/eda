package librerias.estructurasDeDatos.grafos;
public class test
{
    public static void main(String args[]){
        GrafoNoDirigido grafod = new GrafoNoDirigido(7);
        grafod.insertarArista(1,2, 1.0);
        grafod.insertarArista(1,4, 2.0);
        grafod.insertarArista(1,5, 3.0);
        grafod.insertarArista(1,3, 4.0);
        
        grafod.insertarArista(2,3,5.0);
        grafod.insertarArista(2,6,6.0);
        grafod.insertarArista(2,4,7.0);
        grafod.insertarArista(2,5,8.0);
        grafod.insertarArista(6,4,9.0);
        grafod.insertarArista(6,5,10.0);
        grafod.insertarArista(6,0,11.0);
        
        
        grafod.kruskal();
        
    }
}
