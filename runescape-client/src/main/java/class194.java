import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class194 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2371;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2362;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2363;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2370;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2365;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2366;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2364;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2368;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2361;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final class194 field2367;

	static {
		field2371 = new class194(5);
		field2362 = new class194(4);
		field2363 = new class194(3);
		field2370 = new class194(5);
		field2365 = new class194(4);
		field2366 = new class194(14);
		field2364 = new class194(15);
		field2368 = new class194(6);
		field2361 = new class194(7);
		field2367 = new class194(2);
	}

	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "5"
	)
	class194(int var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IS)Ljava/lang/String;",
		garbageValue = "4096"
	)
	static final String method3712(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}
}
