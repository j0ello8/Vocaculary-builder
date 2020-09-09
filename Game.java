/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author BOUJIQUE
 */
public class Game extends javax.swing.JFrame {

   Game1 G1 = new Game1();
   Game1 G2 = new Game1();
   String[] wordlist = new String[5];
   String[] anslist = new String[5];
   String[] printoptions = new String[4];
   String level = "", info = "";
   static String filepath = "C:\\Users\\BOUJIQUE\\Desktop\\Java\\WordGame.txt";
   int i = -1, count = 0, rounds = 0, j, count2 = 0, rounds2 = 0;
    
   // Initialising words and options for level 1.
   Game1 initialiseLevel1(){
       G1.words = new String[]{"bevy","prudence","demise","havoc","tenure","accolade","paramount","praised","colosal","eloquent","precipitate","perverse","formidable","reverie","deft"};
       G1.answers = new String[]{"group","wisdom","death","confusion","term","distinction","supreme","vaunted","gigantic","admirable","hasty","improper","impressive","daydreaming","skillful"};
       G1.optionlist = new String[]{"separated","episode","improper","revenge","careful","poisonous","naughty","imagine",
                                    "menacing","cancel","abridge","familiarity","guilty","frown","lazy","peaceful","underestimate",
                                    "flawless","flexibilty","destruction","overcome","relish","defeated","pleased","hold"};
       return G1;
    }
   // Initialising words and options for level 2.
   Game1 initialiseLevel2(){
       G2.words = new String[]{"albeit","ennui","confabulate","pastiche","otiose","inherent","somnolent","analogous","consecutive","petulant","imminent","exuberant","blandish","beachhead","revelry"};
       G2.answers = new String[]{"although","boredom","chat","collage","useless","natural","drowsy","comparable","successive","young","threatening","spirited","charm","foothold","merrymaking"};
       G2.optionlist = new String[]{"invent"," wait","stick","surly","obtuse","remedial","humility","patronize","cranky","grouchy","explanatory",
                                    "surmise","elated","shortsighted","fool","enumerate","quarantine","reveal","flexible","grateful","daydream",
                                    "surprised","mundane","resort","malicious","steady"};
       return G2;
    }
 
  //create a new list model for Jlist
   static DefaultListModel<String> listModel = new DefaultListModel<>();
   static DefaultListModel<String> listModel1 = new DefaultListModel<>();
   static DefaultListModel<String> listModel2 = new DefaultListModel<>();
   
   int readCount(){
       int count1 = 0;
        try{
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        //System.out.println(sc.nextLine());
        info = sc.nextLine();
        System.out.println(info);
        count1 = Integer.parseInt(info);
        sc.close();
        }catch(Exception e){ 
            System.out.println(" Error! ");
        }
        return count1;
   }
    
    int[] RandomSel(int size, int n){
          ArrayList<Integer> a = new ArrayList<>(n);  // Creating an arraylist a.
          for(int i=0; i<n;i++){
         a.add(i);
        }
        int[] b = new int[size];
        for(int count = 0; count < size; count++){
            b[count] = a.remove((int)(Math.random() * a.size()));
        }
        return b;
      }
    
      void playGame(Game1 level){
       if(level == G1)
        wordFrame.setVisible(true);   
       else
        wordFrame1.setVisible(true);
       
       i++;
       if(level == G1)
        wordField.setText(wordlist[i]);
       else
        wordField1.setText(wordlist[i]); 
       
       int []randlist = RandomSel(3,25);
        for(int j=0;j<3;j++)
	{
	 printoptions[j] = level.optionlist[randlist[j]];
	}
         //inserting the actual answer at a varied location in the array printlist at any one time.
	int select = new Random().nextInt(4);
	if(select == 3)
	{
            printoptions[select] = anslist[i];	
	}
	else
	{
            String tmp = printoptions[select];
            printoptions[select] = anslist[i];
            printoptions[3] = tmp;
	} 
        //print word options.
        for(int x=0;x<4;x++){
            listModel.addElement(printoptions[x]);
            listModel.addElement("");
            //System.out.println(x+1 + " : " + printoptions[x]);
        }   
       listModel1.addElement(wordlist[i]);
       listModel1.addElement("");
       
       listModel2.addElement(anslist[i]);
       listModel2.addElement("");
    } 
      
    public Game() {
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

        wordFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        optionJlist = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        wordField = new javax.swing.JTextField();
        verifybtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        resultsFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        replaybtn1 = new javax.swing.JButton();
        nextLevelbtn1 = new javax.swing.JButton();
        exitbtn1 = new javax.swing.JButton();
        scoreField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        scoreField2 = new javax.swing.JTextField();
        reviewAnswersbtn = new javax.swing.JButton();
        wordFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        optionJlist1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        wordField1 = new javax.swing.JTextField();
        verifybtn2 = new javax.swing.JButton();
        cancelbtn2 = new javax.swing.JButton();
        reviewAnswersFrame = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewJlist = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        reviewJlist1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lightbtn = new javax.swing.JButton();
        mediumbtn = new javax.swing.JButton();
        hardbtn = new javax.swing.JButton();
        topPlayerbtn = new javax.swing.JButton();

        wordFrame.setSize(new java.awt.Dimension(449, 519));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        optionJlist.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        optionJlist.setForeground(new java.awt.Color(23, 23, 79));
        optionJlist.setModel(listModel);
        optionJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        optionJlist.setAlignmentX(5.0F);
        optionJlist.setAlignmentY(3.0F);
        optionJlist.setSelectionBackground(new java.awt.Color(255, 255, 255));
        optionJlist.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(optionJlist);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 23, 79));
        jLabel4.setText("Select the best synonym for the word");

        wordField.setEditable(false);
        wordField.setBackground(new java.awt.Color(255, 255, 255));
        wordField.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        wordField.setForeground(new java.awt.Color(23, 23, 79));
        wordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        verifybtn.setBackground(new java.awt.Color(40, 59, 97));
        verifybtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        verifybtn.setForeground(new java.awt.Color(255, 255, 255));
        verifybtn.setText("Verify");
        verifybtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        verifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(40, 59, 97));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout wordFrameLayout = new javax.swing.GroupLayout(wordFrame.getContentPane());
        wordFrame.getContentPane().setLayout(wordFrameLayout);
        wordFrameLayout.setHorizontalGroup(
            wordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wordFrameLayout.setVerticalGroup(
            wordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        resultsFrame.setBackground(new java.awt.Color(255, 255, 255));
        resultsFrame.setSize(new java.awt.Dimension(380, 533));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 68, 113));
        jLabel5.setText("Score");

        replaybtn1.setBackground(new java.awt.Color(255, 255, 255));
        replaybtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        replaybtn1.setForeground(new java.awt.Color(135, 24, 46));
        replaybtn1.setText("Replay Quiz");
        replaybtn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        replaybtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaybtn1ActionPerformed(evt);
            }
        });

        nextLevelbtn1.setBackground(new java.awt.Color(255, 255, 255));
        nextLevelbtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nextLevelbtn1.setForeground(new java.awt.Color(135, 24, 46));
        nextLevelbtn1.setText("Next Level");
        nextLevelbtn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nextLevelbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelbtn1ActionPerformed(evt);
            }
        });

        exitbtn1.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exitbtn1.setForeground(new java.awt.Color(135, 24, 46));
        exitbtn1.setText("Exit Quiz");
        exitbtn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn1ActionPerformed(evt);
            }
        });

        scoreField1.setEditable(false);
        scoreField1.setBackground(new java.awt.Color(255, 255, 255));
        scoreField1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        scoreField1.setForeground(new java.awt.Color(190, 17, 60));
        scoreField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText(" of");

        scoreField2.setEditable(false);
        scoreField2.setBackground(new java.awt.Color(255, 255, 255));
        scoreField2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        scoreField2.setForeground(new java.awt.Color(190, 17, 60));
        scoreField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        reviewAnswersbtn.setBackground(new java.awt.Color(255, 255, 255));
        reviewAnswersbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reviewAnswersbtn.setForeground(new java.awt.Color(135, 24, 46));
        reviewAnswersbtn.setText("Review Answers");
        reviewAnswersbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reviewAnswersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewAnswersbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextLevelbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaybtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reviewAnswersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(scoreField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scoreField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreField1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(scoreField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(reviewAnswersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(replaybtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextLevelbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout resultsFrameLayout = new javax.swing.GroupLayout(resultsFrame.getContentPane());
        resultsFrame.getContentPane().setLayout(resultsFrameLayout);
        resultsFrameLayout.setHorizontalGroup(
            resultsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        resultsFrameLayout.setVerticalGroup(
            resultsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        wordFrame1.setBounds(new java.awt.Rectangle(40, 40, 40, 40));
        wordFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wordFrame1.setLocation(new java.awt.Point(50, 50));
        wordFrame1.setLocationByPlatform(true);
        wordFrame1.setSize(new java.awt.Dimension(420, 519));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        optionJlist1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        optionJlist1.setForeground(new java.awt.Color(23, 23, 79));
        optionJlist1.setModel(listModel);
        optionJlist1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        optionJlist1.setAlignmentX(5.0F);
        optionJlist1.setAlignmentY(3.0F);
        optionJlist1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        optionJlist1.setValueIsAdjusting(true);
        jScrollPane2.setViewportView(optionJlist1);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(23, 23, 79));
        jLabel7.setText("Select the best synonym for the word");

        wordField1.setEditable(false);
        wordField1.setBackground(new java.awt.Color(255, 255, 255));
        wordField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        wordField1.setForeground(new java.awt.Color(23, 23, 79));
        wordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        verifybtn2.setBackground(new java.awt.Color(40, 59, 97));
        verifybtn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        verifybtn2.setForeground(new java.awt.Color(255, 255, 255));
        verifybtn2.setText("Verify");
        verifybtn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        verifybtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybtn2ActionPerformed(evt);
            }
        });

        cancelbtn2.setBackground(new java.awt.Color(40, 59, 97));
        cancelbtn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelbtn2.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn2.setText("Cancel");
        cancelbtn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifybtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(wordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifybtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout wordFrame1Layout = new javax.swing.GroupLayout(wordFrame1.getContentPane());
        wordFrame1.getContentPane().setLayout(wordFrame1Layout);
        wordFrame1Layout.setHorizontalGroup(
            wordFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wordFrame1Layout.setVerticalGroup(
            wordFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        reviewAnswersFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        reviewAnswersFrame.setLocation(new java.awt.Point(20, 20));
        reviewAnswersFrame.setSize(new java.awt.Dimension(386, 483));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 23, 43));
        jLabel8.setText("Review");

        reviewJlist.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reviewJlist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reviewJlist.setForeground(new java.awt.Color(153, 0, 51));
        reviewJlist.setModel(listModel1);
        jScrollPane3.setViewportView(reviewJlist);

        reviewJlist1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reviewJlist1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reviewJlist1.setForeground(new java.awt.Color(153, 0, 51));
        reviewJlist1.setModel(listModel2);
        jScrollPane4.setViewportView(reviewJlist1);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 57, 113));
        jLabel9.setText("Words");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 57, 113));
        jLabel10.setText("Answers");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(jLabel10))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout reviewAnswersFrameLayout = new javax.swing.GroupLayout(reviewAnswersFrame.getContentPane());
        reviewAnswersFrame.getContentPane().setLayout(reviewAnswersFrameLayout);
        reviewAnswersFrameLayout.setHorizontalGroup(
            reviewAnswersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        reviewAnswersFrameLayout.setVerticalGroup(
            reviewAnswersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Game");
        setBounds(new java.awt.Rectangle(50, 50, 50, 50));
        setFocusTraversalPolicyProvider(true);

        jPanel1.setBackground(new java.awt.Color(32, 66, 98));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOW STRONG");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 95, 182));
        jLabel2.setText("IS YOUR");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VOCABULARY?");

        lightbtn.setBackground(new java.awt.Color(255, 255, 255));
        lightbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lightbtn.setForeground(new java.awt.Color(17, 47, 106));
        lightbtn.setText("LIGHT");
        lightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightbtnActionPerformed(evt);
            }
        });

        mediumbtn.setBackground(new java.awt.Color(255, 255, 255));
        mediumbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mediumbtn.setForeground(new java.awt.Color(17, 47, 106));
        mediumbtn.setText("MEDIUM");
        mediumbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumbtnActionPerformed(evt);
            }
        });

        hardbtn.setBackground(new java.awt.Color(255, 255, 255));
        hardbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hardbtn.setForeground(new java.awt.Color(17, 47, 106));
        hardbtn.setText("HARD");
        hardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardbtnActionPerformed(evt);
            }
        });

        topPlayerbtn.setBackground(new java.awt.Color(255, 255, 255));
        topPlayerbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        topPlayerbtn.setForeground(new java.awt.Color(17, 47, 106));
        topPlayerbtn.setText("TOP PLAYER");
        topPlayerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topPlayerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lightbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mediumbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hardbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topPlayerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(lightbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(mediumbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(hardbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(topPlayerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightbtnActionPerformed
       Game1 G = initialiseLevel1();
       int []ranlist = RandomSel(5,15);
       for(int r=0;r<5;r++){
           wordlist[r] = G.words[ranlist[r]];
           anslist[r] = G.answers[ranlist[r]];
       }
       level = "light";
       count = 0; rounds = 0; i = -1;
       listModel.removeAllElements();
       listModel1.removeAllElements();
       listModel2.removeAllElements();
       playGame(G);
       rounds++;
       this.setVisible(false);
    }//GEN-LAST:event_lightbtnActionPerformed

    private void verifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybtnActionPerformed
        Game1 G = initialiseLevel1();
        level = "light";
        String user = optionJlist.getSelectedValue();
        if(user == null){
            JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(user.equals(anslist[i])){
            //JOptionPane.showMessageDialog(null,"Correct Anwer","Result",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Correct Answer");
            count++;  
        }
        else{   
            //System.out.println(" Wrong answer! " + anslist[i] + " is the right synonym. ");
            JOptionPane.showMessageDialog(null,"Wrong Anwer," + anslist[i] + " is the right Synonym", "Result",JOptionPane.INFORMATION_MESSAGE);
        }
        listModel.removeAllElements();
        //listModel1.removeAllElements(); 
        if(rounds == 5){ 
          wordFrame.dispose();
          resultsFrame.setVisible(true);
          scoreField1.setText(String.valueOf(count));
          scoreField2.setText("5");
          
        if(count == 5){
          try{
           Formatter f = new Formatter(filepath);
           f.format("%s", String.valueOf(count));
           f.close();
          }catch(Exception e){
            System.out.println("Error");
          }
         }
       }
        else{
        playGame(G);
        rounds++;
       } 
    }//GEN-LAST:event_verifybtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        wordFrame.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn1ActionPerformed
       resultsFrame.setVisible(false);
       this.setVisible(true);
    }//GEN-LAST:event_exitbtn1ActionPerformed

    private void replaybtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaybtn1ActionPerformed
       Game1 G = initialiseLevel1();
       Game1 G3 = initialiseLevel2();
       
       resultsFrame.setVisible(false);
       count = 0; rounds = 0; i = -1;
       listModel.removeAllElements();
       listModel1.removeAllElements();
       listModel2.removeAllElements();
       
       if(level.equals("light")){
       int []ranlist = RandomSel(5,15);
       for(int r=0;r<5;r++){
           wordlist[r] = G.words[ranlist[r]];
           anslist[r] = G.answers[ranlist[r]];
       }
       playGame(G);
       rounds++;
       }
       else if(level.equals("medium")){
       int []ranlist = RandomSel(5,15);
       for(int r=0;r<5;r++){
           wordlist[r] = G3.words[ranlist[r]];
           anslist[r] = G3.answers[ranlist[r]];
       }
       playGame(G3);
       rounds++;
       }   
    }//GEN-LAST:event_replaybtn1ActionPerformed

    private void nextLevelbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelbtn1ActionPerformed
       int count1 = readCount();
       Game1 G3 = initialiseLevel2();
       if(count1 < 5){
          JOptionPane.showMessageDialog(null,"Sorry, you need a complete score to unlock this level","Level not Unlocked",JOptionPane.INFORMATION_MESSAGE);
          //resultsFrame.setVisible(true);
       }
       else if(level.equals("light")){
       resultsFrame.setVisible(false);
       count = 0; rounds = 0; i = -1;
       listModel.removeAllElements();
       listModel1.removeAllElements();
       listModel2.removeAllElements();
       int []ranlist = RandomSel(5,15);
       for(int r=0;r<5;r++){
           wordlist[r] = G3.words[ranlist[r]];
           anslist[r] = G3.answers[ranlist[r]];
        }
       playGame(G3);
       rounds++;
       }
       else{
         JOptionPane.showMessageDialog(null, "Sorry,Level not available yet");  
       }
    }//GEN-LAST:event_nextLevelbtn1ActionPerformed

    private void verifybtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybtn2ActionPerformed
        Game1 G3 = initialiseLevel2();
        level = "medium";
        String user = optionJlist1.getSelectedValue();
        if(user == null){
            JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(user.equals(anslist[i])){
            //JOptionPane.showMessageDialog(null,"Correct Anwer","Result",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Correct Answer");
            count++;  
        }
        else{   
            System.out.println(" Wrong answer! " + anslist[i] + " is the right synonym. ");
            JOptionPane.showMessageDialog(null,"Wrong Anwer," + anslist[i] + " is the right Synonym", "Result",JOptionPane.INFORMATION_MESSAGE);
        }
        listModel.removeAllElements(); 
        if(rounds == 5){ 
            wordFrame1.dispose();
            resultsFrame.setVisible(true);
            scoreField1.setText(String.valueOf(count));
            scoreField2.setText("5");
          }
        else{
        playGame(G3);
        rounds++;
        }
    }//GEN-LAST:event_verifybtn2ActionPerformed

    private void cancelbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtn2ActionPerformed
        wordFrame1.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_cancelbtn2ActionPerformed

    private void mediumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumbtnActionPerformed
        int count1 = readCount();
        if(count1 == 5){
         this.setVisible(false);
         Game1 G3 = initialiseLevel2();
         int []ranlist = RandomSel(5,15);
         for(int r=0;r<5;r++){
           wordlist[r] = G3.words[ranlist[r]];
           anslist[r] = G3.answers[ranlist[r]];
        }
        level = "medium";
        count = 0; rounds = 0; i = -1;
        listModel.removeAllElements();
        listModel1.removeAllElements();
        listModel2.removeAllElements();
        playGame(G3);
        rounds++; 
        }
        else{
         JOptionPane.showMessageDialog(null, "Sorry, Level not Unlocked yet!"); 
        }
    }//GEN-LAST:event_mediumbtnActionPerformed

    private void hardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardbtnActionPerformed
        
        JOptionPane.showMessageDialog(null, "Sorry, Level not Available yet!");
    }//GEN-LAST:event_hardbtnActionPerformed

    private void topPlayerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topPlayerbtnActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, Level not Available yet!");
    }//GEN-LAST:event_topPlayerbtnActionPerformed

    private void reviewAnswersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewAnswersbtnActionPerformed
        reviewAnswersFrame.setVisible(true);
        resultsFrame.setVisible(false);
    }//GEN-LAST:event_reviewAnswersbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reviewAnswersFrame.setVisible(false);
        resultsFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn2;
    private javax.swing.JButton exitbtn1;
    private javax.swing.JButton hardbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton lightbtn;
    private javax.swing.JButton mediumbtn;
    private javax.swing.JButton nextLevelbtn1;
    private javax.swing.JList<String> optionJlist;
    private javax.swing.JList<String> optionJlist1;
    private javax.swing.JButton replaybtn1;
    private javax.swing.JFrame resultsFrame;
    private javax.swing.JFrame reviewAnswersFrame;
    private javax.swing.JButton reviewAnswersbtn;
    private javax.swing.JList<String> reviewJlist;
    private javax.swing.JList<String> reviewJlist1;
    private javax.swing.JTextField scoreField1;
    private javax.swing.JTextField scoreField2;
    private javax.swing.JButton topPlayerbtn;
    private javax.swing.JButton verifybtn;
    private javax.swing.JButton verifybtn2;
    private javax.swing.JTextField wordField;
    private javax.swing.JTextField wordField1;
    private javax.swing.JFrame wordFrame;
    private javax.swing.JFrame wordFrame1;
    // End of variables declaration//GEN-END:variables
}
