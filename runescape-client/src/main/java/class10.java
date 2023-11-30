import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class10 {
	@ObfuscatedName("wj")
	static Iterator field40;
	@ObfuscatedName("at")
	final HttpsURLConnection field46;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class431 field39;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class9 field41;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	class473 field42;
	@ObfuscatedName("ab")
	boolean field43;
	@ObfuscatedName("au")
	boolean field44;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -424565133
	)
	int field45;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laz;Lqf;Z)V"
	)
	public class10(URL var1, class9 var2, class431 var3, boolean var4) throws IOException {
		this.field43 = false;
		this.field44 = false;
		this.field45 = 300000;
		if (!var2.method76()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method75());
		} else {
			this.field46 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.field46;
				if (class15.field69 == null) { // L: 34
					class15.field69 = new class15();
				}

				class15 var6 = class15.field69;
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field41 = var2; // L: 41
			this.field39 = var3 != null ? var3 : new class431();
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laz;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class431(), var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "77865186"
	)
	public class431 method95() {
		return this.field39; // L: 46
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsd;I)V",
		garbageValue = "2039275921"
	)
	public void method92(class473 var1) {
		if (!this.field43) { // L: 50
			if (var1 == null) { // L: 51
				this.field39.method7955("Content-Type"); // L: 52
				this.field42 = null; // L: 53
			} else {
				this.field42 = var1; // L: 56
				if (this.field42.vmethod8594() != null) { // L: 57
					this.field39.method7981(this.field42.vmethod8594()); // L: 58
				} else {
					this.field39.method7960(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	void method103() throws ProtocolException {
		if (!this.field43) { // L: 66
			this.field46.setRequestMethod(this.field41.method75()); // L: 67
			this.field39.method7958(this.field46); // L: 68
			if (this.field41.method74() && this.field42 != null) { // L: 69
				this.field46.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field42.vmethod8587()); // L: 73
					var1.writeTo(this.field46.getOutputStream()); // L: 74
				} catch (IOException var11) { // L: 76
					var11.printStackTrace(); // L: 77
				} finally {
					try {
						var1.close(); // L: 81
					} catch (IOException var10) { // L: 83
						var10.printStackTrace(); // L: 84
					}

				}
			}

			this.field46.setConnectTimeout(this.field45); // L: 88
			this.field46.setInstanceFollowRedirects(this.field44); // L: 89
			this.field43 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1613730505"
	)
	boolean method94() throws IOException {
		if (!this.field43) { // L: 94
			this.method103();
		}

		this.field46.connect(); // L: 95
		return this.field46.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Law;",
		garbageValue = "1005545851"
	)
	class20 method91() {
		try {
			if (!this.field43 || this.field46.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field46.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field46); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field46.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1180339211"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-841050646"
	)
	public static int method109(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;Ljava/lang/String;Ljava/lang/String;B)Lpf;",
		garbageValue = "84"
	)
	public static Font method110(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 154
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 155
			int var5 = var0.getFileId(var4, var3); // L: 156
			byte[] var8 = var0.takeFile(var4, var5); // L: 161
			boolean var7;
			if (var8 == null) { // L: 162
				var7 = false; // L: 163
			} else {
				class162.SpriteBuffer_decode(var8); // L: 166
				var7 = true; // L: 167
			}

			Font var6;
			if (!var7) { // L: 169
				var6 = null; // L: 170
			} else {
				var6 = WorldMapArea.method4590(var1.takeFile(var4, var5)); // L: 173
			}

			return var6; // L: 175
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "128"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 147
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3203, Client.packetWriter.isaacCipher); // L: 10237
		var2.packetBuffer.writeIntME(var0); // L: 10238
		var2.packetBuffer.method9300(var1); // L: 10239
		Client.packetWriter.addNode(var2); // L: 10240
	} // L: 10241
}
