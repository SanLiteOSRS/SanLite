import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "1724042479"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lcm;B)V",
		garbageValue = "0"
	)
	static final void method2809(PendingSpawn var0) {
		long var1 = 0L; // L: 8010
		int var3 = -1; // L: 8011
		int var4 = 0; // L: 8012
		int var5 = 0; // L: 8013
		if (var0.type == 0) { // L: 8014
			var1 = ReflectionCheck.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8015
			var1 = ReflectionCheck.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8016
			var1 = ReflectionCheck.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ReflectionCheck.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 8017
		}

		if (var1 != 0L) { // L: 8018
			int var6 = ReflectionCheck.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8019
			var3 = Occluder.Entity_unpackID(var1); // L: 8020
			var4 = var6 & 31; // L: 8021
			var5 = var6 >> 6 & 3; // L: 8022
		}

		var0.objectId = var3; // L: 8024
		var0.field1166 = var4; // L: 8025
		var0.field1175 = var5; // L: 8026
	} // L: 8027
}
