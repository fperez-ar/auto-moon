package test.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class FileUtilities {

	public static void WriteFile(String filename, String data) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			File file = new File(filename);

			// if file doesn'0t exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data + "\n");

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}

	public static String[] ReadAllLine(String filename) {

		ArrayList<String> ret = new ArrayList<String>();

		// use . to get current directory
		File dir = new File(".");
		File fin = null;

		try {
			fin = new File(dir.getCanonicalPath() + File.separator + filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Construct BufferedReader from FileReader
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fin));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				ret.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret.toArray(new String[ret.size()]);

	}

	public static Properties loadPropertyFile(String filePath) {
		Properties props = new Properties();

		try {
			props.load(new FileInputStream(new File(filePath)));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return props;
	}

	public static Boolean isDirectory(String path) {
		return new File(path).isDirectory();
	}

	public static String getProperty(String path, String key) {
		return loadPropertyFile(path).getProperty(key);
	}

	public static String GenerateRndImage(int w, int h) {
		BufferedImage bf = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				int rgb = new Random().nextInt(256);
				bf.setRGB(x, y, rgb);
			}
		}

		File tmpImg = null;
		try {
			tmpImg = File.createTempFile("tmp-img", ".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmpImg.getAbsolutePath();

	}

	public static void copyFile(File srcFile, File file) throws Exception {
		InputStream input = null;
		OutputStream output = null;
		
		try {
			input = new FileInputStream(srcFile);
			output = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			input.close();
			output.close();
		}

	}

}
