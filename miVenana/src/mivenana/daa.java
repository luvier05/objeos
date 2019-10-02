
package mivenana;
import javax.swing.JOptionPane;

public class daa {

    public daa() {
    }
  Integer[] age= new Integer[15];
  String[] nombre= new String[15];
  Integer posicion=0;
  
  public void guardar(){
      if (posicion < 15){
          nombre[posicion]=venana.nombre.getText();
      age[posicion]= Integer.parseInt(venana.edad.getText());
      posicion=posicion+1;//incremeno
      
      String pos= String.valueOf(posicion);
      venana.conador.setText(pos);
      } else{
          JOptionPane.showMessageDialog(null," no se puede capurar mas regisros","error al añadir regisros",JOptionPane.PLAIN_MESSAGE);
      } 
  }

  public void imprimirDaos(){
      for(int i=0;i < posicion; i++){
          
      JOptionPane.showMessageDialog(null, "el nombre es: " + nombre + "\n La edad que iene es :"+ age, "mensaje" , JOptionPane.PLAIN_MESSAGE);
  }
  }

}
