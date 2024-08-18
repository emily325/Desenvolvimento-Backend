import java.util.ArrayList;
import java.util.List;

public class ilhaDeCalor {
    private int id;
    private String bairro;
    private String zona;

    public ilhaDeCalor(){
    }

    public ilhaDeCalor(int id, String bairro, String zona){
        this.id = id;
        this.bairro = bairro;
        this.zona = zona;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getZona(){
        return zona;
    }

    public void setZona(String zona){
        this.zona = zona;
    }

    public List getIlhasDeCalor() {
        return ilhasDeCalor;
    }

    public void setIlhasDeCalor(List ilhasDeCalor) {
        this.ilhasDeCalor = ilhasDeCalor;
    }

    

}
