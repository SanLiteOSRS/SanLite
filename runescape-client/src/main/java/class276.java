import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class276 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3170;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3158;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3159;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3171;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3161;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3166;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3168;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3164;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3165;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3157;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3167;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3160;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3169;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final class276 field3163;

	static {
		field3170 = new class276(4); // L: 5
		field3158 = new class276(5); // L: 6
		field3159 = new class276(6); // L: 7
		field3171 = new class276(15); // L: 8
		field3161 = new class276(4); // L: 9
		field3166 = new class276(2); // L: 10
		field3168 = new class276(7); // L: 11
		field3164 = new class276(16); // L: 12
		field3165 = new class276(8); // L: 13
		field3157 = new class276(5); // L: 14
		field3167 = new class276(14); // L: 15
		field3160 = new class276(5); // L: 16
		field3169 = new class276(7); // L: 17
		field3163 = new class276(14); // L: 18
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class276(int var1) {
	} // L: 24

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2126981871"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 624
		if (Projectile.garbageCollector == null || !Projectile.garbageCollector.isValid()) { // L: 625
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 627

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 628
					if (var2.isValid()) { // L: 630
						Projectile.garbageCollector = var2; // L: 631
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 632
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 633
					}
				}
			} catch (Throwable var11) { // L: 638
			}
		}

		if (Projectile.garbageCollector != null) { // L: 640
			long var9 = Message.method1197(); // L: 641
			long var3 = Projectile.garbageCollector.getCollectionTime(); // L: 642
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 643
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 644
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 645
				if (0L != var7) { // L: 646
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 648
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 649
		}

		return var0; // L: 651
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lbs;IIB)V",
		garbageValue = "-92"
	)
	static final void method5485(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8971
			WorldMapData_0.method4844(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field904, var0.field903, var0.action, var1, var2); // L: 8972
		}

	} // L: 8974
}
