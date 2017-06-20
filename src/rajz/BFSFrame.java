/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajz;

 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
 

/**
 *
 * @author rajz
 */
public class BFSFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFram
     */
    public BFSFrame() {
        initComponents();
        vertexList = new ArrayList<>();
        addEdgeButton.setEnabled(false);
        runButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        addVertexButton = new javax.swing.JButton();
        addEdgeButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        drawPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        printTextArea = new javax.swing.JTextArea();
        debugButton = new javax.swing.JToggleButton();
        inputImpButton = new javax.swing.JButton();
        outputExpButton = new javax.swing.JButton();
        inpExpButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("BFS Tree");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        addVertexButton.setText("Add Vertex");
        addVertexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVertexButtonActionPerformed(evt);
            }
        });

        addEdgeButton.setText("Add Edge");

        runButton.setText("Run BFS");

        statusLabel.setText("XY axis : ");

        drawPanel.setBackground(new java.awt.Color(241, 234, 234));
        drawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        drawPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        drawPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drawPanelMouseMoved(evt);
            }
        });
        drawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawPanelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        printTextArea.setColumns(20);
        printTextArea.setRows(5);
        jScrollPane1.setViewportView(printTextArea);

        debugButton.setText("Print Debug");
        debugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debugButtonActionPerformed(evt);
            }
        });

        inputImpButton.setText("Import input");
        inputImpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputImpButtonActionPerformed(evt);
            }
        });

        outputExpButton.setText("Export Output");

        inpExpButton.setText("Export Input");

        undoButton.setText("Undo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addVertexButton)
                        .addGap(18, 18, 18)
                        .addComponent(addEdgeButton)
                        .addGap(18, 18, 18)
                        .addComponent(runButton)
                        .addGap(18, 18, 18)
                        .addComponent(debugButton)
                        .addGap(93, 93, 93)
                        .addComponent(undoButton)
                        .addGap(78, 78, 78)
                        .addComponent(inputImpButton)
                        .addGap(18, 18, 18)
                        .addComponent(outputExpButton)
                        .addGap(18, 18, 18)
                        .addComponent(inpExpButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                            .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVertexButton)
                    .addComponent(addEdgeButton)
                    .addComponent(runButton)
                    .addComponent(debugButton)
                    .addComponent(inputImpButton)
                    .addComponent(outputExpButton)
                    .addComponent(inpExpButton)
                    .addComponent(undoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formMouseReleased


    public void draw() {
        Graphics g = this.drawPanel.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        //g2.clearRect(0, 0, 728, 426);
        int i=0;
        for(Point p : vertexList) {
            g2.setColor(Color.BLUE); 
            g2.fillRect(p.x - vertexL/2 , p.y - vertexB/2, vertexL, vertexB);
            g2.setColor(Color.WHITE);
            g2.drawString( Integer.toString(++i) , p.x - 5 , p.y + 5);
        }
    } 
    
    private void drawPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseMoved
        // TODO add your handling code here:
        statusLabel.setText("XY Axis: "+evt.getPoint().x +", " +evt.getPoint().y);
    }//GEN-LAST:event_drawPanelMouseMoved

    int curX =0, curY=0, shift =10,vertexL = 24,vertexB = 20;
    int vnumber =1;
    private void drawPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_drawPanelMouseReleased

    private void addVertexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVertexButtonActionPerformed
        // TODO add your handling code here:
        if(addVertexButton.getText() == "Add Vertex" ){
            addEdgeButton.setEnabled(true);
            runButton.setEnabled(true);
            addVertexButton.setText("Done Adding");
        }else if(addVertexButton.getText() == "Done Adding" ) {
            addEdgeButton.setEnabled(false);
            runButton.setEnabled(false);
            addVertexButton.setText("Add Vertex");
        }
        
        draw();
    }//GEN-LAST:event_addVertexButtonActionPerformed

    private void drawPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseClicked
        // TODO add your handling code here:
       
//        curX = evt.getX() ; 
//        curY = evt.getY() ; 
        System.out.println(evt.getPoint().toString());
        java.awt.Point pt = evt.getPoint();
        vertexList.add(pt);
        
        printTxt =  printTxt+ "new vertex: "+pt.x + ","+ pt.y + "\n";
        printTextArea.setText(printTxt);
        draw();
    }//GEN-LAST:event_drawPanelMouseClicked

    private void debugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugButtonActionPerformed
        // TODO add your handling code here:
        debugButton.setText("Debug off");
        
    }//GEN-LAST:event_debugButtonActionPerformed

    private void inputImpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputImpButtonActionPerformed
        // TODO add your handling code here:
        jFileChooser1.setVisible(true);
    }//GEN-LAST:event_inputImpButtonActionPerformed
    
    int numVertices=0;
    private Point isSamePoint(Point newPoint) {
        Point retPoint = null;
        for (Point p : vertexList){
                if( Math.abs((double)(newPoint.x - p.x)) < vertexL && 
                                Math.abs((double)(newPoint.y - p.y)) < vertexL ){
//                        if(DEBUG) System.out.println("same point as " + p.getverNumber());
                        retPoint = p;
                        break;
                }
        }

        return retPoint;
    }
    
    
    private boolean DEBUG = true;
    private String printTxt = "";
    private ArrayList<Point> vertexList ;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEdgeButton;
    private javax.swing.JButton addVertexButton;
    private javax.swing.JToggleButton debugButton;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JButton inpExpButton;
    private javax.swing.JButton inputImpButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton outputExpButton;
    private javax.swing.JTextArea printTextArea;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}