package Productos;

public class Producto {
    private short precio;
    private boolean permisoVip;
    private boolean permisoRegular;
    private boolean permisoEstudiante;
    
    public Producto(short precio,boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante){
        this.precio=precio;
        this.permisoVip=permisoVip;
        this.permisoRegular=permisoRegular;
        this.permisoEstudiante=permisoEstudiante;
    }
    public short getPrecio() {
        return precio;
    }

    public void setPrecio(short precio) {
        this.precio = precio;
    }

    public boolean getpermisoVip(){
        return permisoVip;
    }
    public void setPermisoVip(boolean permisoVip){
        this.permisoVip=permisoVip;
    }
    
    public boolean permisoRegular(){
        return permisoRegular;
    }

    
    
    



}
