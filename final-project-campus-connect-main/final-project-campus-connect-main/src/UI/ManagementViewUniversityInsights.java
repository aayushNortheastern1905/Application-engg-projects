/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Owner;
import Business.OwnerDirectory;
import Business.Property;
import Business.University;
import Business.UniversityDirectory;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sawan
 */
public class ManagementViewUniversityInsights extends javax.swing.JPanel {
    
    private JPanel workArea;
    private UniversityDirectory universityDirectory;
    private University university;
   
    
    

    /**
     * Creates new form ManagementViewUniversityInsights
     */
    public ManagementViewUniversityInsights(JPanel workArea,UniversityDirectory universityDirectory, University university  ) {
        initComponents();
        this.workArea = workArea;
        this.universityDirectory = universityDirectory;
        this.university = university;
        populatePropertyTable();

        showPieChart();
    }
    
            Integer SumofgraduatedStudents =0;
        Integer SumofIncomingStudents =0 ;
        Integer SumofOncampusStudents = 0;
        Integer SumofOffcampusStudents =0;
          public void populatePropertyTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblUniversityData.getModel();
        dtm.setRowCount(0); 

        
        for(University university : universityDirectory.getUniversityDirectory()){
            
                  Object[] row = new Object[5];
                  int gradstudofauni = Integer.parseInt(university.getGraduatedStudents());
                  int incomingtudofauni = Integer.parseInt(university.getIncomingStudents());
                  int offcampustudofauni = Integer.parseInt(university.getOffCampusStudents());
                  int oncampustudofauni = Integer.parseInt(university.getOnCampusStudents());
                  
                 row[0] = university.getUniversityName();
                 row[1] = university.getGraduatedStudents();
                 row[2] = university.getIncomingStudents();
                 row[3] = university.getOnCampusStudents();
                 row[4] = university.getOffCampusStudents();
                SumofgraduatedStudents  =  SumofgraduatedStudents + gradstudofauni;
                SumofIncomingStudents = SumofIncomingStudents + incomingtudofauni;
                SumofOncampusStudents = SumofOncampusStudents + offcampustudofauni;
                SumofOffcampusStudents = SumofOffcampusStudents + oncampustudofauni;
                
                 dtm.addRow(row);
             }
        System.out.println(SumofgraduatedStudents);
    }
    
  
        
      
        public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      
      

      barDataset.setValue( "Graduated Students" , SumofgraduatedStudents );  
      barDataset.setValue( "Incoming Students" , SumofIncomingStudents );   
      barDataset.setValue( "On Campus Students" , SumofOncampusStudents );    
      barDataset.setValue( "Off CampusStudents" , SumofOffcampusStudents );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("University Student Insights",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("Graduated Students", new Color(255,255,102));
        piePlot.setSectionPaint("Incoming Students", new Color(102,255,102));
        piePlot.setSectionPaint("On Campus Students", new Color(255,102,153));
        piePlot.setSectionPaint("Off CampusStudents", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
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
        tblUniversityData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelBarChart = new javax.swing.JPanel();

        setBackground(new java.awt.Color(223, 223, 223));

        tblUniversityData.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        tblUniversityData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "University Name", "Graduating Students", "Incoming Students", "On Campus Students", "Off Campus Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUniversityData);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Insights");

        jButton1.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelBarChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JTable tblUniversityData;
    // End of variables declaration//GEN-END:variables
}
