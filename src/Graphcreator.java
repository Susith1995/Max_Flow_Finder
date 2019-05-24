import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;


public class Graphcreator {


    public static void main(String[] args) {

       // graphDraw6();
       // graphDraw9();
    }
    public static void graphDraw6(){

      //  MaxFlow MaxFlow = new MaxFlow();
        MaxFlow.init();

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 1");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");

       node1.setAttribute("xy", new double[] { 0,10});
        node2.setAttribute("xy", new double[] { 10,0 });
        node3.setAttribute("xy", new double[] { 10,20 });
        node4.setAttribute("xy", new double[] { 20,20 });
        node5.setAttribute("xy", new double[] { 20,0});
        node6.setAttribute("xy", new double[] { 40,10 });


        graph.setStrict(true);
       // graph.setAutoCreate( true );
        // graph.setAutoCreate( false );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length",MaxFlow.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",MaxFlow.objArraylist.get(2));

        graph.addEdge("B-C", "B", "C", true).addAttribute("length", MaxFlow.objArraylist.get(8));
        graph.addEdge("B-D", "B", "D" ,true).addAttribute("length", MaxFlow.objArraylist.get(9));

       // graph.addEdge("C-B", "C", "B" ,true).addAttribute("length", t.objArraylist.get(13));
        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", MaxFlow.objArraylist.get(15));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", MaxFlow.objArraylist.get(16));

       // graph.addEdge("D-B", "D", "B" ,true).addAttribute("length", t.objArraylist.get(19));
       // graph.addEdge("D-C", "D", "C" ,true).addAttribute("length", t.objArraylist.get(20));
        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", MaxFlow.objArraylist.get(22));
        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", MaxFlow.objArraylist.get(23));

       // graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(25));
       // graph.addEdge("E-C", "E", "C" ,true).addAttribute("length", t.objArraylist.get(26));
       // graph.addEdge("E-D", "E", "D" ,true).addAttribute("length", t.objArraylist.get(27));
        graph.addEdge("E-F", "E", "F" ,true).addAttribute("length", MaxFlow.objArraylist.get(29));



       // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");




        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#F { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");



      //   System.out.println(A);
        graph.display();

    }

    public static void graphDraw7(){
       /* MaxFlow MaxFlow = new MaxFlow();*/
        MaxFlow.init();
        /*System.out.println("printobjarraylist"+t.objArraylist);
        System.out.println("first element of array"+t.objArraylist.get(0));*/
        int y =14;
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");

        node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 20, 0 });
        node3.setAttribute("xy", new double[] { 20, 40 });
        node4.setAttribute("xy", new double[] { 40, 0 });
        node5.setAttribute("xy", new double[] { 40, 40});
        node6.setAttribute("xy", new double[] { 80, 12 });
        node7.setAttribute("xy", new double[] { 80, 26 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", MaxFlow.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",MaxFlow.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", MaxFlow.objArraylist.get(9));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", MaxFlow.objArraylist.get(10));


       // graph.addEdge("C-B", "C", "B" ,true).addAttribute("length", t.objArraylist.get(15));
        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", MaxFlow.objArraylist.get(17));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", MaxFlow.objArraylist.get(18));


       // graph.addEdge("D-B", "D", "B" ,true).addAttribute("length", t.objArraylist.get(22));
        //graph.addEdge("D-C", "D", "C" ,true).addAttribute("length", t.objArraylist.get(23));
        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", MaxFlow.objArraylist.get(25));
        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", MaxFlow.objArraylist.get(26));


        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", MaxFlow.objArraylist.get(29));
      //  graph.addEdge("E-C", "E", "C" ,true).addAttribute("length", t.objArraylist.get(30));
      //  graph.addEdge("E-D", "E", "D" ,true).addAttribute("length", t.objArraylist.get(31));
        graph.addEdge("E-F", "E", "F" ,true).addAttribute("length", MaxFlow.objArraylist.get(33));
        graph.addEdge("E-G", "E", "G" ,true).addAttribute("length", MaxFlow.objArraylist.get(34));


        graph.addEdge("F-C", "F", "C" ,true).addAttribute("length", MaxFlow.objArraylist.get(37));
       // graph.addEdge("F-D", "F", "D" ,true).addAttribute("length", t.objArraylist.get(38));
      //  graph.addEdge("F-E", "F", "E" ,true).addAttribute("length", t.objArraylist.get(39));
        graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", MaxFlow.objArraylist.get(41));

        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#G { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }

    public static void graphDraw8(){
        MaxFlow t = new MaxFlow();
        MaxFlow.init();
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");

        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");
        Node node8 =graph.addNode("H");

        node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 20, 40 });
        node3.setAttribute("xy", new double[] { 20,0 });
        node4.setAttribute("xy", new double[] { 40,0 });
        node5.setAttribute("xy", new double[] { 60,40});
        node6.setAttribute("xy", new double[] { 40,40 });
        node7.setAttribute("xy", new double[] { 60,0 });
        node8.setAttribute("xy", new double[] { 80,20 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", t.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",t.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", t.objArraylist.get(10));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", t.objArraylist.get(11));

        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", t.objArraylist.get(19));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", t.objArraylist.get(20));

        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", t.objArraylist.get(28));
        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", t.objArraylist.get(29));


        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(33));
       // graph.addEdge("E-C", "E", "C" ,true).addAttribute("length", t.objArraylist.get(34));
        //graph.addEdge("E-D", "E", "D" ,true).addAttribute("length", t.objArraylist.get(35));
        graph.addEdge("E-F", "E", "F" ,true).addAttribute("length", t.objArraylist.get(37));
        graph.addEdge("E-G", "E", "G" ,true).addAttribute("length", t.objArraylist.get(38));

        graph.addEdge("F-C", "F", "C" ,true).addAttribute("length", t.objArraylist.get(42));
       // graph.addEdge("F-D", "F", "D" ,true).addAttribute("length", t.objArraylist.get(43));
       // graph.addEdge("F-E", "F", "E" ,true).addAttribute("length", t.objArraylist.get(44));
        graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", t.objArraylist.get(46));
        graph.addEdge("F-H", "F", "H" ,true).addAttribute("length", t.objArraylist.get(47));


        graph.addEdge("G-D", "G", "D" ,true).addAttribute("length", t.objArraylist.get(51));
       // graph.addEdge("G-E", "G", "E" ,true).addAttribute("length", t.objArraylist.get(52));
       // graph.addEdge("G-F", "G", "F" ,true).addAttribute("length", t.objArraylist.get(53));
        graph.addEdge("G-H", "G", "H" ,true).addAttribute("length", t.objArraylist.get(55));


        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#H { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }

    public static void graphDraw9(){
        MaxFlow t = new MaxFlow();
        MaxFlow.init();

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");
        Node node8 =graph.addNode("H");
        Node node9 =graph.addNode("I");

        node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 0, 40 });
        node3.setAttribute("xy", new double[] { 20,0 });
        node4.setAttribute("xy", new double[] { 20, 60 });
        node5.setAttribute("xy", new double[] { 40,0});
        node6.setAttribute("xy", new double[] { 40,60 });
        node7.setAttribute("xy", new double[] { 60,10 });
        node8.setAttribute("xy", new double[] { 60,50 });
        node9.setAttribute("xy", new double[] { 100,30 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", t.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",t.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", t.objArraylist.get(11));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", t.objArraylist.get(12));


        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", t.objArraylist.get(21));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", t.objArraylist.get(22));



        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", t.objArraylist.get(31));
        /*graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", t.objArraylist.get(32));
        graph.addEdge("D-G", "D", "G" ,true).addAttribute("length", t.objArraylist.get(33));
        graph.addEdge("D-H", "D", "H" ,true).addAttribute("length", t.objArraylist.get(34));
        graph.addEdge("D-I", "D", "I" ,true).addAttribute("length", t.objArraylist.get(35));*/

        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(37));
        graph.addEdge("E-F", "E", "F" ,true).addAttribute("length", t.objArraylist.get(41));
        graph.addEdge("E-G", "E", "G" ,true).addAttribute("length", t.objArraylist.get(42));


        graph.addEdge("F-C", "F", "C" ,true).addAttribute("length", t.objArraylist.get(47));
        graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", t.objArraylist.get(51));
        graph.addEdge("F-H", "F", "H" ,true).addAttribute("length", t.objArraylist.get(52));

        graph.addEdge("G-D", "G", "D" ,true).addAttribute("length", t.objArraylist.get(57));
        graph.addEdge("G-H", "G", "H" ,true).addAttribute("length", t.objArraylist.get(61));
        graph.addEdge("G-I", "G", "I" ,true).addAttribute("length", t.objArraylist.get(62));


        graph.addEdge("H-E", "H", "E" ,true).addAttribute("length", t.objArraylist.get(67));
        graph.addEdge("H-I", "H", "I" ,true).addAttribute("length", t.objArraylist.get(71));


        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#I { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }

    public static void graphDraw10(){
        MaxFlow t = new MaxFlow();
        MaxFlow.init();

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");
        Node node8 =graph.addNode("H");
        Node node9 =graph.addNode("I");
        Node node10 =graph.addNode("J");

        node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 0, 40 });
        node3.setAttribute("xy", new double[] { 20,0 });
        node4.setAttribute("xy", new double[] { 20, 60 });
        node5.setAttribute("xy", new double[] { 40,0});
        node6.setAttribute("xy", new double[] { 40,60 });
        node7.setAttribute("xy", new double[] { 60,10 });
        node8.setAttribute("xy", new double[] { 60,50 });
        //node9.setAttribute("xy", new double[] { 100,30 });
        //node10.setAttribute("xy", new double[] { 100,30 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", t.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",t.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", t.objArraylist.get(12));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", t.objArraylist.get(13));


        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", t.objArraylist.get(23));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", t.objArraylist.get(24));



        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", t.objArraylist.get(35));


        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(41));
        graph.addEdge("E-G", "E", "G" ,true).addAttribute("length", t.objArraylist.get(46));
        /*graph.addEdge("E-H", "E", "H" ,true).addAttribute("length", t.objArraylist.get(43));
        graph.addEdge("E-I", "E", "I" ,true).addAttribute("length", t.objArraylist.get(44));*/


        graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", t.objArraylist.get(56));
        graph.addEdge("F-H", "F", "H" ,true).addAttribute("length", t.objArraylist.get(57));
        //graph.addEdge("F-I", "F", "I" ,true).addAttribute("length", t.objArraylist.get(53));


        graph.addEdge("G-H", "G", "H" ,true).addAttribute("length", t.objArraylist.get(67));
        graph.addEdge("G-I", "G", "I" ,true).addAttribute("length", t.objArraylist.get(68));


        graph.addEdge("H-E", "H", "E" ,true).addAttribute("length", t.objArraylist.get(74));
        graph.addEdge("H-I", "H", "I" ,true).addAttribute("length", t.objArraylist.get(78));
        graph.addEdge("H-J", "H", "J" ,true).addAttribute("length", t.objArraylist.get(79));

        graph.addEdge("I-F", "I", "F" ,true).addAttribute("length", t.objArraylist.get(85));
        graph.addEdge("I-J", "I", "J" ,true).addAttribute("length", t.objArraylist.get(89));


        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#J { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }

    public static void graphDraw11(){
        MaxFlow t = new MaxFlow();
        MaxFlow.init();

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");
        Node node8 =graph.addNode("H");
        Node node9 =graph.addNode("I");
        Node node10 =graph.addNode("J");
        Node node11 =graph.addNode("K");

        node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 0, 40 });
        node3.setAttribute("xy", new double[] { 20,0 });
        node4.setAttribute("xy", new double[] { 20, 60 });
        node5.setAttribute("xy", new double[] { 40,0});
        node6.setAttribute("xy", new double[] { 40,60 });
        node7.setAttribute("xy", new double[] { 60,10 });
        node8.setAttribute("xy", new double[] { 60,50 });
        //node9.setAttribute("xy", new double[] { 100,30 });
        //node10.setAttribute("xy", new double[] { 100,30 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", t.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",t.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", t.objArraylist.get(13));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", t.objArraylist.get(14));


        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", t.objArraylist.get(25));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", t.objArraylist.get(26));


        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", t.objArraylist.get(37));
        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", t.objArraylist.get(38));


        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(45));
        graph.addEdge("E-F", "E", "F" ,true).addAttribute("length", t.objArraylist.get(49));
        /*graph.addEdge("E-H", "E", "H" ,true).addAttribute("length", t.objArraylist.get(43));
        graph.addEdge("E-I", "E", "I" ,true).addAttribute("length", t.objArraylist.get(44));*/


        graph.addEdge("F-C", "F", "C" ,true).addAttribute("length", t.objArraylist.get(57));
        graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", t.objArraylist.get(61));
        graph.addEdge("F-H", "F", "H" ,true).addAttribute("length", t.objArraylist.get(62));

        graph.addEdge("G-D", "G", "D" ,true).addAttribute("length", t.objArraylist.get(69));
        graph.addEdge("G-H", "G", "H" ,true).addAttribute("length", t.objArraylist.get(73));
        graph.addEdge("G-I", "G", "I" ,true).addAttribute("length", t.objArraylist.get(74));

        graph.addEdge("H-E", "H", "E" ,true).addAttribute("length", t.objArraylist.get(81));
        graph.addEdge("H-I", "H", "I" ,true).addAttribute("length", t.objArraylist.get(85));
        graph.addEdge("H-J", "H", "J" ,true).addAttribute("length", t.objArraylist.get(86));

        graph.addEdge("I-F", "I", "F" ,true).addAttribute("length", t.objArraylist.get(93));
        graph.addEdge("I-J", "I", "J" ,true).addAttribute("length", t.objArraylist.get(97));
        graph.addEdge("I-K", "I", "K" ,true).addAttribute("length", t.objArraylist.get(98));

        graph.addEdge("J-G", "J", "G" ,true).addAttribute("length", t.objArraylist.get(105));
        graph.addEdge("J-K", "J", "K" ,true).addAttribute("length", t.objArraylist.get(109));


        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#K { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }

    public static void graphDraw12(){
        MaxFlow t = new MaxFlow();
        MaxFlow.init();

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("Tutorial 2");
        // MultiGraph graph = new MultiGraph("Network");
        Node node1 = graph.addNode("A");
        Node node2 =graph.addNode("B");
        Node node3 =graph.addNode("C");
        Node node4 =graph.addNode("D");
        Node node5 =graph.addNode("E");
        Node node6 =graph.addNode("F");
        Node node7 =graph.addNode("G");
        Node node8 =graph.addNode("H");
        Node node9 =graph.addNode("I");
        Node node10 =graph.addNode("J");
        Node node11 =graph.addNode("K");
        Node node12 =graph.addNode("L");

       /* node1.setAttribute("xy", new double[] { 0, 20});
        node2.setAttribute("xy", new double[] { 0, 40 });
        node3.setAttribute("xy", new double[] { 20,0 });
        node4.setAttribute("xy", new double[] { 20, 60 });
        node5.setAttribute("xy", new double[] { 40,0});
        node6.setAttribute("xy", new double[] { 40,60 });
        node7.setAttribute("xy", new double[] { 60,10 });
        node8.setAttribute("xy", new double[] { 60,50 });*/
        //node9.setAttribute("xy", new double[] { 100,30 });
        //node10.setAttribute("xy", new double[] { 100,30 });

        graph.setStrict(false);
        graph.setAutoCreate( true );

        graph.addEdge("A-B", "A", "B" ,true).addAttribute("length", t.objArraylist.get(1));
        graph.addEdge("A-C", "A", "C" ,true).addAttribute("length",t.objArraylist.get(2));


        graph.addEdge("B-C", "B", "C" ,true).addAttribute("length", t.objArraylist.get(14));
        graph.addEdge("B-D", "B", "D", true).addAttribute("length", t.objArraylist.get(15));


        graph.addEdge("C-D", "C", "D" ,true).addAttribute("length", t.objArraylist.get(27));
        graph.addEdge("C-E", "C", "E" ,true).addAttribute("length", t.objArraylist.get(28));


        graph.addEdge("D-E", "D", "E" ,true).addAttribute("length", t.objArraylist.get(40));
        graph.addEdge("D-F", "D", "F" ,true).addAttribute("length", t.objArraylist.get(41));


        graph.addEdge("E-B", "E", "B" ,true).addAttribute("length", t.objArraylist.get(49));
        graph.addEdge("E-G", "E", "G" ,true).addAttribute("length", t.objArraylist.get(54));
        /*graph.addEdge("E-H", "E", "H" ,true).addAttribute("length", t.objArraylist.get(43));
        graph.addEdge("E-I", "E", "I" ,true).addAttribute("length", t.objArraylist.get(44));*/


        graph.addEdge("F-C", "F", "C" ,true).addAttribute("length", t.objArraylist.get(62));
      //  graph.addEdge("F-G", "F", "G" ,true).addAttribute("length", t.objArraylist.get(61));
        graph.addEdge("F-H", "F", "H" ,true).addAttribute("length", t.objArraylist.get(67));

       // graph.addEdge("G-D", "G", "D" ,true).addAttribute("length", t.objArraylist.get(69));
        graph.addEdge("G-H", "G", "H" ,true).addAttribute("length", t.objArraylist.get(79));
        graph.addEdge("G-I", "G", "I" ,true).addAttribute("length", t.objArraylist.get(80));

      //  graph.addEdge("H-E", "H", "E" ,true).addAttribute("length", t.objArraylist.get(81));
        graph.addEdge("H-I", "H", "I" ,true).addAttribute("length", t.objArraylist.get(92));
        graph.addEdge("H-J", "H", "J" ,true).addAttribute("length", t.objArraylist.get(93));

        graph.addEdge("I-F", "I", "F" ,true).addAttribute("length", t.objArraylist.get(101));
        graph.addEdge("I-J", "I", "J" ,true).addAttribute("length", t.objArraylist.get(105));
        graph.addEdge("I-K", "I", "K" ,true).addAttribute("length", t.objArraylist.get(106));

        graph.addEdge("J-G", "J", "G" ,true).addAttribute("length", t.objArraylist.get(114));
        graph.addEdge("J-K", "J", "K" ,true).addAttribute("length", t.objArraylist.get(118));
        graph.addEdge("J-L", "J", "L" ,true).addAttribute("length", t.objArraylist.get(119));

        graph.addEdge("K-H", "K", "H" ,true).addAttribute("length", t.objArraylist.get(127));
        graph.addEdge("K-L", "K", "L" ,true).addAttribute("length", t.objArraylist.get(131));


        // graph.getEdge("A-B").setAttribute("ui.class", "e1");
        // graph.getEdge("B-A").setAttribute("ui.class", "e2");

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge e : graph.getEachEdge())
            e.addAttribute("label", "" + (int) e.getNumber("length"));

        Node A = graph.getNode("A");

        graph.addAttribute("ui.stylesheet", "graph { fill-color: grey; }   " +
                "edge { text-alignment:center; text-size:15px;  text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; arrow-shape: arrow; arrow-size: 24px, 6px; } " +
                " node#K { fill-color: red; text-color:white;  }  node {" +
                "text-size: 30px;" +
                "text-color:blue;  \n" +
                "\tsize: 50px, 50px;\n" +
                "\tshape: circle;\n" +
                "\tfill-color: green;\n" +
                "\tstroke-mode: plain;\n" +
                "\tstroke-color: yellow;\n" +
                "}" +
                "");

        System.out.println(A);
        graph.display();
    }


}
