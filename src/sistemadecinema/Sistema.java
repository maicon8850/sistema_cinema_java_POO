package sistemadecinema;
//import org.json.JSONObject;

public class Sistema{
    
    
    
    //Filme filme = new Filme();
    
    //Produto produto = new Produto();
    
   Funcionario funcionario = new Funcionario();
    
    
    public void insertFuncionario(String user, String password){
      funcionario.setPassword(password);
      funcionario.setUser(user);
  
      
    }
       
    //}
    
  //  public void acessar(){
      //  String pass = funcionario.getPassword();
      //  String user = funcionario.getUser();
      //  Login login = new Login(user,pass);
        
     //   boolean logado = login.validarLogin(user, pass);
    //    System.out.println(logado);
   // }
    
    
    
}

