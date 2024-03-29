package gamagenerator;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Universidad
 */
public class GamaGeneratorGUI extends javax.swing.JFrame {

    /**
     * Creates new form GamaGeneratorGUI
     */
    public GamaGeneratorGUI() {
        initComponents();
        iniciarSegmentos();
        setSliderIniciales();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorInicioPanel = new javax.swing.JPanel();
        colorInicialLabel = new javax.swing.JLabel();
        redInicialLabel = new javax.swing.JLabel();
        greenInicialLabel = new javax.swing.JLabel();
        blueInicialLabel = new javax.swing.JLabel();
        redSliderInicial = new javax.swing.JSlider();
        greenSliderInicial = new javax.swing.JSlider();
        blueSliderInicial = new javax.swing.JSlider();
        redInicialValor = new javax.swing.JLabel();
        greenInicialValor = new javax.swing.JLabel();
        blueInicialValor = new javax.swing.JLabel();
        colorFinalPanel = new javax.swing.JPanel();
        colorFinalLabel = new javax.swing.JLabel();
        redFinalLabel = new javax.swing.JLabel();
        greenFinalLabel = new javax.swing.JLabel();
        blueFinalLabel = new javax.swing.JLabel();
        redSliderFinal = new javax.swing.JSlider();
        greenSliderFinal = new javax.swing.JSlider();
        blueSliderFinal = new javax.swing.JSlider();
        redFinalValor = new javax.swing.JLabel();
        greenFinalValor = new javax.swing.JLabel();
        blueFinalValor = new javax.swing.JLabel();
        segmentosPanel = new javax.swing.JPanel();
        segmentosLabel = new javax.swing.JLabel();
        segmentosSilder = new javax.swing.JSlider();
        numeroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de Gamas");
        setMinimumSize(new java.awt.Dimension(640, 245));
        setPreferredSize(new java.awt.Dimension(640, 245));

        colorInicialLabel.setText("Color Inicial");

        redInicialLabel.setText("Red");

        greenInicialLabel.setText("Green");

        blueInicialLabel.setText("Blue");

        redSliderInicial.setMaximum(255);
        redSliderInicial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderInicialStateChanged(evt);
            }
        });

        greenSliderInicial.setMaximum(255);
        greenSliderInicial.setValue(75);
        greenSliderInicial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderInicialStateChanged(evt);
            }
        });

        blueSliderInicial.setMaximum(255);
        blueSliderInicial.setValue(150);
        blueSliderInicial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderInicialStateChanged(evt);
            }
        });

        redInicialValor.setText(""+redSliderInicial.getValue());

        greenInicialValor.setText(""+greenSliderInicial.getValue());

        blueInicialValor.setText(""+blueSliderInicial.getValue());

        javax.swing.GroupLayout colorInicioPanelLayout = new javax.swing.GroupLayout(colorInicioPanel);
        colorInicioPanel.setLayout(colorInicioPanelLayout);
        colorInicioPanelLayout.setHorizontalGroup(
            colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorInicioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(redSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(colorInicioPanelLayout.createSequentialGroup()
                .addGroup(colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorInicioPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(colorInicioPanelLayout.createSequentialGroup()
                                .addComponent(redInicialLabel)
                                .addGap(18, 18, 18)
                                .addComponent(redInicialValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(colorInicialLabel)
                            .addGroup(colorInicioPanelLayout.createSequentialGroup()
                                .addComponent(greenInicialLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(greenInicialValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(colorInicioPanelLayout.createSequentialGroup()
                                .addComponent(blueInicialLabel)
                                .addGap(18, 18, 18)
                                .addComponent(blueInicialValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(colorInicioPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(greenSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorInicioPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blueSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorInicioPanelLayout.setVerticalGroup(
            colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorInicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorInicialLabel)
                .addGap(18, 18, 18)
                .addGroup(colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redInicialLabel)
                    .addComponent(redInicialValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenInicialLabel)
                    .addComponent(greenInicialValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueInicialLabel)
                    .addComponent(blueInicialValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        colorFinalLabel.setText("Color Final");

        redFinalLabel.setText("Red");

        greenFinalLabel.setText("Green");

        blueFinalLabel.setText("Blue");

        redSliderFinal.setMaximum(255);
        redSliderFinal.setValue(100);
        redSliderFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderFinalStateChanged(evt);
            }
        });

        greenSliderFinal.setMaximum(255);
        greenSliderFinal.setValue(100);
        greenSliderFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderFinalStateChanged(evt);
            }
        });

        blueSliderFinal.setMaximum(255);
        blueSliderFinal.setToolTipText("");
        blueSliderFinal.setValue(100);
        blueSliderFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderFinalStateChanged(evt);
            }
        });

        redFinalValor.setText(""+redSliderFinal.getValue());

        greenFinalValor.setText(""+greenSliderFinal.getValue());

        blueFinalValor.setText(""+blueSliderFinal.getValue());

        javax.swing.GroupLayout colorFinalPanelLayout = new javax.swing.GroupLayout(colorFinalPanel);
        colorFinalPanel.setLayout(colorFinalPanelLayout);
        colorFinalPanelLayout.setHorizontalGroup(
            colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorFinalPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(redSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(colorFinalPanelLayout.createSequentialGroup()
                .addGroup(colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorFinalLabel)
                            .addGroup(colorFinalPanelLayout.createSequentialGroup()
                                .addGroup(colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueFinalLabel)
                                    .addComponent(greenFinalLabel)
                                    .addComponent(redFinalLabel))
                                .addGap(18, 18, 18)
                                .addGroup(colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redFinalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(greenFinalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(blueFinalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(greenSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blueSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorFinalPanelLayout.setVerticalGroup(
            colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorFinalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorFinalLabel)
                .addGap(18, 18, 18)
                .addGroup(colorFinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                        .addComponent(redFinalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenFinalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueFinalLabel))
                    .addGroup(colorFinalPanelLayout.createSequentialGroup()
                        .addComponent(redFinalValor)
                        .addGap(35, 35, 35)
                        .addComponent(greenFinalValor)
                        .addGap(35, 35, 35)
                        .addComponent(blueFinalValor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        segmentosPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                segmentosPanelComponentAdded(evt);
            }
        });
        segmentosPanel.setLayout(new java.awt.GridLayout());

        segmentosLabel.setText("# Segmentos:");

        segmentosSilder.setMaximum(10);
        segmentosSilder.setMinimum(3);
        segmentosSilder.setValue(3);
        segmentosSilder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segmentosSilderStateChanged(evt);
            }
        });

        numeroLabel.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorInicioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(segmentosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segmentosLabel)
                                .addGap(18, 18, 18)
                                .addComponent(numeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(segmentosSilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(colorFinalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorInicioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorFinalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segmentosLabel)
                    .addComponent(numeroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segmentosSilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segmentosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segmentosSilderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segmentosSilderStateChanged
        segmentosPanel.removeAll();     
        numeroLabel.setText(""+segmentosSilder.getValue());
        Random r = new Random();    
        for (int i =0;i<segmentosSilder.getValue() ;i++ ) {
            JPanel panel =  new JPanel();
            segmentosPanel.add(panel);  
        }
        segmentosPanel.getComponent(0).setBackground(getColorInicial());
        segmentosPanel.getComponent(segmentosPanel.getComponentCount()-1).setBackground(getColorFinal());
    }//GEN-LAST:event_segmentosSilderStateChanged

    private void redSliderInicialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderInicialStateChanged
        redInicialValor.setText(""+redSliderInicial.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[0].setBackground(this.getColorInicial());
        pintarGama();
    }//GEN-LAST:event_redSliderInicialStateChanged

    private void greenSliderInicialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderInicialStateChanged
        greenInicialValor.setText(""+greenSliderInicial.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[0].setBackground(this.getColorInicial());
        pintarGama();
    }//GEN-LAST:event_greenSliderInicialStateChanged

    private void blueSliderInicialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderInicialStateChanged
        blueInicialValor.setText(""+blueSliderInicial.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[0].setBackground(this.getColorInicial());
        pintarGama();
    }//GEN-LAST:event_blueSliderInicialStateChanged

    private void redSliderFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderFinalStateChanged
        redFinalValor.setText(""+redSliderFinal.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[segmentosSilder.getValue()-1].setBackground(this.getColorFinal());
        pintarGama();
    }//GEN-LAST:event_redSliderFinalStateChanged

    private void greenSliderFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderFinalStateChanged
        greenFinalValor.setText(""+greenSliderFinal.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[segmentosSilder.getValue()-1].setBackground(this.getColorFinal());  
        pintarGama();
    }//GEN-LAST:event_greenSliderFinalStateChanged

    private void blueSliderFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderFinalStateChanged
        blueFinalValor.setText(""+blueSliderFinal.getValue());
        java.awt.Component componentes[] = segmentosPanel.getComponents();
        componentes[segmentosSilder.getValue()-1].setBackground(this.getColorFinal()); 
        pintarGama();
    }//GEN-LAST:event_blueSliderFinalStateChanged

    private void segmentosPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_segmentosPanelComponentAdded
        if(segmentosPanel.getComponentCount()>2) {
            pintarGama();
        }
    }//GEN-LAST:event_segmentosPanelComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamaGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamaGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamaGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamaGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamaGeneratorGUI().setVisible(true);
            }
        });
    }
    
    private void iniciarSegmentos() {
    
    Color color;
    int countSegmentos =segmentosSilder.getValue();
     for (int i =0;i<countSegmentos ;i++ ) {
            color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
            JPanel panel =  new JPanel();      
            panel.setBackground(color);
            segmentosPanel.add(panel);  
        }   
    }

    private Color getColorInicial() {       
        Color color = new Color(redSliderInicial.getValue(),greenSliderInicial.getValue(),blueSliderInicial.getValue());
        
        return color;
    }
    
    private Color getColorFinal() {
        Color color = new Color(redSliderFinal.getValue(),greenSliderFinal.getValue(),blueSliderFinal.getValue());
        return color;
    }
    
    private void repintarSegmentos() {
    
        for (int i =1; i<segmentosPanel.getComponentCount()-1;i++) {
        
            segmentosPanel.getComponent(i).repaint();
        }
    
    }
    
    private void pintarGama() {
    
        int pasoRed;
        int pasoGreen;
        int pasoBlue;
        
        pasoRed = (getColorFinal().getRed()- getColorInicial().getRed())/(segmentosPanel.getComponentCount()-1);
        pasoGreen = (getColorFinal().getGreen()- getColorInicial().getGreen())/(segmentosPanel.getComponentCount()-1);
        pasoBlue = (getColorFinal().getBlue()- getColorInicial().getBlue())/(segmentosPanel.getComponentCount()-1);
        
        Color colorInicial = getColorInicial();
        for(int i =1; i<segmentosPanel.getComponentCount()-1;i++) {
        
            Color newColor  = new Color(colorInicial.getRed()+pasoRed,colorInicial.getGreen()+pasoGreen,colorInicial.getBlue()+pasoBlue);
            segmentosPanel.getComponent(i).setBackground(newColor);
            colorInicial=newColor; 
        }
    
    }
    
    private void setSliderIniciales() {
        Color inicial = segmentosPanel.getComponent(0).getBackground();
        Color finals = segmentosPanel.getComponent(segmentosSilder.getValue()-1).getBackground();
        
        redSliderInicial.setValue(inicial.getRed());
        greenSliderInicial.setValue(inicial.getGreen());
        blueSliderInicial.setValue(inicial.getBlue());
        
        redSliderFinal.setValue(finals.getRed());
        greenSliderFinal.setValue(finals.getGreen());
        blueSliderFinal.setValue(finals.getBlue());
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueFinalLabel;
    private javax.swing.JLabel blueFinalValor;
    private javax.swing.JLabel blueInicialLabel;
    private javax.swing.JLabel blueInicialValor;
    private javax.swing.JSlider blueSliderFinal;
    private javax.swing.JSlider blueSliderInicial;
    private javax.swing.JLabel colorFinalLabel;
    private javax.swing.JPanel colorFinalPanel;
    private javax.swing.JLabel colorInicialLabel;
    private javax.swing.JPanel colorInicioPanel;
    private javax.swing.JLabel greenFinalLabel;
    private javax.swing.JLabel greenFinalValor;
    private javax.swing.JLabel greenInicialLabel;
    private javax.swing.JLabel greenInicialValor;
    private javax.swing.JSlider greenSliderFinal;
    private javax.swing.JSlider greenSliderInicial;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel redFinalLabel;
    private javax.swing.JLabel redFinalValor;
    private javax.swing.JLabel redInicialLabel;
    private javax.swing.JLabel redInicialValor;
    private javax.swing.JSlider redSliderFinal;
    private javax.swing.JSlider redSliderInicial;
    private javax.swing.JLabel segmentosLabel;
    private javax.swing.JPanel segmentosPanel;
    private javax.swing.JSlider segmentosSilder;
    // End of variables declaration//GEN-END:variables
}
