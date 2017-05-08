package anpharos.gui.Graph;

import processing.core.PApplet;
import controlP5.*;

/**
 * Created on 5/7/17.
 */
public class GraphParent extends PApplet{
    ControlP5 cp5;
    Button dijkstra, dfs, bfs;
    Sphero sphero;
    SpainGraph spainGraph;
    int multiplier = 2;
    public void settings() {
        size(multiplier*600,multiplier*600);
    }

    public void setup() {
        cp5 = new ControlP5(this);
        dijkstra = cp5.addButton("Start Dijkstra").setPosition(width/4,20).setSize(100*multiplier,20*multiplier );
        dfs = cp5.addButton("Start DFS").setPosition(2*width/4, 20).setSize(100*multiplier,20*multiplier );
        bfs = cp5.addButton("Start BFS").setPosition(3*width/4,20).setSize(100*multiplier,20*multiplier );
        sphero = new Sphero(this, multiplier);
        spainGraph = new SpainGraph(this, multiplier);
    }

    public void draw() {
        sphero.draw();
        spainGraph.draw();
    }

    public static void init(){
        PApplet.main("anpharos.gui.Graph.GraphParent");
    }

    public static void main(String[] args){
        GraphParent tmp = new GraphParent();
        tmp.init();
        //GraphParent.init();
    }
}
