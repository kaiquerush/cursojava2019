package controller;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import model.Livro;

public class CriarDB {

	// we are using the in-memory H2 database
	// private final static String
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/aula24?useTimezone=true&serverTimezone=UTC";

	private Dao<Livro, Integer> livrosDao;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String[] args = null;
		new CriarDB().doMain(args);
	}

	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		try {
			// create our data-source for the database
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "root", "alunolab");
			// setup our database and DAOs
			setupDatabase(connectionSource);
			System.out.println("\n\nIT seems to have worked\n\n");
		} finally {

			// destroy the data source wich should close underlying connections
			if (connectionSource != null) {
				connectionSource.close();
			}

		}
	}

	/**
	 * Setup our database and DAOs
	 */

	private void setupDatabase(ConnectionSource conncetionSource) throws Exception {
		{
			livrosDao = DaoManager.createDao(conncetionSource, Livro.class);
			// if you need to crate the table
			TableUtils.createTable(conncetionSource, Livro.class);

		}
	}

}