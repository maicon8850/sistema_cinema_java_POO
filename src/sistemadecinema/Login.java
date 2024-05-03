package sistemadecinema;

public class Login {
    private String user;
    private String password;
    private boolean access = false;
    
    Funcionario funcionario = new Funcionario();
    
    public Login(String user, String password){
        this.user = user;
        this.password = password;
    };
    
    public boolean validarLogin(String user, String password){
        if(this.user.equals(funcionario.getUser()) && this.password.equals(funcionario.getPassword())){
            access = true;
        }else {
            return access;
        }
        
        return access;
    }
}
