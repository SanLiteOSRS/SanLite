import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2750(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2747(1, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2748(2, 0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2754(3, 0),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2751(9, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2746(4, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2752(5, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2753(6, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2749(7, 1),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2769(8, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2756(12, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2757(13, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2758(14, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2759(15, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2760(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2761(17, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2762(18, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2755(19, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2764(20, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2765(21, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2766(10, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2767(11, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	field2768(22, 3);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1136720449
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)[Lgd;",
		garbageValue = "-518638866"
	)
	static LoginPacket[] method4257() {
		return new LoginPacket[]{LoginPacket.field2342, LoginPacket.field2341, LoginPacket.field2338, LoginPacket.field2346, LoginPacket.field2339, LoginPacket.field2340};
	}
}
