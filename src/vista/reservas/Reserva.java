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
  private JPanel horizontalPanel;
  private JPanel topPanel;
  private JPanel centerPanel;
  private JPanel leftPanel;
  private JLabel fechaLabel;
  private JLabel duracionLabel;
  private JLabel horaEntradaLabel;
  private JLabel tipoReservaLabel;
  private JLabel usuarioLabel;
  private JLabel reservaIndexLabel;

  public Reserva() {
    ventanaReservas = new JFrame("Aplicación reservas");
    ventanaReservas.setContentPane(panelPrincipal);
    ventanaReservas.setSize(500, 400);
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

  public JLabel getFechaLabel() {
    return fechaLabel;
  }

  public JLabel getDuracionLabel() {
    return duracionLabel;
  }

  public JLabel getHoraEntradaLabel() {
    return horaEntradaLabel;
  }

  public JLabel getTipoReservaLabel() {
    return tipoReservaLabel;
  }

  public JLabel getUsuarioLabel() {
    return usuarioLabel;
  }

  public JLabel getReservaIndexLabel() {
    return reservaIndexLabel;
  }
}
