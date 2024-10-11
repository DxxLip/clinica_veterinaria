package dao;
import dao.EspecieDao;
import domain.Atendente;
import domain.Especie;

public class App {

    public static void main(String[] args) throws Exception {
        Especie cachorro = new Especie("Cachorro");
        EspecieDao especieDao = new EspecieDao();
        especieDao.inserir(cachorro);
        System.out.println(cachorro);

         Atendente atendente = new Atendente("Ana","7895890658754",2000d);
         AtendenteDao atendenteDao = new AtendenteDao();
         atendenteDao.inserir(atendente);
         System.out.println(atendente);
    }

}
