import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2761(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2745(1, 0),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2746(2, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2747(3, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2748(9, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2753(4, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2744(5, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2751(6, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2752(7, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2756(8, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2754(12, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2765(13, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2762(14, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2757(15, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2758(16, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2759(17, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2749(18, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2760(19, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2750(20, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2763(21, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2764(10, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2755(11, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	field2766(22, 3);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1564744229
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
