import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -18074541
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1542458359
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -446870673
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1628059522"
	)
	public static int method4704(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 69
		int var1 = (int)(var2 >>> 0 & 127L); // L: 71
		return var1; // L: 73
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lcl;",
		garbageValue = "-285053165"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return Interpreter.getNextWorldListWorld(); // L: 248
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1232964320"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 93
		if (var3) { // L: 94
			var5 |= 65536L;
		}

		return var5; // L: 95
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "858932471"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 86
		if (var1 == null) { // L: 87
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 88 89
		}
	}
}
