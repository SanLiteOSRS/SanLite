import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class225 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2679;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2674;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2673;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2678;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2675;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2687;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2677;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2680;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2681;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	public static final class225 field2682;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1822029477
	)
	static int field2686;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field2684;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 757970751
	)
	static int field2676;

	static {
		field2679 = new class225(15);
		field2674 = new class225(7);
		field2673 = new class225(2);
		field2678 = new class225(5);
		field2675 = new class225(14);
		field2687 = new class225(3);
		field2677 = new class225(5);
		field2680 = new class225(4);
		field2681 = new class225(4);
		field2682 = new class225(6);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	class225(int var1) {
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Lji;Ljava/lang/String;I)V",
		garbageValue = "-1074413035"
	)
	static void method4300(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field893 += var2.groupCount;
	}
}
