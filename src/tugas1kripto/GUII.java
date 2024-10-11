package tugas1kripto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUII extends javax.swing.JFrame {

    public GUII() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tfKunci = new javax.swing.JTextField();
        btnEnkripsi = new javax.swing.JButton();
        btnDekripsi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInput = new javax.swing.JTextArea();
        cbCipher = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taHasilA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taHasilB = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnDownload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Kunci :");

        tfKunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKunciActionPerformed(evt);
            }
        });

        btnEnkripsi.setText("Enkripsi");
        btnEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnkripsiActionPerformed(evt);
            }
        });

        btnDekripsi.setText("Dekripsi");
        btnDekripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDekripsiActionPerformed(evt);
            }
        });

        taInput.setColumns(20);
        taInput.setRows(5);
        jScrollPane1.setViewportView(taInput);

        cbCipher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Cipher", "Vigenere Chiper standard", "Extended Vigenere Chiper", "Playfair Cipher", "Enigma Cipher", "One time Pad" }));
        cbCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCipherActionPerformed(evt);
            }
        });

        jLabel2.setText("Input Teks :");

        taHasilA.setColumns(20);
        taHasilA.setRows(5);
        jScrollPane2.setViewportView(taHasilA);

        jLabel3.setText("Hasil (tanpa spasi):");

        btnUpload.setText("Upload File");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnHapus.setText("Bersihkan");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        taHasilB.setColumns(20);
        taHasilB.setRows(5);
        jScrollPane3.setViewportView(taHasilB);

        jLabel5.setText("Hasil (kelompok 5-Huruf):");

        btnDownload.setText("Download cipher");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfKunci))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(cbCipher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDekripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnUpload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cbCipher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnkripsi)
                    .addComponent(btnDekripsi))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnDownload))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfKunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKunciActionPerformed

    private void btnEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnkripsiActionPerformed
        String selectedCipher = (String) cbCipher.getSelectedItem();
        String key = tfKunci.getText(); 
        String output = ""; 
        if (!taInput.getText().isEmpty()) {
            String inputText = taInput.getText();
        switch (selectedCipher) {
            case "Vigenere Chiper standard":
                VigenereCipher vigenere = new VigenereCipher();
                output = vigenere.encrypt(inputText, key);
                break;
            case "Extended Vigenere Chiper":
                ExtendedVigenereCipher extendedVigenere = new ExtendedVigenereCipher();
                output = extendedVigenere.encrypt(inputText, key);
                break;
            case "Playfair Cipher":
                PlayfairCipher playfair = new PlayfairCipher();
                output = playfair.encrypt(inputText, key);
                break;
            case "Enigma Cipher":
                EnigmaCipher enigma = new EnigmaCipher("mysecretkey");
                output = enigma.encrypt(inputText);
                break;
            case "One time Pad":
                try {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Pilih File Kunci One-Time Pad");
                    int result = fileChooser.showOpenDialog(this);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        File keyFile = fileChooser.getSelectedFile();
                        OneTimePad oneTimePad = new OneTimePad(keyFile.getAbsolutePath());
                        if (!taInput.getText().isEmpty()) {
                            output = oneTimePad.encrypt(taInput.getText());
                            taHasilA.setText(output);
                        } else {
                            // Proses file enkripsi
                            JFileChooser fileChooserInput = new JFileChooser();
                            int inputResult = fileChooserInput.showOpenDialog(this);
                            if (inputResult == JFileChooser.APPROVE_OPTION) {
                                File selectedFile = fileChooserInput.getSelectedFile();
                                byte[] fileBytes = Files.readAllBytes(selectedFile.toPath());
                                String fileContent = new String(fileBytes);
                                String encryptedContent = oneTimePad.encrypt(fileContent);

                                JFileChooser saveChooser = new JFileChooser();
                                saveChooser.setSelectedFile(new File("encrypted_" + selectedFile.getName()));
                                result = saveChooser.showSaveDialog(this);
                                if (result == JFileChooser.APPROVE_OPTION) {
                                    File saveFile = saveChooser.getSelectedFile();
                                    Files.write(saveFile.toPath(), encryptedContent.getBytes());
                                    JOptionPane.showMessageDialog(this, "File encrypted and saved successfully!");
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                output = "Cipher not selected.";
            break;
        }
        btnDownload.setEnabled(true);
        String hasilA = output.replaceAll("\\s+", ""); 
        String hasilB = ""; 
        for (int i = 0; i < output.length(); i++) {
            if (i % 5 == 0 && i != 0) {
                hasilB += " ";
            }
            hasilB += output.charAt(i);
        }

        taHasilA.setText(hasilA);
        taHasilB.setText(hasilB);
    } else {
        File selectedFile = new File("path_file_diupload");
        try (FileInputStream fis = new FileInputStream(selectedFile)) {
            byte[] fileBytes = new byte[(int) selectedFile.length()];
            fis.read(fileBytes);
            byte[] encryptedBytes = null;
            switch (selectedCipher) {
                case "Vigenere Chiper standard":
                    VigenereCipher vigenere = new VigenereCipher();
                    encryptedBytes = vigenere.encrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Extended Vigenere Chiper":
                    ExtendedVigenereCipher extendedVigenere = new ExtendedVigenereCipher();
                    encryptedBytes = extendedVigenere.encrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Playfair Cipher":
                    PlayfairCipher playfair = new PlayfairCipher();
                    encryptedBytes = playfair.encrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Enigma Cipher":
                    EnigmaCipher enigma = new EnigmaCipher("mysecretkey");
                    encryptedBytes = enigma.encrypt(fileBytes);
                    break;
                case "One time Pad":
                    OneTimePad oneTimePad = new OneTimePad("path/to/your/key/file.txt"); 
                    encryptedBytes = oneTimePad.encrypt(new String(fileBytes)).getBytes(); 
                    break;
                default:
                    encryptedBytes = "Cipher not selected.".getBytes();
                    break;
            }
            btnDownload.setEnabled(true);
            try (FileOutputStream fos = new FileOutputStream("encrypted_" + selectedFile.getName())) {
                fos.write(encryptedBytes);
            }
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnEnkripsiActionPerformed

    private void btnDekripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDekripsiActionPerformed
        String selectedCipher = (String) cbCipher.getSelectedItem();
        String key = tfKunci.getText();
        String output = "";

        if (!taInput.getText().isEmpty()) {
            String inputText = taInput.getText();
            switch (selectedCipher) {
                case "Vigenere Chiper standard":
                    VigenereCipher vigenere = new VigenereCipher();
                    output = vigenere.decrypt(inputText, key);
                    break;
                case "Extended Vigenere Chiper":
                    ExtendedVigenereCipher extendedVigenere = new ExtendedVigenereCipher();
                    output = extendedVigenere.decrypt(inputText, key);
                    break;
                case "Playfair Cipher":
                    PlayfairCipher playfair = new PlayfairCipher();
                    output = playfair.decrypt(inputText, key);
                    break;
                case "Enigma Cipher":
                    EnigmaCipher enigma = new EnigmaCipher("mysecretkey");
                    output = enigma.decrypt(inputText);
                    break;
                case "One time Pad":
                    try {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("Pilih File Kunci One-Time Pad");
                        int result = fileChooser.showOpenDialog(this);
                        if (result == JFileChooser.APPROVE_OPTION) {
                            File keyFile = fileChooser.getSelectedFile();
                            OneTimePad oneTimePad = new OneTimePad(keyFile.getAbsolutePath());
                            output = oneTimePad.decrypt(taInput.getText());
                            taHasilA.setText(output);
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break; // Pastikan untuk menambahkan break
                default:
                    JOptionPane.showMessageDialog(this, "Cipher not selected.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        
            btnDownload.setEnabled(false);

        String hasilA = output.replaceAll("\\s+", ""); 
        String hasilB = ""; 
        for (int i = 0; i < output.length(); i++) {
            if (i % 5 == 0 && i != 0) {
                hasilB += " ";
            }
            hasilB += output.charAt(i);
        }

        taHasilA.setText(hasilA);
        taHasilB.setText(hasilB);
    } else {
        File selectedFile = new File("path_file_diupload");
        try (FileInputStream fis = new FileInputStream(selectedFile)) {
            byte[] fileBytes = new byte[(int) selectedFile.length()];
            fis.read(fileBytes);
            byte[] decryptedBytes = null;

            switch (selectedCipher) {
                case "Vigenere Chiper standard":
                    VigenereCipher vigenere = new VigenereCipher();
                    decryptedBytes = vigenere.decrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Extended Vigenere Chiper":
                    ExtendedVigenereCipher extendedVigenere = new ExtendedVigenereCipher();
                    decryptedBytes = extendedVigenere.decrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Playfair Cipher":
                    PlayfairCipher playfair = new PlayfairCipher();
                    decryptedBytes = playfair.decrypt(new String(fileBytes), key).getBytes();
                    break;
                case "Enigma Cipher":
                    EnigmaCipher enigma = new EnigmaCipher("mysecretkey");
                    decryptedBytes = enigma.decrypt(fileBytes);  
                    break;
                case "One time Pad":
                    try {
                        OneTimePad oneTimePad = new OneTimePad(key);  
                        decryptedBytes = oneTimePad.decrypt(new String(fileBytes)).getBytes();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    decryptedBytes = "Cipher not selected.".getBytes();
                    break;
            }
            
            btnDownload.setEnabled(false);

            try (FileOutputStream fos = new FileOutputStream("decrypted_" + selectedFile.getName())) {
                fos.write(decryptedBytes);
            }
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnDekripsiActionPerformed

    private void cbCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCipherActionPerformed

    }//GEN-LAST:event_cbCipherActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select a file to upload");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());

                try (FileInputStream fis = new FileInputStream(selectedFile)) {
                    byte[] fileBytes = new byte[(int) selectedFile.length()];
                    fis.read(fileBytes);

                    String fileContent = new String(fileBytes);

                    taInput.setText(fileContent);
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        taInput.setText("");
        tfKunci.setText("");
        taHasilA.setText("");
        taHasilB.setText("");
        cbCipher.setSelectedIndex(0); 
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Ciphertext");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            String ciphertext = taHasilA.getText(); 

            try (FileOutputStream fos = new FileOutputStream(fileToSave)) {
                fos.write(ciphertext.getBytes());
                JOptionPane.showMessageDialog(this, "Ciphertext saved successfully!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

   
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
            java.util.logging.Logger.getLogger(GUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDekripsi;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnEnkripsi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cbCipher;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taHasilA;
    private javax.swing.JTextArea taHasilB;
    private javax.swing.JTextArea taInput;
    private javax.swing.JTextField tfKunci;
    // End of variables declaration//GEN-END:variables
}
