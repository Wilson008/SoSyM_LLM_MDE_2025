package org.bumble.xtext.grammaroptimizer.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.bumble.xtext.grammaroptimizer.helper.IOHelper;

public class FileHelper {
	private static final String TEST_RESOURCES_PATH_FRAGMENT = "testresources";
	private static final String INPUT_PATH_FRAGMENT = "input";
	private static final String OUTPUT_PATH_FRAGMENT = "output";
	private static final String ADDITION_FOLDER = "addition";

	public static String getInputTextFile(String fileName) {
		return getFileText(fileName, true);
	}

	public static String getOutputTextFile(String fileName) {
		return getFileText(fileName, false);
	}

	// method for reading text from test file
	public static String getFileText(String fileName, boolean isInput) {
		if (fileName == null)
			return null;

		File file = getProjectFile(fileName, isInput); 

		if (!file.exists()) {
			System.err.printf("[Error] File %s doesn't exist!\n", fileName);
			return null;
		}

		try {
			return IOHelper.readFile(file);
		} catch (IOException e) {
			System.err.printf("[Error] Failed to read string from file %s.\n", fileName);
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getAdditionFileText(String fileName) {
		if (fileName == null)
			return null;

		File file = getProjectAdditionFile(fileName); 

		if (!file.exists()) {
			System.err.printf("[Error] File %s doesn't exist!\n", fileName);
			return null;
		}

		try {
			return IOHelper.readFile(file);
		} catch (IOException e) {
			System.err.printf("[Error] Failed to read string from file %s.\n", fileName);
			e.printStackTrace();
			return null;
		}
	}

	private static File getProjectFile(String fileName, boolean isInput) {
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();
		
		File file = Paths.get(directoryName, TEST_RESOURCES_PATH_FRAGMENT, (isInput ? INPUT_PATH_FRAGMENT : OUTPUT_PATH_FRAGMENT), 
				 fileName).toFile();
		return file;
	}

	private static File getProjectAdditionFile(String fileName) {
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();
		
		File file = Paths.get(directoryName, TEST_RESOURCES_PATH_FRAGMENT, ADDITION_FOLDER, 
				 fileName).toFile();
		return file;
	}


	public static boolean setFileText(String fileName, String strFinal) {
		if (fileName == null)
			return false;

		File file = getProjectFile(fileName, false);

		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			IOHelper.saveFile(file, strFinal);
		} catch (IOException e) {
			System.err.printf("Failed to create or write to file %s\n", fileName);
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
