package projeto.connection.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.model.Projeto;
import projeto.model.Usuario;

public class Manager {

    private Usuario usuarioLogado;

    private final UsuarioDAO usuarioDAO;
    private final MensagemIndividualDAO mensagemIndividualDAO;
    private final ProjetoDAO projetoDAO;
    private final MensagemColetivaDAO mensagemColetivaDAO;

    public Manager(){
        this.usuarioDAO = new UsuarioDAO();
        this.mensagemIndividualDAO = new MensagemIndividualDAO();
        this.projetoDAO = new ProjetoDAO();
        this.mensagemColetivaDAO = new MensagemColetivaDAO();
    }

    public void criarTabelas(){
        this.usuarioDAO.createTable();
        this.projetoDAO.createTable();
        this.mensagemColetivaDAO.createTable();
        this.mensagemIndividualDAO.createTable();
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public ProjetoDAO getProjetoDAO() {
        return projetoDAO;
    }

    public MensagemColetivaDAO getmColeDAO() {
        return mensagemColetivaDAO;
    }

    public MensagemIndividualDAO getmIndiDAO() {
        return mensagemIndividualDAO;
    }

    public UsuarioDAO getUsuarioDao() {
        return usuarioDAO;
    }
    
    public void criarProjeto(Projeto projeto){
        this.projetoDAO.addProjetoToDatabase(projeto);
    }
    
    public void criarUsuario(Usuario usuario){
        this.usuarioDAO.addUsuarioToDatabase(usuario);
    }
    
    public boolean existeUsuario(String userName){
        return this.usuarioDAO.getTodosUsuarios().stream().anyMatch(r-> r.getUserName().equalsIgnoreCase(userName));
    }

    public boolean existeUsuarioNome(String name){
        return this.usuarioDAO.getTodosUsuarios().stream().anyMatch(r-> r.getNome().equalsIgnoreCase(name));
    }

    public boolean existeUsuario(int id){
        return this.usuarioDAO.getTodosUsuarios().stream().anyMatch(r-> r.getId() == id);
    }

    public Usuario getUsuarioByUserName(String userName){
        if(!existeUsuario(userName)) return null;
        return 
            this.usuarioDAO.getTodosUsuarios().stream().filter(r-> r.getUserName().equalsIgnoreCase(userName)).findFirst().get();
    }

    public Usuario getUsuarioByID(int id){
        return this.usuarioDAO.getTodosUsuarios().stream().filter(r-> r.getId() == id).findFirst().get();
    }

    public boolean existeProjeto(String projeto){
        return this.projetoDAO.getTodosProjetos().stream().anyMatch(r->r.getNome().equalsIgnoreCase(projeto));
    }

    public Projeto getProjetoByName(String projeto){
        if(!existeProjeto(projeto)) return null;
        return 
            this.projetoDAO.getTodosProjetos().stream().filter(r->r.getNome().equalsIgnoreCase(projeto)).findFirst().get();
    }

    public String transformarData(long data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        return simpleDateFormat.format(data);
    }
    
    public long destransformarData(String data){
        if(data.contains("às")) data = data.replace("às", "-");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        try {
            return simpleDateFormat.parse(data).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
