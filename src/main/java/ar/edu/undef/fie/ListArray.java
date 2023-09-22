package ar.edu.undef.fie;

// Definir un String[] que sea dinámico. Asi funciona ArrayList

public class ListArray {
    private final int bufferSize = 50;
    private String[] arreglo;
    private int lugarDeInsercion = 0;

    public ListArray(){
        arreglo = new String[bufferSize];
    }

    public void add(String elemento){

        if (lugarDeInsercion == bufferSize){
            expand();
        }
        arreglo[lugarDeInsercion] = elemento;
        lugarDeInsercion ++;
    }

    private void expand(){
        var newArreglo = new String[arreglo.length + bufferSize];
        for (int i = 0; i < arreglo.length; i++) {
            newArreglo[i] = arreglo[i];
        }

        //System.arraycopy(arreglo, 0, newArreglo, 0, arreglo.length);
        arreglo = newArreglo;
    }
    public String pop() {
        lugarDeInsercion --;
        return arreglo[lugarDeInsercion];
    }
}
