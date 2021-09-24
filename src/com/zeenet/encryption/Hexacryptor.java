package com.zeenet.encryption;

public class Hexacryptor {

	public static String encrypt(String str) {
		int code;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			code = Math.round((float) Math.random() * 8 + 1);
			result += code + Integer.toHexString(((int) str.charAt(i)) ^ code) + "-";
		}
		return result.substring(0, result.lastIndexOf("-"));
	}

	public static String decrypt(String str) {
		str = str.replace("-", "");
		String result = "";
		for (int i = 0; i < str.length(); i += 3) {
			String hex = str.substring(i + 1, i + 3);
			result += (char) (Integer.parseInt(hex, 16) ^ (Integer.parseInt(String.valueOf(str.charAt(i)))));
		}
		return result;
	}

	public static void main(String[] args) {
		String e = "1CE12cs008@";
		String encrypted = encrypt(e);
		System.out.println(encrypted);
		System.out.println(decrypt(encrypted));
		System.out.println(decrypt("534-360-164-435-436-764-370-232-434-43c-646"));
	}

}
