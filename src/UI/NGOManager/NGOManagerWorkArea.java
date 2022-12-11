/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NGOManager;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NGOWorkReq;
import Business.WorkQueue.VictimWorkReq;
import Business.WorkQueue.WorkReq;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ymayank97
 */
public class NGOManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private Date d;
    private SimpleDateFormat s;
    public NGOManagerWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        d = new Date();
        s = new SimpleDateFormat("MM/dd/YY");
        populateTableEvent();
        populateTableWorkQueue();
    }
    //populate assigned NGO request
    public void populateTableEvent()
    {
         DefaultTableModel model = (DefaultTableModel) tblNgoEvents.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkReq){ 
            Object[] row = new Object[10];
            row[0] = work;
            row[1] = ((NGOWorkReq) work).getDescription();
            row[2] =  work.getRequestDate();
            row[3] = ((NGOWorkReq) work).getLocation();
            row[4] = ((NGOWorkReq) work).getvRequired();
            row[5] = ((NGOWorkReq) work).getvAcquired();
            
            model.addRow(row);
           }
        }
    }
    //populate victim request to NGO
    public void populateTableWorkQueue(){
         DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : system.getWorkQueue().getWorkRequestList()){
           if(work instanceof VictimWorkReq){
               if((work.getStatus().equalsIgnoreCase("Assigned To NGO"))||(work.getStatus().equalsIgnoreCase("NGO ASSIGNED the Request"))){
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getEmployeeName();
            row[1] = work.getSubject();
            row[2] = ((VictimWorkReq) work).getDescription();
            row[3] = ((VictimWorkReq) work).getLocation();
            row[4] = work.getRequestDate();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
           }
        }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNgoEvents = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtVolunteers = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        txtTitle = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        btnRequest = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(243, 235, 255));

        jPanel2.setBackground(new java.awt.Color(113, 88, 205));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contractor Manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1895, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        tblNgoEvents.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblNgoEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work Title", "Description", "Date", "Location", "Workers Required", "Workers acquired"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNgoEvents);

        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(153, 0, 153));
        btnAssign.setText("Undertake");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(153, 0, 153));
        btnComplete.setText("Mark Completed");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Pending Tasks");

        tblRequests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Description", "Location", "Date", "Status", "Change Maker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequests.setOpaque(false);
        jScrollPane3.setViewportView(tblRequests);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Create Work Request", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel3.setOpaque(false);

        txtVolunteers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVolunteers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVolunteersKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Numbers of Workers");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Description");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Date");

        txtLocation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Work Title");

        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(153, 0, 153));
        btnCreate.setText("Create Work Request");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Location");

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(192, 192, 192)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Procure Raw Materials", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel4.setOpaque(false);

        btnRequest.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(153, 0, 153));
        btnRequest.setText("Order Now");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        btnAnalysis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAnalysis.setForeground(new java.awt.Color(153, 0, 153));
        btnAnalysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/NGOManager/research (1).png"))); // NOI18N
        btnAnalysis.setText("Worker Stats");
        btnAnalysis.setBorderPainted(false);
        btnAnalysis.setContentAreaFilled(false);
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalysis)
                        .addGap(165, 165, 165)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //volunteer analysis graph
    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        DefaultCategoryDataset d = new DefaultCategoryDataset();

        for (WorkReq work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkReq)
           {
            
               d.setValue(((NGOWorkReq) work).getvAcquired(),"Event List",((NGOWorkReq) work).getTitle());
             
        }
        }
           
           JFreeChart chart = ChartFactory.createBarChart("Volunteers Acquired", "Event Name", "Volunteers Participated", d, PlotOrientation.VERTICAL, false, true, false);
           CategoryPlot p = chart.getCategoryPlot();
           p.setRangeGridlinePaint(Color.black);
           ChartFrame f = new ChartFrame("Volunteer Analysis",chart);
           f.setVisible(true);
           f.setSize(500,400);
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed
    //create request for volunteers
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       try{
        if(txtTitle.getText().isEmpty() || txtDesc.getText().isEmpty() || txtLocation.getText().isEmpty() || txtVolunteers.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill the Empty fields");
        }else{

        String event = txtTitle.getText();
        String desp = txtDesc.getText();
        String location = txtLocation.getText();
        Date date = dateChooser.getDate();
        Date curDate = new Date();

        Date d1 = null,d2 = null;
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        String s3 = sdformat.format(date);
        String s4 = sdformat.format(curDate);
            try {
                d1 = sdformat.parse(s3);
                d2 = sdformat.parse(s4);
            } catch (ParseException ex) {
                Logger.getLogger(NGOManagerWorkArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(d1.compareTo(d2) < 0 ){
            JOptionPane.showMessageDialog(null, "Past dates are not allowed");
            return;

        }
        int req = Integer.parseInt(txtVolunteers.getText());
        
        if(event.equals("") || event.isEmpty() && desp.equals("") || desp.isEmpty() && location.equals("")|| location.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter valid request");
            return;
        }
        
        NGOWorkReq reqst = new NGOWorkReq();
        reqst.setTitle(event);
        reqst.setDescription(desp);
        reqst.setLocation(location);
        reqst.setvRequired(req);
        reqst.setRequestDate(date);

        organization.getWorkQueue().getWorkRequestList().add(reqst);
        account.getWorkQueue().getWorkRequestList().add(reqst);
        system.getWorkQueue().getWorkRequestList().add(reqst);
        populateTableEvent();
        
        txtTitle.setText("");
        txtDesc.setText("");
        txtLocation.setText("");
        dateChooser.setCalendar(null);
        txtVolunteers.setText("");
        }
        }catch(NumberFormatException e){}
    }//GEN-LAST:event_btnCreateActionPerformed
    //assign the request to myself i.e NGO
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblRequests.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
         
        else {
            VictimWorkReq cswr = (VictimWorkReq) tblRequests.getValueAt(selectedRow, 5);

            if(cswr.getStatus().equalsIgnoreCase("Assigned to NGO")){
            cswr.setStatus("NGO Assigned the Request");
            cswr.setReciever(account);

            populateTableWorkQueue();
            }
            else{
                 JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed
    //complete the request
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int selectedRow = tblRequests.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else {

            VictimWorkReq p = (VictimWorkReq) tblRequests.getValueAt(selectedRow, 5);
            if(p.getStatus().equalsIgnoreCase("NGO Assigned the Request")){
                    p.setStatus("Complete");
                    p.setReciever(account);
                    JOptionPane.showMessageDialog(null, "You have completed the request successfully");
                    populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed
    //request for supplies
    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        SupplyRequest sr = new SupplyRequest(userProcessContainer,account,organization, enterprise,system);
        userProcessContainer.add("ManageEmployee", sr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void txtVolunteersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolunteersKeyTyped
        // TODO add your handling code here:
        char typedVol = evt.getKeyChar();
        if(!Character.isDigit(typedVol)){
            evt.consume();
        }
        //Restrict the length to 3 
        if(txtVolunteers.getText().length() > 2){
                evt.consume();
        }
    }//GEN-LAST:event_txtVolunteersKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRequest;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblNgoEvents;
    private javax.swing.JTable tblRequests;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtVolunteers;
    // End of variables declaration//GEN-END:variables
}
