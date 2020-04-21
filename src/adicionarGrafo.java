import java.util.HashMap;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class adicionarGrafo extends Acciones{

    public adicionarGrafo (String nombre){
        this.getGraph().getModel().beginUpdate();
        Object parent = this.getGraph().getDefaultParent();
        Object v1 = this.getGraph().insertVertex(parent, null, nombre, 330, 30, 100, 50);
        this.getM().put(nombre, v1);
        this.getGraph().getModel().endUpdate();
        
    }

}
