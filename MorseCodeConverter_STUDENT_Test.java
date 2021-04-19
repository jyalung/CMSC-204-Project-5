package project5;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MorseCodeConverter_STUDENT_Test {
	
	File inputFile;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConvertToEnglish() {
		
		assertEquals("my name is junel", MorseCodeConverter.convertToEnglish("-- -.-- / -. .- -- . / .. ... / .--- ..- -. . .-.."));
		
	}

	@Test
	void testConvertToEnglishFile() throws FileNotFoundException {
		
		getFile("LoveLooksNot.txt");
		
		assertEquals("love looks not with the eyes but with the mind", MorseCodeConverter.convertToEnglish(inputFile));
		
	}
	public void getFile(String in) throws FileNotFoundException {		
		JFileChooser chooser = new JFileChooser();
		int status;

		chooser.setDialogTitle("Select Input File - " + in);
		status = chooser.showOpenDialog(null);

		if(status == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				inputFile = chooser.getSelectedFile();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "There is a problem with this file", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
