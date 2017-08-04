
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * @author Virgo
 */
public class AddQuestion extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form AddQuestion
     */
    public AddQuestion() {
        super("Thêm câu hỏi");
        this.setLocationRelativeTo(null);
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

        jLabel1 = new javax.swing.JLabel();
        lbLevel = new javax.swing.JLabel();
        lbQuestion = new javax.swing.JLabel();
        lbAnswerA = new javax.swing.JLabel();
        lbAnswerB = new javax.swing.JLabel();
        lbAnswerC = new javax.swing.JLabel();
        lbAnswerD = new javax.swing.JLabel();
        lbAnswerTrue = new javax.swing.JLabel();
        TextLevel = new javax.swing.JTextField();
        TextQuestion = new javax.swing.JTextField();
        TextAnswerA = new javax.swing.JTextField();
        TextAnswerB = new javax.swing.JTextField();
        TextAnswerC = new javax.swing.JTextField();
        TextAnswerD = new javax.swing.JTextField();
        TextAnswerTrue = new javax.swing.JTextField();
        ButtonAdd = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 360));

        jLabel1.setText("Thêm câu hỏi");

        lbLevel.setText("Cấp độ");

        lbQuestion.setText("Câu hỏi");

        lbAnswerA.setText("Đáp án A");

        lbAnswerB.setText("Đáp án B");

        lbAnswerC.setText("Đáp án C");

        lbAnswerD.setText("Đáp án D");

        lbAnswerTrue.setText("Đáp án đúng");

        TextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextQuestionActionPerformed(evt);
            }
        });

        ButtonAdd.setText("Thêm");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        ButtonClear.setText("Làm lại");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Hủy");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLevel)
                    .addComponent(lbQuestion)
                    .addComponent(lbAnswerA)
                    .addComponent(lbAnswerB)
                    .addComponent(lbAnswerC)
                    .addComponent(lbAnswerD)
                    .addComponent(lbAnswerTrue))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextLevel)
                    .addComponent(TextQuestion)
                    .addComponent(TextAnswerA)
                    .addComponent(TextAnswerB)
                    .addComponent(TextAnswerC)
                    .addComponent(TextAnswerD)
                    .addComponent(TextAnswerTrue, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLevel)
                    .addComponent(TextLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuestion)
                    .addComponent(TextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnswerA)
                    .addComponent(TextAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnswerB)
                    .addComponent(TextAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnswerC)
                    .addComponent(TextAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnswerD)
                    .addComponent(TextAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnswerTrue)
                    .addComponent(TextAnswerTrue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextQuestionActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        conn= MySqlConnect.ConnectDB();
        String Sql = "INSERT INTO `questions`(`Level`, `Question`, `A`, `B`, `C`, `D`, `Answer True`) "
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(Sql);
            pst.setInt(1, Integer.parseInt(TextLevel.getText()));
            pst.setString(2, TextQuestion.getText());
            pst.setString(3, TextAnswerA.getText());
            pst.setString(4, TextAnswerB.getText());
            pst.setString(5, TextAnswerC.getText());
            pst.setString(6, TextAnswerD.getText());
            pst.setString(7, TextAnswerTrue.getText());
            int x = pst.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        TextLevel.setText("");
        TextQuestion.setText("");
        TextAnswerA.setText("");
        TextAnswerB.setText("");
        TextAnswerC.setText("");
        TextAnswerD.setText("");
        TextAnswerTrue.setText("");
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JTextField TextAnswerA;
    private javax.swing.JTextField TextAnswerB;
    private javax.swing.JTextField TextAnswerC;
    private javax.swing.JTextField TextAnswerD;
    private javax.swing.JTextField TextAnswerTrue;
    private javax.swing.JTextField TextLevel;
    private javax.swing.JTextField TextQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAnswerA;
    private javax.swing.JLabel lbAnswerB;
    private javax.swing.JLabel lbAnswerC;
    private javax.swing.JLabel lbAnswerD;
    private javax.swing.JLabel lbAnswerTrue;
    private javax.swing.JLabel lbLevel;
    private javax.swing.JLabel lbQuestion;
    // End of variables declaration//GEN-END:variables
}
