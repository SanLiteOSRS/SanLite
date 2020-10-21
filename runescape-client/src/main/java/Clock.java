import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "345512591"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-837141414"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljn;",
		garbageValue = "-1793250808"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "34"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field428 == KeyHandler.field415) {
				return false;
			} else {
				SecureRandomCallable.field555 = KeyHandler.field425[KeyHandler.field415];
				WorldMapManager.field335 = KeyHandler.field424[KeyHandler.field415];
				KeyHandler.field415 = KeyHandler.field415 + 1 & 127;
				return true;
			}
		}
	}
}
