import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	static ClanChannel field1851;
	@ObfuscatedName("ar")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;S)V",
		garbageValue = "-26758"
	)
	void method3593(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.method3592(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "14"
	)
	void method3592(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.persist = true; // L: 36
		}

	} // L: 39

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-648175177"
	)
	public static Object method3598(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	public static void method3601() {
		class176.archive5.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1925718940"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 64
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0; // L: 66
		var3[0] = var1; // L: 67
		int var4 = 1; // L: 68

		for (int var5 = 0; var5 < 4; ++var5) { // L: 69
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5]; // L: 71
				var3[var4] = World.World_sortOption2[var5]; // L: 72
				++var4; // L: 73
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3; // L: 77
		class181.sortWorlds(class361.World_worlds, 0, class361.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79
}
