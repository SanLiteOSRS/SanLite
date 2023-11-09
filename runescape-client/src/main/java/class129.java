import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class129 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgz;",
		garbageValue = "27"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 76
		if (var1 != null) { // L: 77
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 78
			var1 = new NPCComposition(); // L: 79
			var1.id = var0; // L: 80
			if (var2 != null) { // L: 81
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 82
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 83
			return var1; // L: 84
		}
	}
}
