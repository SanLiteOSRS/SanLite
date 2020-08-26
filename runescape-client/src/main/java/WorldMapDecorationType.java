import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2760(0, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2759(1, 0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2763(2, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2757(3, 0),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2761(9, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2767(4, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2769(5, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2764(6, 1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2765(7, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2758(8, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2771(12, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2768(13, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2762(14, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2770(15, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2766(16, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2772(17, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2773(18, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2774(19, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2780(20, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2776(21, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2777(10, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2778(11, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2779(22, 3);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 212530535
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
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
}
