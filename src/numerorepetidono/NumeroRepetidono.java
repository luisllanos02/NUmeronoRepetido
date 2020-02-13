
package numerorepetidono;

public class NumeroRepetidono {

    public static void main(String[] args) {
     Integer repetidoRepetido[] = new Integer[]{1,2,3,4,1,5,3,2,4};
     for(int i=0;i<repetidoRepetido.length;i++){  
           boolean repetido = false;
      for(int j=0;j<repetidoRepetido.length;j++){
      if(repetidoRepetido[i] == repetidoRepetido[j] && i != j ){
      repetido = true;
        break;
         }
       }
      if(!repetido){
       System.out.println("valor: " + repetidoRepetido[i]+" en la posicion " + i); 
      break;
         }
       }
     } 
   }
 