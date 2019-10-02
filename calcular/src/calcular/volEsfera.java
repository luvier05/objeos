
package calcular;

import javax.swing.JOptionPane;


public class volEsfera {
    private double vol;
    public double tvol;

    /**
     * @return the vol
     */
    public double getVol() {
        return vol;
    }

    /**
     * @param vol the vol to set
     */
    public void setVol(double vol) {
        this.vol = vol;
       
        JOptionPane.showMessageDialog(null, tvol=(4/3)*Math.PI*(vol*vol*vol));

    }
    
    
    
            
    
}
