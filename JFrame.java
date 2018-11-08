import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Locale;

import java.util.ResourceBundle;

public class JFrame extends javax.swing.JFrame {
    
    public String input="English";
	public String lang, country;
    public JFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	    
            lang=Locale.getDefault().toString().substring(0, 2);
        country=Locale.getDefault().toString().substring(3, 5);
        Locale l = new Locale(lang, country);
        
        ResourceBundle r = ResourceBundle.getBundle("language",l);
        
        String[] choices = { "Romana", "English", "French", "Deutsch", "Greek","Italian" };
        input = (String) JOptionPane.showInputDialog(null, r.getString("c"),
        r.getString("cc")+"...", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
            choices, // Array of choices
            choices[1]); // Initial choice
         
    if(input=="English"){  
        lang="en"; country="US";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input);

    }
    if(input=="Romana"){  
        lang="ro"; country="RO";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input);
    }
    if(input=="French"){  
        lang="fr"; country="FR";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input);
    }
    if(input=="Deutsch"){
        lang="de"; country="DE";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input);
    }
    if(input=="Greek"){
        lang="el"; country="GR";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input); 
    }
    if(input=="Italian"){
        lang="it"; country="IT";
        l = new Locale(lang, country);
        r = ResourceBundle.getBundle("language",l);
        System.out.println(input);         
    }
    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("DOM XML Parser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(127, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jMenu1.setText("File");

        jMenuItem6.setText("Refresh");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Language");

        jMenuItem1.setText("Romana");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("English");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("French");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Deutsch");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Greek");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem8.setText("Italian");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "XML File", "xml");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    System.out.println("returned value: "+returnVal);
    if (returnVal == 0){
    try {

	File fXmlFile = new File(chooser.getSelectedFile().getPath());
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
			
	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("staff");
			
	System.out.println("----------------------------");
        
        String sss="";

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("Staff id : " + eElement.getAttribute("id"));
			System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
			System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
			System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                        sss+="Staff id : " + eElement.getAttribute("id")+"\n"+
                                "First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent()+"\n"+
                                "Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent()+"\n"+
                                "Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent()+"\n\n"
                                ;

		}
                jTextArea1.setText(sss);
	}
    } catch (Exception e) {
	e.printStackTrace();
        //System.out.println(e);
    }
    }
    else{
        System.out.println("You choosed nothing, so...");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="ro"; country="RO";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);

    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="en"; country="US";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="fr"; country="FR";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="de"; country="DE";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="el"; country="GR";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lang="it"; country="IT";
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("language",l);        

    jMenu1.setText(r.getString("f"));
    jMenuItem6.setText(r.getString("r"));
    jMenuItem7.setText(r.getString("ex"));
    jMenu2.setText(r.getString("e"));
    jMenu3.setText(r.getString("l"));
    jMenuItem1.setText(r.getString("ro"));
    jMenuItem2.setText(r.getString("en"));
    jMenuItem3.setText(r.getString("fr"));
    jMenuItem4.setText(r.getString("ge"));
    jMenuItem5.setText(r.getString("gr"));
    jMenuItem8.setText(r.getString("it"));
    jTabbedPane1.addTab(r.getString("t1"), jPanel1);
    jTabbedPane1.addTab(r.getString("t2"), jPanel2);
    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        this.setVisible(false);
        JFrame a = new JFrame();
        a.setVisible(true);
    } 

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
