
package calcular;
import javax.swing.JOptionPane;

public class area {
    private double a;

    /**
     * @return the area
     */
    public double getArea() {
        return a;
    }

    /**
     * @param a the area to set
     */
    public void setArea(double a) {
        this.a = a;
        JOptionPane.showMessageDialog(null, a= a*a);
        
    }
      
    
}
