
package sistemadecinema;
//import org.json.JSONObject;

public class Sistema extends Filme{
    
    public void insertFilme(String titulo){
        Sistema.super.setTitulo("Poderoso Chefão");
    };
    public String listFilme(){
       String titulo = Sistema.super.getTitulo();
       
       return titulo;
    };
}

