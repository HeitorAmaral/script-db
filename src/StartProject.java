import br.com.fatec.script.dao.RecordsDAO;

public class StartProject {

	public static void main(String[] args) throws Exception {
		RecordsDAO recordsDAO = new RecordsDAO();
		recordsDAO.insert(10000);
	}

}
