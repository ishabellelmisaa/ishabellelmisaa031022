import javax.swing.JOptionPane;
public class nomorterbesar {
      public static void main(String [] args) 
    { 
        final int jumData=10; 
        int [] arrData = new int[jumData]; 
        for(int i=0;i<jumData;i++)
        { 
            arrData[i]=Integer  .parseInt(JOptionPane  .showInputDialog("Masukkan nilai "+(i+1))); 
        }
        int terbesar=arrData[0];
        for(int i=1;i<jumData;i++){ if (arrData[i]>terbesar){ terbesar=arrData[i]; }
        } 
        JOptionPane .showMessageDialog(null, "Nilai terbesar adalah "+terbesar);
    } 
}
