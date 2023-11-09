import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class263 {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 618564155
	)
	static int field3029;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3022;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3023;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3021;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3025;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3024;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3028;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3020;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3026;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3027;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final class263 field3019;

	static {
		field3022 = new class263(5); // L: 5
		field3023 = new class263(15); // L: 6
		field3021 = new class263(5); // L: 7
		field3025 = new class263(6); // L: 8
		field3024 = new class263(2); // L: 9
		field3028 = new class263(4); // L: 10
		field3020 = new class263(14); // L: 11
		field3026 = new class263(3); // L: 12
		field3027 = new class263(4); // L: 13
		field3019 = new class263(7); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class263(int var1) {
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1634179589"
	)
	static int method5194(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 136
		return ClanChannel.NetCache_currentResponse != null && ClanChannel.NetCache_currentResponse.key == var2 ? WorldMapSection2.NetCache_responseArchiveBuffer.offset * 99 / (WorldMapSection2.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding) + 1 : 0; // L: 137 138
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2040542732"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 71
		if (var0 < 0 || var0 >= 65536) { // L: 72
			var0 >>>= 16; // L: 73
			var1 += 16; // L: 74
		}

		if (var0 >= 256) { // L: 76
			var0 >>>= 8; // L: 77
			var1 += 8; // L: 78
		}

		if (var0 >= 16) { // L: 80
			var0 >>>= 4; // L: 81
			var1 += 4; // L: 82
		}

		if (var0 >= 4) { // L: 84
			var0 >>>= 2; // L: 85
			var1 += 2; // L: 86
		}

		if (var0 >= 1) { // L: 88
			var0 >>>= 1; // L: 89
			++var1; // L: 90
		}

		return var0 + var1; // L: 92
	}
}
