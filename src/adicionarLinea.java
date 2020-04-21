import javax.swing.*;

public class adicionarLinea extends Acciones {
  public adicionarLinea(){
      Object parent = this.getGraph().getDefaultParent();
      Object v1 = this.getM().get(JOptionPane.showInputDialog("Digite el grafico 1: "));
      Object v2 = this.getM().get(JOptionPane.showInputDialog("Digite el grafico 2: "));
      String nombre = JOptionPane.showInputDialog("Digite el nombre de la linea:");
      this.getGraph().insertEdge(parent, null, nombre, v1, v2);
  }
}
