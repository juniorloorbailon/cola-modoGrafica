paquete de  cola ;

import  javax.swing.JOptionPane ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
la  clase  pública Principal  extiende  javax.swing . JFrame {

    Todos los derechos reservados
     * Crea una nueva forma Principal
     * /
    public  Principal () {
        initComponents ();
    }
    Nodo Cola =  nulo ;                     

    private  void  BTNinsertarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
        if ( TXTinsertar . getText () . length () ==  0 ) {
            JOptionPane . showMessageDialog ( nulo , " Ingrese un Dato " );
        } else {
        String dato =  TXTinsertar . getText ();
        Cola  =  Nodo . insertarCola ( Cola , dato);
        TXTinsertar . setText ( " " );           
        JOptionPane . showMessageDialog ( null , " Elemento ingresado " );
        }
        
    }                                           

    private  void  BTNeliminarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
        Cola  =  Nodo . eliminarCola ( Cola );
    }                                           

    private  void  BTNbuscarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          
        // TODO agregue su código de manejo aquí:
        if ( TXTbuscar . getText () . length () ==  0 ) {
            JOptionPane . showMessageDialog ( null , " Ingrese Dato a Buscar " );
        } else {
        String dato =  TXTbuscar . getText ();
        Nodo . buscarCola ( Cola , dato);
        TXTbuscar . setText ( " " );  
        }
        
    }                                         

    private  void  BTNimprimirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
        Nodo . imprimirCola ( Cola );
    }                                           

    private  void  BTNsalirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        disponer();
    }                                        

    private  void  BTNimprimirprimerelementoActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                          
        // TODO agregue su código de manejo aquí:
        Nodo . imprimirColaInicio ( Cola );
    } 