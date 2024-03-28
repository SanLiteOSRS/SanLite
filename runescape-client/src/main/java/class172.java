import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class172 {
	@ObfuscatedName("as")
	public static short[] field1858;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -228574189
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public UrlRequest field1859;
	@ObfuscatedName("ah")
	public float[] field1857;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	final class182 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhq;)V"
	)
	class172(class182 var1) {
		this.this$0 = var1;
		this.field1857 = new float[4]; // L: 296
	} // L: 298

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1171750496"
	)
	static void method3496(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class193.field1986, "rw", 10000L); // L: 250
			Buffer var3 = new Buffer(500); // L: 251
			var3.writeByte(3); // L: 252
			var3.writeByte(var1 != null ? 1 : 0); // L: 253
			var3.writeCESU8(var0.getPath()); // L: 254
			if (var1 != null) {
				var3.writeCESU8(""); // L: 255
			}

			var2.write(var3.array, 0, var3.offset); // L: 256
			var2.close(); // L: 257
		} catch (IOException var4) { // L: 259
			var4.printStackTrace(); // L: 260
		}

	} // L: 262

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	static void method3497(boolean var0) {
		byte var1 = 0; // L: 1165
		if (!class10.method101()) { // L: 1166
			var1 = 12; // L: 1167
		} else if (UrlRequest.client.method1531() || UrlRequest.client.isOtlTokenRequesterInitialized() || UrlRequest.client.method1211()) { // L: 1169
			var1 = 10; // L: 1170
		}

		class210.method3930(var1); // L: 1172
		if (var0) { // L: 1173
			Login.Login_username = ""; // L: 1174
			Login.Login_password = ""; // L: 1175
			SpriteMask.field3628 = 0; // L: 1176
			class27.otp = ""; // L: 1177
		}

		class7.method44(); // L: 1179
		Friend.method8099(); // L: 1180
	} // L: 1181
}
