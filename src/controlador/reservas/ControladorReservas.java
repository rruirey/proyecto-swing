package controlador.reservas;

import modelo.dao.reserva.ReservaDAO;
import modelo.dao.reserva.ReservaDAOImpl;
import modelo.dao.usuario.Usuario;
import vista.reservas.Reserva;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorReservas {

  private final ReservaDAO modelo;
  private List<modelo.dao.reserva.Reserva> reservas;

  private final Reserva vista;
  private final Usuario usuario;

  private int index;

  public ControladorReservas(Usuario usuario) {
    this.usuario = usuario;
    this.vista = new Reserva();

    this.modelo = new ReservaDAOImpl();
    try {
      reservas = this.modelo.obtenerTodasReservas();
    } catch (SQLException ex) {
      reservas = new ArrayList<>();
      ex.printStackTrace();
    }

    inicializarVista();
  }

  private void inicializarVista() {
    vista.getVentanaReservas().setVisible(true);
  }

  public void inicializarControlador() {
    vista.getNextPageButton().addActionListener(event -> {
      handleButtonLogic(1);
    });
    vista.getPrevPageButton().addActionListener(event -> {
      handleButtonLogic(-1);
    });
  }

  public void handleButtonLogic(int modifier) {
    index += modifier;

    if (index > reservas.size()) {
      index = 0;
    }

    if (index < 0) {
      index = reservas.size();
    }

    render();
  }

  public void render() {
    // make graphic update
  }

}
