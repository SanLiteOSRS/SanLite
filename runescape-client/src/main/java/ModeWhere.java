import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2413("", 0, new class200[]{class200.field2401}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2405("", 1, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2406("", 2, new class200[]{class200.field2399, class200.field2402, class200.field2401}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2407("", 3, new class200[]{class200.field2399}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2409("", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2416("", 5, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2410("", 6, new class200[]{class200.field2401}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2411("", 8, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2408("", 9, new class200[]{class200.field2399, class200.field2402}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2404("", 10, new class200[]{class200.field2399}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2414("", 11, new class200[]{class200.field2399}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2415("", 12, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgy;"
	)
	field2412("", 13, new class200[]{class200.field2399});

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1536594685
	)
	@Export("id")
	final int id;
	@ObfuscatedName("q")
	final Set field2418;

	static {
		method3771();
	}

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I[Lgl;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2418 = new HashSet();
		this.id = var4;
		class200[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class200 var8 = var6[var7];
			this.field2418.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field2418 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lgy;",
		garbageValue = "-1051683174"
	)
	static ModeWhere[] method3771() {
		return new ModeWhere[]{field2411, field2407, field2404, field2408, field2409, field2414, field2412, field2415, field2406, field2413, field2410, field2405, field2416};
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "166019854"
	)
	static void method3772() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				Players.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				Players.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lfa;",
		garbageValue = "-839194319"
	)
	public static Clock method3761() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IZI)Ljava/lang/String;",
		garbageValue = "1007074370"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}
}
