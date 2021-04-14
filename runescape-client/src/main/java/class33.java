import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class33 implements class30 {
	@ObfuscatedName("f")
	final MessageDigest field227;

	@ObfuscatedSignature(
		signature = "(Las;)V"
	)
	class33(class36 var1) {
		this.field227 = this.method400();
	}

	@ObfuscatedName("f")
	boolean method396(int var1, String var2, long var3) {
		byte[] var5 = this.method399(var2, var3);
		return method395(var5) >= var1;
	}

	@ObfuscatedName("p")
	byte[] method399(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.field227.reset();

		try {
			this.field227.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.field227.digest();
	}

	@ObfuscatedName("b")
	MessageDigest method400() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("o")
	static int method395(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			byte var4 = var2[var3];
			int var5 = method401(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("u")
	static int method401(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				++var1;
			}
		}

		return var1;
	}
}
