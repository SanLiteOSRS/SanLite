import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class248 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lev;",
		garbageValue = "16"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1168533546"
	)
	static int method4915(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return class34.NetCache_currentResponse != null && var2 == class34.NetCache_currentResponse.key ? class254.NetCache_responseArchiveBuffer.offset * 99 / (class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1373546761"
	)
	static final void method4916() {
		Client.field882 = Client.cycleCntr;
		class26.ClanChat_inClanChat = true;
	}
}
