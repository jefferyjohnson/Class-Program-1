/****************************************************************************
*   addAssignmentForm.java                                                  *
*   Jeffery Johnson                                                         *
*   GEEN 165-002                                                            *
*   9/30/15                                                                 *
*                                                                           *
*   This class creates the form used to add assignments to the              *
*   studentAssignment object                                                *
*                                                                           *
****************************************************************************/
package gradetraker;

import javax.swing.JOptionPane;

public class AddAssignmentForm extends javax.swing.JDialog {
    
    private StudentAssignment studentAssingment;

    
    public AddAssignmentForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    } // end default constructor
    
    // constructor to which passes in the studentAssignment object
    public AddAssignmentForm(StudentAssignment studentAssignment)
    {
        initComponents();
        this.studentAssingment = studentAssignment;
    } // end construtor with studentAssignment object

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddPointsEarned = new javax.swing.JLabel();
        lblAddPointsAssigned = new javax.swing.JLabel();
        txtPointsEarned = new javax.swing.JTextField();
        txtPointsAssigned = new javax.swing.JTextField();
        btnAddAssignment = new javax.swing.JButton();
        lblAddAssignmentDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbAddAssignmentCategory = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAddPointsEarned.setText("Please enter points earned");

        lblAddPointsAssigned.setText("Please add points assigned");

        btnAddAssignment.setText("Add Assignment");
        btnAddAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAssignmentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Assignments");

        cmbAddAssignmentCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quizzes", "Exams", "Labs", "Programs", "Final Exam" }));

        jLabel2.setText("Select Category to add assignment to.");

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddAssignment)
                                    .addComponent(txtPointsEarned, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(lblAddAssignmentDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddPointsEarned, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddPointsAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPointsAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(cmbAddAssignmentCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDone)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbAddAssignmentCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddPointsEarned)
                            .addComponent(lblAddPointsAssigned))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPointsEarned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPointsAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddAssignment))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblAddAssignmentDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnDone)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // add assignment button
    private void btnAddAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAssignmentActionPerformed

        int categorySelection = cmbAddAssignmentCategory.getSelectedIndex();  // variable to hold the category selection
        try
        {
            int pointsEarned = Integer.parseInt(txtPointsEarned.getText());     // variable to hold pointsEarned from text field
            int pointsAssigned = Integer.parseInt(txtPointsAssigned.getText()); // variable to hold pointsAssigned from text field
            
            studentAssingment.getAssignCategories(categorySelection).addAssignment(new Assignment(pointsEarned,pointsAssigned));
            lblAddAssignmentDisplay.setText("Assignment Added");
            
            // reset text fields to empty
            txtPointsEarned.setText("");
            txtPointsAssigned.setText("");
        } // end try
        
        catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Input must be an integer", "ERROR", JOptionPane.ERROR_MESSAGE);
        } // end catch
        
    }//GEN-LAST:event_btnAddAssignmentActionPerformed

    // button to close AddAssignmentForm
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAssignment;
    private javax.swing.JButton btnDone;
    private javax.swing.JComboBox cmbAddAssignmentCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddAssignmentDisplay;
    private javax.swing.JLabel lblAddPointsAssigned;
    private javax.swing.JLabel lblAddPointsEarned;
    private javax.swing.JTextField txtPointsAssigned;
    private javax.swing.JTextField txtPointsEarned;
    // End of variables declaration//GEN-END:variables
} // end AddAssignmentForm
