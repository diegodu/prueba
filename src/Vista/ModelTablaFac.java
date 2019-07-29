
package vista;


import Modelo.FacturaDetalle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModelTablaFac extends AbstractTableModel{
    private String[] cabezera = {"Cantidad", "Descripcion", "Valor Unitario", "Valor Total"};
    private Class[] columnaDatos={String.class, String.class, String.class, String.class};
    private List<FacturaDetalle> datos;

    public ModelTablaFac() {
        datos = new ArrayList<FacturaDetalle>();
    }
    
    public ModelTablaFac(List<FacturaDetalle> datos){
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cabezera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        FacturaDetalle dato = (FacturaDetalle) (datos.get(rowIndex));

        switch (columnIndex) {
            case 0:
                return dato.getCantdad();
            case 1:
                return dato.getDescripcion();
            case 2:
                return dato.getValorUni();
            case 3: 
                return dato.getValorTotal();
            default:
                break;
        }
        return new String();
    }
    
    public void setValueAt(Object value, int row, int col) {
        FacturaDetalle dato = (FacturaDetalle) (datos.get(row));

        switch (col) {
            case 0:
                dato.setCantdad((String) value);
                break;
            case 1:
                dato.setDescripcion((String) value);
                break;
            case 2:
                dato.setValorUni((String) value);
                break;
            case 3:
                dato.setValorTotal((String) value);
                break;   
            default:
                break;
        }
    }
    
    public String getColumnName(int col) {
        return cabezera[col];
    }

    public Class getColumnClass(int col) {
        return columnaDatos[col];
    }
    
}
