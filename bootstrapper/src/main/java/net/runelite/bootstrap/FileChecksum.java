package net.runelite.bootstrap;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

@Singleton
public class FileChecksum
{
	public static HashMap<DynamicArtifact, String> ARTIFACT_CHECKSUMS;

	@Inject
	public FileChecksum()
	{
		ARTIFACT_CHECKSUMS = new HashMap<>();
	}

	static String getChecksumFile(String filepath) throws IOException, NoSuchAlgorithmException
	{
		System.out.println("Generating hash for " + filepath);
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

		try (DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(filepath), messageDigest))
		{
			// Empty loop to clear the data
			while (digestInputStream.read() != -1) ;
			messageDigest = digestInputStream.getMessageDigest();
		}

		return bytesToHex(messageDigest.digest());
	}

	private static String bytesToHex(byte[] hashInBytes)
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (byte b : hashInBytes)
		{
			stringBuilder.append(String.format("%02x", b));
		}
		return stringBuilder.toString();
	}
}
