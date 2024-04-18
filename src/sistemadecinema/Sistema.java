
package sistemadecinema;
import org.json.JSONObject;

public class Sistema {
    public static void main(String[] args) {
     Filme filme = new Filme();  
     
     filme.setTitulo("Poderoso Chefão");
     JSONObject titulo = new JSONObject("{ \"Titulo\" : \""+filme.getTitulo()+"\" }");
       System.out.println(titulo);
   
    }
}

