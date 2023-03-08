import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class70 {
	@ObfuscatedName("f")
	static final BigInteger field899;
	@ObfuscatedName("w")
	static final BigInteger field896;

	static {
		field899 = new BigInteger("10001", 16); // L: 6
		field896 = new BigInteger("a7902ee1812735d843652eecfdde4912bfedd478f177374c0294648fb49bbd88547018a7ef9a722512bca091413e35645f8120d67e4497f0d3ed6be6659c7e9a26b273993523273937e636dadde2bdd032e414dbf42dc78a83b7b87f92f5a7248ba59d646a4211612168c23b8e4053b2cddf8725205b42b6ece8636e54050027", 16); // L: 7
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Li;I)Ls;",
		garbageValue = "-1042973543"
	)
	public static class3 method2090(class6 var0) {
		switch(var0.field21) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "716176413"
	)
	static long method2085() {
		try {
			URL var0 = new URL(class310.method6356("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lba;",
		garbageValue = "249838937"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class12.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = WorldMapLabelSize.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lrs;",
		garbageValue = "1805295704"
	)
	static SpritePixels method2088(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(ParamComposition.method3840(var0, var1, var2)); // L: 42
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "298475872"
	)
	public static int method2087(int var0) {
		class133 var2 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 444
		class133 var1;
		if (var2 != null) { // L: 445
			var1 = var2; // L: 446
		} else {
			var2 = Login.method2165(SequenceDefinition.SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var0, false); // L: 449
			if (var2 != null) { // L: 450
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2; // L: 451
		}

		if (var1 == null) { // L: 454
			return 2; // L: 455
		} else {
			return var1.method3094() ? 0 : 1; // L: 457
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1804034387"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1571
		Login.Login_response2 = var1; // L: 1572
		Login.Login_response3 = var2; // L: 1573
	} // L: 1574
}
