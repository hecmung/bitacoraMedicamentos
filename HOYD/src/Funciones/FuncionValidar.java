
package Funciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class FuncionValidar {
// no debe de ser void, debe ser boolean y un return e.e  
    boolean var=true;
    
    Pattern pa;
    Matcher mat;
    
   public boolean validarletras(String cadena){
        pa=Pattern.compile("[a-zA-Z,0-9]{6,18}");
        mat=pa.matcher(cadena);
        if(mat.matches()){
            
            var=true;
        }else{
            
            var=false;
        }
        
        return var;
    }
    boolean validarnumeros(String cadena){
        pa=Pattern.compile("[10-9000]{1,5}");
        mat=pa.matcher(cadena);
        if(mat.matches()){
            JOptionPane.showMessageDialog(null,"Los numeros que metiste "
                    + "son correctos, sigue asi xdxdxd");
            var=true;
        }else{
            JOptionPane.showMessageDialog(null,"Ingresa el dato "
                    + "correcto");
        
            var=false;
        }
        
        return var;
    }
    
    
    
    
}
