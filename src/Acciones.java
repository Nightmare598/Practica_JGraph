import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class Acciones extends JFrame {          //Para crear grafos es necesario 3 atributos
    protected static mxGraph graph = new mxGraph();                      //Estos tipos de objetos son de la libreria JGraph, ni yo se como logre implementarlo, pero lo hice
    protected static HashMap m = new HashMap();
    private mxGraphComponent graphComponent;
    private JTextField texto;
    private JButton btnAdd;
    private JButton btnEliminar;
    private JButton btnJuntar;
    private Object cell;

    public static HashMap getM(){
        return m;
    }

    public static mxGraph getGraph(){
        return graph;
    }

    public Acciones(){
        super("JGraph - Flujograma");       //Este es el constructor, el titulo
        initGUI();
    }
    private void initGUI(){                     //Creamos un metodo que define la creacion de una interfaz
        setSize(800,600);           //Tamaño
        setLocationRelativeTo(null);            //Por si queremos ubicarlo con respecto a algo, en este caso a nada
        graphComponent=new mxGraphComponent(graph);
        graphComponent.setPreferredSize(new Dimension(770,480));
        getContentPane().add(graphComponent);

        texto=new JTextField();
        getContentPane().add(texto);
        texto.setPreferredSize(new Dimension(520,21));
        setLayout(new FlowLayout(FlowLayout.LEFT));

        btnAdd= new JButton("Adicionar");
        getContentPane().add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                adicionarGrafo Add = new adicionarGrafo(texto.getText());
            }
        });
        btnEliminar = new JButton("Eliminar");
        getContentPane().add(btnEliminar);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                graph.getModel().remove(cell);
            }
        });

        btnJuntar = new JButton("Juntar");
        getContentPane().add(btnJuntar);
        btnJuntar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarLinea linea= new adicionarLinea();

            }
        });

        graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {

            public void mouseReleased(MouseEvent e) {
                cell = graphComponent.getCellAt(e.getX(),e.getY());
            }
        });
    }
}
