import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class142 extends class144 {
	@ObfuscatedName("aw")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 3521707125531879261L
	)
	long field1670;
	@ObfuscatedName("ah")
	String field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class142(class147 var1) {
		this.this$0 = var1;
		this.field1670 = -1L; // L: 74
		this.field1672 = null; // L: 75
	} // L: 77

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1670 = var1.readLong(); // L: 82
		}

		this.field1672 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3246(this.field1670, this.field1672, 0); // L: 88
	} // L: 89

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "702516616"
	)
	static void method3134() {
		try {
			File var0 = new File(class136.userHomeDirectory, "random.dat"); // L: 294
			int var2;
			if (var0.exists()) { // L: 295
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 296
			} else {
				label37:
				for (int var1 = 0; var1 < class60.field423.length; ++var1) { // L: 299
					for (var2 = 0; var2 < HealthBar.field1327.length; ++var2) { // L: 300
						File var3 = new File(HealthBar.field1327[var2] + class60.field423[var1] + File.separatorChar + "random.dat"); // L: 301
						if (var3.exists()) { // L: 302
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 303
							break label37; // L: 304
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 309
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 310
				var2 = var4.read(); // L: 311
				var4.seek(0L); // L: 312
				var4.write(var2); // L: 313
				var4.seek(0L); // L: 314
				var4.close(); // L: 315
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 316
			}
		} catch (IOException var5) { // L: 319
		}

	} // L: 320

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnt;I)Ljava/lang/String;",
		garbageValue = "324544575"
	)
	static String method3137(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11135
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11136
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11138
					if (var3 == -1) { // L: 11139
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11140
					int var6 = class147.method3173(var1, var2 - 1); // L: 11142
					String var5;
					if (var6 < 999999999) { // L: 11144
						var5 = Integer.toString(var6); // L: 11145
					} else {
						var5 = "*"; // L: 11148
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11150
				}
			}
		}

		return var0; // L: 11154
	}
}
