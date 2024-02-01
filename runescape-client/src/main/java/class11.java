import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("an")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 313
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 317
			LinkedList var3 = new LinkedList(); // L: 318
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 320

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 321
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 322
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 324
			}

			this.this$2.this$1.field48 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2023573459"
	)
	static final int method101(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10); // L: 73

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 74
			var4.method9373(var3.nextInt()); // L: 75
		}

		var4.method9373(var6[0]); // L: 77
		var4.method9373(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.method9373(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class72.field879, class72.field880); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.method9373(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		class12.method170(var5); // L: 91
		var5.writeLong(var3.nextLong()); // L: 92
		var5.encryptRsa(class72.field879, class72.field880); // L: 93
		var7 = CollisionMap.stringCp1252NullTerminatedByteSize(var2); // L: 94
		if (var7 % 8 != 0) { // L: 95
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 96
		var8.writeStringCp1252NullTerminated(var2); // L: 97
		var8.offset = var7; // L: 98
		var8.xteaEncryptAll(var6); // L: 99
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5); // L: 100
		var9.writeByte(2); // L: 101
		var9.writeByte(var4.offset); // L: 102
		var9.writeBytes(var4.array, 0, var4.offset); // L: 103
		var9.writeByte(var5.offset); // L: 104
		var9.writeBytes(var5.array, 0, var5.offset); // L: 105
		var9.writeShort(var8.offset); // L: 106
		var9.writeBytes(var8.array, 0, var8.offset); // L: 107
		byte[] var11 = var9.array; // L: 109
		String var10 = ItemComposition.method4053(var11, 0, var11.length); // L: 111
		String var12 = var10; // L: 113

		try {
			URL var13 = new URL(MouseRecorder.method2371("services", false) + "m=accountappeal/login.ws"); // L: 115
			URLConnection var14 = var13.openConnection(); // L: 116
			var14.setDoInput(true); // L: 117
			var14.setDoOutput(true); // L: 118
			var14.setConnectTimeout(5000); // L: 119
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 120
			int var18 = var12.length(); // L: 124
			StringBuilder var19 = new StringBuilder(var18); // L: 125

			int var20;
			for (var20 = 0; var20 < var18; ++var20) { // L: 126
				char var21 = var12.charAt(var20); // L: 127
				if ((var21 < 'a' || var21 > 'z') && (var21 < 'A' || var21 > 'Z') && (var21 < '0' || var21 > '9') && var21 != '.' && var21 != '-' && var21 != '*' && var21 != '_') { // L: 128
					if (var21 == ' ') { // L: 129
						var19.append('+');
					} else {
						byte var22 = class147.charToByteCp1252(var21); // L: 131
						var19.append('%'); // L: 132
						int var23 = var22 >> 4 & 15; // L: 133
						if (var23 >= 10) { // L: 134
							var19.append((char)(var23 + 55));
						} else {
							var19.append((char)(var23 + 48)); // L: 135
						}

						var23 = var22 & 15; // L: 136
						if (var23 >= 10) { // L: 137
							var19.append((char)(var23 + 55));
						} else {
							var19.append((char)(var23 + 48)); // L: 138
						}
					}
				} else {
					var19.append(var21);
				}
			}

			String var17 = var19.toString(); // L: 141
			String var26 = "data2=" + var17 + "&dest="; // L: 143
			var20 = "passwordchoice.ws".length(); // L: 146
			StringBuilder var27 = new StringBuilder(var20); // L: 147

			for (int var32 = 0; var32 < var20; ++var32) { // L: 148
				char var33 = "passwordchoice.ws".charAt(var32); // L: 149
				if ((var33 < 'a' || var33 > 'z') && (var33 < 'A' || var33 > 'Z') && (var33 < '0' || var33 > '9') && var33 != '.' && var33 != '-' && var33 != '*' && var33 != '_') { // L: 150
					if (var33 == ' ') { // L: 151
						var27.append('+');
					} else {
						byte var24 = class147.charToByteCp1252(var33); // L: 153
						var27.append('%'); // L: 154
						int var25 = var24 >> 4 & 15; // L: 155
						if (var25 >= 10) {
							var27.append((char)(var25 + 55)); // L: 156
						} else {
							var27.append((char)(var25 + 48)); // L: 157
						}

						var25 = var24 & 15; // L: 158
						if (var25 >= 10) { // L: 159
							var27.append((char)(var25 + 55));
						} else {
							var27.append((char)(var25 + 48)); // L: 160
						}
					}
				} else {
					var27.append(var33);
				}
			}

			String var30 = var27.toString(); // L: 163
			var15.write(var26 + var30); // L: 165
			var15.flush(); // L: 166
			InputStream var28 = var14.getInputStream(); // L: 167
			var9 = new Buffer(new byte[1000]); // L: 168

			do {
				int var31 = var28.read(var9.array, var9.offset, 1000 - var9.offset); // L: 170
				if (var31 == -1) { // L: 171
					var15.close(); // L: 177
					var28.close(); // L: 178
					String var34 = new String(var9.array); // L: 179
					if (var34.startsWith("OFFLINE")) { // L: 180
						return 4; // L: 181
					} else if (var34.startsWith("WRONG")) { // L: 183
						return 7; // L: 184
					} else if (var34.startsWith("RELOAD")) { // L: 186
						return 3; // L: 187
					} else if (var34.startsWith("Not permitted for social network accounts.")) { // L: 189
						return 6; // L: 190
					} else {
						var9.xteaDecryptAll(var6); // L: 192

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 193
							--var9.offset; // L: 194
						}

						var34 = new String(var9.array, 0, var9.offset); // L: 196
						if (GraphicsObject.method2140(var34)) { // L: 197
							class217.openURL(var34, true, false); // L: 198
							return 2; // L: 199
						} else {
							return 5; // L: 201
						}
					}
				}

				var9.offset += var31; // L: 172
			} while(var9.offset < 1000); // L: 173

			return 5; // L: 174
		} catch (Throwable var29) { // L: 203
			var29.printStackTrace(); // L: 204
			return 5; // L: 205
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "265344198"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE; // L: 219
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 222
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE; // L: 223
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 224 225
		}
	}
}
