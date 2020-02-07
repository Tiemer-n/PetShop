/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Isaac
 */
public class Adopt extends javax.swing.JFrame {

    /**
     * Creates new form Adopt
     */
    public Adopt() {
        initComponents();
    }
    private String animal;
    
    private ArrayList <String> names = new ArrayList<>();
    private ArrayList <String> age = new ArrayList<>();
    private ArrayList <String> breed = new ArrayList<>();
    private ArrayList <String> description = new ArrayList<>();
    
    public void setAnimal(String Animal){
        this.animal = Animal;
        File dirl = null;
        if(Animal.equals("cat")){
            top.setText("Adopting a Cat:");
            AdoptThisAnimal.setText("Adopt this cat");
            dirl = new File("res/Cats.txt");
        }else if(Animal.equals("dog")){
            top.setText("Adopting a dog");
            AdoptThisAnimal.setText("Adopt this dog");
            dirl = new File("res/Dogs.txt");
        }else if(Animal.equals("rabbit")){
            top.setText("Adopting a Rabbit:");
            AdoptThisAnimal.setText("Adopt this rabbit");
            dirl = new File("res/Rabbits.txt");
        }
        
        Scanner read = null;
        try{
             read = new Scanner(dirl);
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        ArrayList a = new ArrayList<>();
        while(read.hasNextLine()){
            a.add(read.next());
        }
        
        int length = a.size()/4;
        String[][] Store = new String[4][length];
        
        int arf = 0;
        for (int i = 0; i < a.size(); i+=4 ) {
            names.add((String)a.get(i));
            age.add((String)a.get(i+1));
            breed.add((String)a.get(i+2)); 
            description.add((String)a.get(i+3));
            arf++;
        }
        
        String[] names1 = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            names1[i] = names.get(i);
        }
        
        DefaultComboBoxModel model = new DefaultComboBoxModel( names1 );
        AnimalNames.setModel( model );
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JLabel();
        AnimalNames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Breed = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AdoptThisAnimal = new javax.swing.JToggleButton();
        Cancel = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        top.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        top.setText("Adopting a (animal)");

        AnimalNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AnimalNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalNamesActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        Age.setText("__");

        jLabel3.setText("Breed: ");

        Breed.setText("__");

        jLabel4.setText("Description:");

        AdoptThisAnimal.setText("Adopt this (animal)");
        AdoptThisAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptThisAnimalActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(Description);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AdoptThisAnimal)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(AnimalNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Age)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Breed))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Age)
                    .addComponent(jLabel3)
                    .addComponent(Breed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(AnimalNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AdoptThisAnimal))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnimalNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalNamesActionPerformed
        // TODO add your handling code here:
        Description.setText(null);
        int index = names.indexOf(AnimalNames.getSelectedItem().toString());
        
        Age.setText(age.get(index));
        String breed1 = breed.get(index);
        String replaceAll = breed1.replaceAll("_", " ");
        Breed.setText(replaceAll);
        String description1 = description.get(index);
        String replaceAll1 = description1.replaceAll("_", " ");
        Description.setText(replaceAll1);
        
        
        
        System.out.println(AnimalNames.getSelectedItem().toString());
    }//GEN-LAST:event_AnimalNamesActionPerformed

    private void AdoptThisAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptThisAnimalActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        //set the code then dispose here
        Shop shop = new Shop();
        shop.disableButtons(animal);
        setVisible(false);
        this.dispose();
        shop.show();
        
        
    }//GEN-LAST:event_AdoptThisAnimalActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        Shop shop = new Shop();
        setVisible(false);
        this.dispose();
        shop.show();
        
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adopt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AdoptThisAnimal;
    private javax.swing.JLabel Age;
    private javax.swing.JComboBox<String> AnimalNames;
    private javax.swing.JLabel Breed;
    private javax.swing.JToggleButton Cancel;
    private javax.swing.JTextPane Description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel top;
    // End of variables declaration//GEN-END:variables
}