package org.xtext.configgenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.bumble.xtext.grammaroptimizer.helper.IOHelper;

public class FileHelper {
	private static final String TEST_RESOURCES_PATH_FRAGMENT = "grammar";
	private static final String GENERATED_PATH_FRAGMENT = "generated";
	private static final String TARGET_PATH_FRAGMENT = "target";
	private static final String CONFIG_PATH_FRAGMENT = "config";
	private static final String ADDITION_FOLDER = "addition";
	
	enum FileType {
		GENERATED, TARGET, CONFIG
	}

	public static String getInputTextFile(String fileName, FileType fileType) {
		return getFileText(fileName, fileType);
	}

	public static String getOutputTextFile(String fileName, FileType fileType) {
		return getFileText(fileName, fileType);
	}

	// method for reading text from test file
	public static String getFileText(String fileName, FileType fileType) {
		if (fileName == null)
			return null;

		File file = getProjectFile(fileName, fileType); 

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

	private static File getProjectFile(String fileName, FileType fileType) {
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();
		
		String folderStr = "";
		
		switch (fileType) {
			case GENERATED:
				folderStr = GENERATED_PATH_FRAGMENT;
				break;
			case TARGET:
				folderStr = TARGET_PATH_FRAGMENT;
				break;
			case CONFIG:
				folderStr = CONFIG_PATH_FRAGMENT;
				break;
		}
		
		File file = Paths.get(directoryName, TEST_RESOURCES_PATH_FRAGMENT, folderStr, fileName).toFile();
		return file;
	}

	private static File getProjectAdditionFile(String fileName) {
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();
		
		File file = Paths.get(directoryName, TEST_RESOURCES_PATH_FRAGMENT, ADDITION_FOLDER, 
				 fileName).toFile();
		return file;
	}


	public static boolean setFileText(String fileName, String strFinal, FileType fileType) {
		if (fileName == null)
			return false;

		File file = getProjectFile(fileName, fileType);

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
