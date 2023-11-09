import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("af")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1810202571
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("cp")
	@Export("otp")
	static String otp;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lex;",
		garbageValue = "-1633313603"
	)
	static class123[] method2757() {
		return new class123[]{class123.field1496, class123.field1487, class123.field1489, class123.field1490, class123.field1491}; // L: 137
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ldg;I)V",
		garbageValue = "-1336825850"
	)
	static final void method2763(PendingSpawn var0) {
		long var1 = 0L; // L: 8033
		int var3 = -1; // L: 8034
		int var4 = 0; // L: 8035
		int var5 = 0; // L: 8036
		if (var0.type == 0) { // L: 8037
			var1 = class31.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8038
			var1 = class31.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8039
			var1 = class31.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8040
			var1 = class31.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8041
			int var6 = class31.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8042
			var3 = InterfaceParent.Entity_unpackID(var1); // L: 8043
			var4 = var6 & 31; // L: 8044
			var5 = var6 >> 6 & 3; // L: 8045
		}

		var0.objectId = var3; // L: 8047
		var0.field1123 = var4; // L: 8048
		var0.field1128 = var5; // L: 8049
	} // L: 8050
}
