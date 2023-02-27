package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Service {

	public static String encrypt(final File file) {
		return getHash(file);
	}

	private static String getHash(final File file) {
		try (FileInputStream fis = new FileInputStream(file)){
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(fis.readAllBytes());
			return bytesToHex(md.digest());
		} catch (IOException e) {
			throw new IllegalArgumentException("해당 파일을 읽는데 문제가 발생했습니다.", e);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException("해당 알고리즘이 존재하지 않습니다.");
		}
	}

	private static String bytesToHex(final byte[] bytes) {
		StringBuilder hex = new StringBuilder();
		for (byte b : bytes) {
			hex.append(Integer.toHexString(b & 0xFF));
		}
		return hex.toString();
	}
}
