import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static StudioGame field3293;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "79012875"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "44"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;ZI)V",
		garbageValue = "1250928603"
	)
	public static void method5501(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "8"
	)
	static long method5506() {
		try {
			URL var0 = new URL(ScriptFrame.method1055("services", false) + "m=accountappeal/login.ws"); // L: 36
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "1719009588"
	)
	static void method5509(Float var0, Float var1) {
		var1 = 1.0F - var1; // L: 332
		if (var0 < 0.0F) { // L: 333
			var0 = 0.0F;
		}

		if (var1 < 0.0F) { // L: 334
			var1 = 0.0F;
		}

		if (var0 > 1.0F || var1 > 1.0F) { // L: 335
			float var2 = (float)((double)(var0 * (var0 - 2.0F + var1)) + (double)var1 * ((double)var1 - 2.0D) + 1.0D); // L: 336
			if (var2 + class114.field1399 > 0.0F) { // L: 337
				class18.method270(var0, var1); // L: 338
			}
		}

		var1 = 1.0F - var1; // L: 341
	} // L: 342

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lcs;II)V",
		garbageValue = "-757589871"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1194 >= Client.cycle) { // L: 4058
			Tiles.method2114(var0);
		} else if (var0.field1166 >= Client.cycle) { // L: 4059
			boolean var2 = var0.field1166 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4060
			int var4;
			if (!var2) { // L: 4061
				SequenceDefinition var3 = class14.SequenceDefinition_get(var0.sequence); // L: 4062
				var4 = var3 != null && !var3.isCachedModelIdSet() ? var3.frameLengths[var0.sequenceFrame] : 1; // L: 4063
				var2 = var0.sequenceFrameCycle + 1 > var4; // L: 4064
			}

			if (var2) { // L: 4066
				int var9 = var0.field1166 - var0.field1194; // L: 4067
				var4 = Client.cycle - var0.field1194; // L: 4068
				int var5 = var0.field1177 * 128 + var0.field1202 * 64; // L: 4069
				int var6 = var0.field1182 * 128 + var0.field1202 * 64; // L: 4070
				int var7 = var0.field1188 * 128 + var0.field1202 * 64; // L: 4071
				int var8 = var0.field1183 * 128 + var0.field1202 * 64; // L: 4072
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9; // L: 4073
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9; // L: 4074
			}

			var0.field1142 = 0; // L: 4076
			var0.orientation = var0.field1186; // L: 4077
			var0.rotation = var0.orientation; // L: 4078
		} else {
			class131.method2913(var0); // L: 4080
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4081
			var0.sequence = -1; // L: 4082
			var0.spotAnimation = -1; // L: 4083
			var0.field1194 = 0; // L: 4084
			var0.field1166 = 0; // L: 4085
			var0.x = var0.pathX[0] * 128 + var0.field1202 * 64; // L: 4086
			var0.y = var0.pathY[0] * 128 + var0.field1202 * 64; // L: 4087
			var0.method2252(); // L: 4088
		}

		if (class28.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4090 4091
			var0.sequence = -1; // L: 4092
			var0.spotAnimation = -1; // L: 4093
			var0.field1194 = 0; // L: 4094
			var0.field1166 = 0; // L: 4095
			var0.x = var0.pathX[0] * 128 + var0.field1202 * 64; // L: 4096
			var0.y = var0.pathY[0] * 128 + var0.field1202 * 64; // L: 4097
			var0.method2252(); // L: 4098
		}

		class193.method3909(var0); // L: 4101
		class259.method5188(var0); // L: 4102
	} // L: 4103
}
