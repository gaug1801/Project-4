
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author gabrielaugustin
 */
public class RecordLabelFrame extends javax.swing.JFrame {

    public enum Modes {
        NEW,
        UPDATE
    }
    
    
    public Modes mode = Modes.NEW;
    public Connection connection;

    public RecordLabelFrame() {
        initComponents();
        refresh();
        mode = Modes.NEW;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        recordLabelList = new javax.swing.JList<>();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        artist_id_label = new javax.swing.JLabel();
        artist_name_label = new javax.swing.JLabel();
        tLabel_id = new javax.swing.JTextField();
        tLabel_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recordLabelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        recordLabelList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                recordLabelListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(recordLabelList);

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Record Labels");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        artist_id_label.setText("ID");

        artist_name_label.setText("Name");

        tLabel_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLabel_idActionPerformed(evt);
            }
        });

        tLabel_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLabel_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(artist_id_label))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(artist_name_label)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tLabel_name)
                            .addComponent(tLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(artist_id_label)
                            .addComponent(tLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(artist_name_label)
                            .addComponent(tLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordLabelListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_recordLabelListValueChanged
        int index = recordLabelList.getSelectedIndex();
        System.out.println("Index Selected: " + index);
        String s = (String) recordLabelList.getSelectedValue();
        System.out.println("Value Selected: " + s);
        String[] parts = s.split("-");
        String ID = parts[0].trim();
        System.out.println("ID: " + ID);
        updateform(ID);
        mode = Modes.UPDATE;
        System.out.println("Mode: " + mode.toString());
    }//GEN-LAST:event_recordLabelListValueChanged

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        tLabel_id.setText("");
        tLabel_name.setText("");
        mode = Modes.NEW;
        System.out.println("Mode: " + mode.toString());
    }//GEN-LAST:event_newButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (mode == Modes.UPDATE) {
            int id = 0;
            id = Integer.parseInt(tLabel_id.getText());

            try {
                if (connect()) {
                    String query = "Delete from record_label where record_label_id=?";
                    PreparedStatement stmnt = connection.prepareStatement(query);
                    stmnt.setInt(1, id);
                    int row = stmnt.executeUpdate();
                    System.out.println("Rows affected:" + row); //1
                    JOptionPane.showMessageDialog(new JFrame(), "Deleted User: " + id + " from the Database");
                    connection.close();
                } else {
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error - could not connect to the database");
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Error - Update mode not selected");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int id = 0;

        try {
            id = Integer.parseInt(tLabel_id.getText());
            

            if (checkId(id)) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error - ID is not a number");
        }
        String _id = tLabel_id.getText();
        String _name = tLabel_name.getText();
        System.out.println("Id: " + id);

        if (mode == Modes.NEW) {
            System.out.println("Save " + mode.toString() + " mode");
            if (checkId(id)) {
                JOptionPane.showMessageDialog(new JFrame(), "Error - Record Label ID already exists. Choose new value.");
            } else {
                try {
                    if (connect()) {
                        String query = "Insert into record_label (record_label_id, record_label_name)"
                                + "values(?, ?)";
                        PreparedStatement stmnt = connection.prepareStatement(query);
                        stmnt.setInt(1, id);
                        stmnt.setString(2, _name);
                        

                        int row = stmnt.executeUpdate();
                        System.out.println("Rows affected:" + row); //1
                        JOptionPane.showMessageDialog(new JFrame(), "Added User: " + id + " - " + _name + " to the Database");
                        connection.close();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(new JFrame(), "Error! - could not connect to the database");
                }

            }

        } else if (mode == Modes.UPDATE) {
            System.out.println("Save " + mode.toString() + " mode");

            try {
                if (connect()) {
                    String query = "Update record_label set record_label_name=? where record_label_id=?";
                    PreparedStatement stmnt = connection.prepareStatement(query);

                    stmnt.setInt(2, id);
                    stmnt.setString(1, _name);

                    int row = stmnt.executeUpdate();
                    System.out.println("Rows affected:" + row); //1
                    JOptionPane.showMessageDialog(new JFrame(), "Updated User: " + _id + " - " + _name + " to the Database");
                    connection.close();
                } else {
                }

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(new JFrame(), "Error - could not connect to the database");
            }

        } else {
            System.out.println("No mode selected");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void tLabel_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLabel_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLabel_nameActionPerformed

    private void tLabel_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLabel_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLabel_idActionPerformed
    private boolean connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Team3Project", "root", "@Focus22!");
            return true;
        } catch (Exception e) {
            System.out.println("Error - database could not connect\n" + e.getMessage());
            return false;
        }

    }

    private boolean checkLabel(int id) {
        try {
            if (connect()) {
                String query = "select * from record_label where record_label_id =" + id;
                Statement sta = connection.createStatement();
                ResultSet rs = sta.executeQuery(query);
                if (!rs.next()) {
                    //no rows exist so return false;
                    connection.close();
                    return false;
                } else {
                    connection.close();
                    return true;
                }

            }
        } catch (Exception e) {
            System.out.println("Error connecting to the database\n" + e.getMessage());
            return true;
        }
        return true;
    }

    public void refresh() {
        try {
            if (connect()) {

                String query = "select * from record_label";

                Statement sta = connection.createStatement();
                ResultSet rs = sta.executeQuery(query);
                DefaultListModel listModel;
                listModel = new DefaultListModel();
                while (rs.next()) {
                    listModel.addElement(rs.getString("record_label_id") + " - " + rs.getString("record_label_name"));
                }
                recordLabelList.setModel(listModel);

                connection.close();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean checkId(int id) {
        try {
            if (connect()) {
                String query = "select * from record_label where record_label_id =" + id;
                Statement sta = connection.createStatement();
                ResultSet rs = sta.executeQuery(query);
                if (!rs.next()) {
                    //no rows exist so return false;
                    connection.close();
                    return false;
                } else {
                    connection.close();
                    return true;
                }

            }
        } catch (Exception e) {
            System.out.println("Error connecting to the database\n" + e.getMessage());
            return true;
        }
        return true;
    }

    
    public void updateform(String id) {
        try {
            if (connect()) {

                String query = "select * from record_label where record_label_id=" + id;

                Statement sta = connection.createStatement();
                ResultSet rs = sta.executeQuery(query);
                while (rs.next()) {
                    tLabel_id.setText(rs.getString("record_label_id"));
                    tLabel_name.setText(rs.getString("record_label_name"));
                }

                connection.close();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(RecordLabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordLabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordLabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordLabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordLabelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artist_id_label;
    private javax.swing.JLabel artist_name_label;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JList<String> recordLabelList;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tLabel_id;
    private javax.swing.JTextField tLabel_name;
    // End of variables declaration//GEN-END:variables
}
