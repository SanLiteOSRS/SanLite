import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("az")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("af")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("at")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 7
		int var0 = 2; // L: 10

		for (int var1 = 0; var1 < 32; ++var1) { // L: 11
			Varps_masks[var1] = var0 - 1; // L: 12
			var0 += var0; // L: 13
		}

		Varps_temp = new int[5000]; // L: 18
		Varps_main = new int[5000]; // L: 19
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1176959499"
	)
	static long method6250() {
		try {
			URL var0 = new URL(WorldMapData_0.method5235("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2018770684"
	)
	static void method6255() {
		Login.worldSelectOpen = false; // L: 2006
		class430.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2007
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2008
		class390.logoSprite.drawAt(Login.xPadding + 382 - class390.logoSprite.subWidth / 2, 18); // L: 2009
	} // L: 2010
}
