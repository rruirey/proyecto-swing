package vista.reservas;

import javax.swing.*;

public class Reserva {

  private JFrame ventanaReservas;
  private JPanel panelPrincipal;
  private JPanel panelInferior;
  private JButton botonSalir;
  private JButton botonCerrarSesion;
  private JButton prevPageButton;
  private JButton nextPageButton;

  public Reserva() {
    ventanaReservas = new JFrame("Aplicación reservas");
    ventanaReservas.setContentPane(panelPrincipal);
    ventanaReservas.setSize(800, 800);
    ventanaReservas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventanaReservas.setLocationRelativeTo(null);
    // ventanaLogin.pack();
    //ventanaReservas.setVisible(true);
  }

  public JFrame getVentanaReservas() {
    return ventanaReservas;
  }

  public JButton getPrevPageButton() {
    return prevPageButton;
  }

  public JButton getNextPageButton() {
    return nextPageButton;
  }
}
