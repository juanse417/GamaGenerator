/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamagenerator;

import java.awt.Color;
import java.awt.GridLayout;
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
        colorFinalPanel = new javax.swing.JPanel();
        colorFinalLabel = new javax.swing.JLabel();
        redFinalLabel = new javax.swing.JLabel();
        greenFinalLabel = new javax.swing.JLabel();
        blueFinalLabel = new javax.swing.JLabel();
        redSliderFinal = new javax.swing.JSlider();
        greenSliderFinal = new javax.swing.JSlider();
        blueSliderFinal = new javax.swing.JSlider();
        segmentosPanel = new javax.swing.JPanel();
        segmentosLabel = new javax.swing.JLabel();
        segmentosSilder = new javax.swing.JSlider();
        numeroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorInicialLabel.setText("Color Inicial");

        redInicialLabel.setText("Red");

        greenInicialLabel.setText("Green");

        blueInicialLabel.setText("Blue");

        redSliderInicial.setMaximum(255);

        greenSliderInicial.setMaximum(255);

        blueSliderInicial.setMaximum(255);

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
                            .addComponent(blueInicialLabel)
                            .addComponent(greenInicialLabel)
                            .addComponent(redInicialLabel)
                            .addComponent(colorInicialLabel)))
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
                .addComponent(redInicialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenInicialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueInicialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueSliderInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        colorFinalLabel.setText("Color Final");

        redFinalLabel.setText("Red");

        greenFinalLabel.setText("Green");

        blueFinalLabel.setText("Blue");

        redSliderFinal.setMaximum(255);

        greenSliderFinal.setMaximum(255);

        blueSliderFinal.setMaximum(255);

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
                            .addComponent(blueFinalLabel)
                            .addComponent(greenFinalLabel)
                            .addComponent(redFinalLabel)
                            .addComponent(colorFinalLabel)))
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
                .addComponent(redFinalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenFinalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueFinalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueSliderFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout segmentosPanelLayout = new javax.swing.GroupLayout(segmentosPanel);
        segmentosPanel.setLayout(segmentosPanelLayout);
        segmentosPanelLayout.setHorizontalGroup(
            segmentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        segmentosPanelLayout.setVerticalGroup(
            segmentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addGap(0, 11, Short.MAX_VALUE))
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
        System.out.println("Valor: " +segmentosSilder.getValue() );
        numeroLabel.setText(""+segmentosSilder.getValue());
        GridLayout segmentosLayout = new GridLayout(0,segmentosSilder.getValue());
        segmentosPanel.setLayout(segmentosLayout);
        Random r = new Random();
        
        for (int i =0;i<segmentosSilder.getValue() ;i++ ) {
            JPanel panel =  new JPanel();
            Color color = new Color(r.nextFloat(), r.nextFloat(), r.nextFloat());
            panel.setBackground(color);
            segmentosPanel.add(panel);  
        }
        
    }//GEN-LAST:event_segmentosSilderStateChanged

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueFinalLabel;
    private javax.swing.JLabel blueInicialLabel;
    private javax.swing.JSlider blueSliderFinal;
    private javax.swing.JSlider blueSliderInicial;
    private javax.swing.JLabel colorFinalLabel;
    private javax.swing.JPanel colorFinalPanel;
    private javax.swing.JLabel colorInicialLabel;
    private javax.swing.JPanel colorInicioPanel;
    private javax.swing.JLabel greenFinalLabel;
    private javax.swing.JLabel greenInicialLabel;
    private javax.swing.JSlider greenSliderFinal;
    private javax.swing.JSlider greenSliderInicial;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel redFinalLabel;
    private javax.swing.JLabel redInicialLabel;
    private javax.swing.JSlider redSliderFinal;
    private javax.swing.JSlider redSliderInicial;
    private javax.swing.JLabel segmentosLabel;
    private javax.swing.JPanel segmentosPanel;
    private javax.swing.JSlider segmentosSilder;
    // End of variables declaration//GEN-END:variables
}
