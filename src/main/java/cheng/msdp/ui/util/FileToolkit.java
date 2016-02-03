package cheng.msdp.ui.util;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;

/**
 * 自定义的文件操作类
 * 
 * @author cheng
 * 
 */
public class FileToolkit {

	/**
	 * 文件编码格式：UTF-8
	 */
	public static final String UTF_8 = "UTF-8";
	/**
	 * 文件编码格式：GBK
	 */
	public static final String GBK = "GBK";
	/**
	 * 文件编码格式：GB2312
	 */
	public static final String GB2312 = "GB2312";

	// 复制文件夹
	public static void copyDirectiory(String sourceDir, String targetDir) {
		// 新建目标目录
		(new File(targetDir)).mkdirs();
		// 获取源文件夹当前下的文件或目录
		File[] file = (new File(sourceDir)).listFiles();
		for (int i = 0; i < file.length; i++) {
			if (file[i].isFile()) {
				// 源文件
				File sourceFile = file[i];
				// 目标文件
				File targetFile = new File(new File(targetDir).getAbsolutePath()+ File.separator + file[i].getName());
				copyFile(sourceFile, targetFile);
			}
			if (file[i].isDirectory()) {
				// 准备复制的源文件夹
				String dir1 = sourceDir + File.separator + file[i].getName();
				// 准备复制的目标文件夹
				String dir2 = targetDir + File.separator + file[i].getName();
				copyDirectiory(dir1, dir2);
			}
		}
	}

	/**
	 * 复制文件
	 * 
	 * @param srcFile
	 *            要复制的文件
	 * @param objFile
	 *            要复制到的位置
	 * @return 操纵标志，true 复制成功，false 复制失败
	 */
	public static boolean copyFile(File srcFile, File objFile) {
		boolean flag = true;

		try {
			if (!objFile.exists()) {
				new File(objFile.getParent()).mkdirs();
				objFile.createNewFile();
			}
			FileInputStream fis = new FileInputStream(srcFile);
			FileOutputStream fos = new FileOutputStream(objFile, false);
			byte[] bytes = new byte[1024];
			int count = fis.read(bytes);
			while (count != -1) {
				fos.write(bytes, 0, count);
				count = fis.read(bytes);
			}
			fis.close();
			fos.flush();
			fos.close();

		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 复制文件
	 * 
	 * @param srcFilePath
	 *            要复制的文件路径
	 * @param objFilePath
	 *            要复制到的位置
	 * @return 操纵标志，true 复制成功，false 复制失败
	 */
	public static boolean copyFile(String srcFilePath, String objFilePath) {
		File srcFile = new File(srcFilePath);
		File objFile = new File(objFilePath);
		return copyFile(srcFile, objFile);
	}

	/**
	 *  复制文件
	 * @param sourceFile
	 * @param targetFile
	 */
	public static void copyFile1(File sourceFile, File targetFile) {
		try {
			// 新建文件输入流并对它进行缓冲
			FileInputStream input = new FileInputStream(sourceFile);
			BufferedInputStream inBuff = new BufferedInputStream(input);
			// 新建文件输出流并对它进行缓冲
			FileOutputStream output = new FileOutputStream(targetFile);
			BufferedOutputStream outBuff = new BufferedOutputStream(output);
			// 缓冲数组
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1) {
				outBuff.write(b, 0, len);
			}
			// 刷新此缓冲的输出流
			outBuff.flush();
			// 关闭流
			inBuff.close();
			outBuff.close();
			output.close();
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean delete(File objFile) {
		return objFile.delete();

	}

	/**
	 * 删除文件
	 * 
	 * @param fileName
	 *            要删除的文件
	 * @return 操作标志，true 成功 false 失败
	 */
	public static boolean delete(String fileName) {
		File f = new File(fileName);
		if (f.exists()) {
			return f.delete();
		} else {
			return false;
		}

	}

	/**
	 * 得到指定目录下所有文件的文件名
	 * 
	 * @param path
	 *            要操作的目录
	 * @return 以数组形式表示的文件的名字
	 */
	public static String[] getFilenames(String path) {
		File file = new File(path);
		String[] fileNameArr = null;
		if (file.isDirectory()) {
			fileNameArr = file.list();
		}
		return fileNameArr;
	}

	/**
	 * 得到文件的大小
	 * 
	 * @param fileName
	 *            文件的路径
	 * @return 文件的大小 字节数
	 */
	public static long getFileSize(String fileName) {
		File f = new File(fileName);
		return f.length();
	}

	/**
	 * 通过文件对象实例读取一个文件 读取文件的默认编码是UTF-8
	 * 
	 * @param srcFile
	 *            文件实例
	 * @return 文件内容
	 */
	public static String readFile(File srcFile) {
		StringBuffer sb = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(srcFile);
			InputStreamReader isr = new InputStreamReader(fis,
					FileToolkit.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				sb.append(line).append(System.getProperty("line.separator"));
				line = br.readLine();
			}
			fis.close();
			isr.close();
			br.close();
		} catch (Exception e) {
		}
		return sb.toString();
	}

	/**
	 * 通过文件实例，以指定编码读取文件
	 * 
	 * @param srcFile
	 *            文件实例
	 * @param charset
	 *            编码类型
	 * @return 文件内容
	 */
	public static String readFile(File srcFile, String charset) {
		StringBuffer sb = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(srcFile);
			InputStreamReader isr = new InputStreamReader(fis, charset);
			BufferedReader br = new BufferedReader(isr);
			LineNumberReader lr = new LineNumberReader(br);
			String line = lr.readLine();
			while (line != null) {
				sb.append(line).append(System.getProperty("line.separator"));
				line = lr.readLine();
			}
			fis.close();
			isr.close();
			br.close();
			lr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @param srcFile
	 * @param charset
	 * @param separationStr
	 * @return
	 */
	public static String[] readFile(File srcFile, String charset,String separationStr) {
		ArrayList<String> listarr= new ArrayList<String>();
		
		try {
			FileInputStream fis = new FileInputStream(srcFile);
			InputStreamReader isr = new InputStreamReader(fis, charset);
			BufferedReader br = new BufferedReader(isr);
			LineNumberReader lr = new LineNumberReader(br);
			String line = lr.readLine();
			StringBuffer sb = new StringBuffer();
			while (line != null) {
				if(StringUtils.endsWith(line.trim(),separationStr)){
					sb.append(StringUtils.substring(line.trim(), 0, line.trim().length()-separationStr.length()));
					listarr.add(sb.toString());
					sb = null ;
					sb = new StringBuffer();
				}else{
					sb.append(line);
				}
				line = lr.readLine();
			}
			fis.close();
			isr.close();
			br.close();
			lr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarr.toArray(new String[0]);
	}
	

	/**
	 * 通过指定路径读取文件 .读取文件的默认编码是UTF-8
	 * 
	 * @param srcFilePath
	 *            文件的抽象路径
	 * @return 文件的内容
	 */
	public static String readFile(String srcFilePath) {
		File f = new File(srcFilePath);
		return readFile(f);
	}

	/**
	 * 通过指定路径，以指定编码读取文件
	 * 
	 * @param srcFilePath
	 *            文件的抽象路径
	 * @param charset
	 *            编码类型
	 * @return 文件内容
	 */
	public static String readFile(String srcFilePath, String charset) {

		File f = new File(srcFilePath);
		return readFile(f, charset);
	}

	/**
	 * 重名文件
	 * 
	 * @param srcFileName
	 *            原文件名
	 * @param destFileName
	 *            重命名后的文件名
	 * @return 操作标志，true 成功 false 失败
	 */
	public static boolean reName(String srcFileName, String destFileName) {
		File src = new File(srcFileName);
		File dest = new File(destFileName);
		return src.renameTo(dest);
	}

	/**
	 * 将一个字符串以指定的方式写入文件
	 * 
	 * @param objFile
	 *            写入到的文件地址
	 * @param fileContent
	 *            要写的字符串
	 * @param append
	 *            写入方式 ，true 添加到文件末尾 false 覆盖已有内容
	 */
	public static void writeFile(File objFile, String[] fileContents,
			boolean append,String encode) {
		try {
			if (!objFile.exists()) {
				objFile.getParentFile().mkdirs();
			}
			FileOutputStream fos  =   new  FileOutputStream(objFile); 
		    OutputStreamWriter osw  =   new  OutputStreamWriter(fos,encode); 
		    for(int i=0;i<fileContents.length;i++){
		    	osw.write(fileContents[i]);
		    }
		    osw.flush(); 
		    osw.close();
		    fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将一个字符串以指定的方式写入文件
	 * 
	 * @param objFilePath
	 *            写入到的文件地址
	 * @param fileContent
	 *            要写的字符串
	 * @param append
	 *            写入方式 ，true 添加到文件末尾 false 覆盖已有内容
	 */
	public static void writeFile(String objFilePath, String fileContent,
			boolean append,String encode) {
		try {
			File file = new File(objFilePath);
			String [] fileContents = new String[]{fileContent};
			writeFile(file, fileContents, append,encode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将一个字符串数组以指定的方式写入文件
	 * 
	 * @param objFilePath
	 *            写入到的文件地址
	 * @param fileContent
	 *            要写的字符串数组
	 * @param append
	 *            写入方式 ，true 添加到文件末尾 false 覆盖已有内容
	 */
	public static void writeFile(String objFilePath, String[] fileContents,
			boolean append,String encode) {
		File file = new File(objFilePath);
		writeFile(file, fileContents, append,encode);
	}

	/**
	 * Java文件操作 获取文件扩展名
	 * @param filename
	 * @return
	 */
	public static String getExtensionName(String filename) {
		String ext = null ;
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				ext = filename.substring(dot + 1);
			}
		}
		return ext;
	}

	

	/**
	 * Java文件操作 获取不带扩展名的文件名
	 * @param filename
	 * @return
	 */
	public static String getFileNameNoEx(String filename) {
		String ext = null ;
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length()))) {
				ext = filename.substring(0, dot);
			}
		}
		return ext;
	}
}
